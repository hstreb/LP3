package br.org.fundatec.ti11app;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/*
 * Encontrar motorista
 * Calcular o valor ganho
 */
public class MotoristaServiceTest {

    private MotoristaService motoristaService;

    private List<Viagem> Viagems = Arrays.asList(new Viagem("outrociclano", 5.0, 25, LocalDate.of(2018, 1, 2)));
    private Motorista ciclano = new Motorista("ciclano", Viagems);

    @Before
    public void init() {
        CalculadoraValores calculadora = mock(CalculadoraValores.class);
        when(calculadora.calcularValorMotorista(ciclano, LocalDate.of(2018, 1, 1), LocalDate.of(2018, 1, 31))).thenReturn(10.0);

        MotoristaDao motoristaDao = mock(MotoristaDao.class);
        when(motoristaDao.buscarPorNome(ciclano.getNome())).thenReturn(Optional.of(ciclano));
        when(motoristaDao.buscarPorNome("fulano")).thenReturn(Optional.empty());

        motoristaService = new MotoristaService(motoristaDao, calculadora);
    }

    @Test
    public void deveRetornarZeroParaMotoristaNaoEncontrado() {
        Double result = motoristaService.calcularValorAReceber("fulano", LocalDate.of(2017, 1, 1), LocalDate.of(2017, 1, 31));
        Double esperado = 0.0;
        assertEquals(esperado, result);
    }

    @Test
    public void deveRetornarDezQuandoTransportouViagem(){
        Double result = motoristaService.calcularValorAReceber("ciclano", LocalDate.of(2018, 1, 1), LocalDate.of(2018, 1, 31));
        Double esperado = 10.0;
        assertEquals(esperado, result);
    }

    @Test
    public void deveRetornarZeroParaMotoristaQueNaoTransportouNinguem(){
        double result = motoristaService.calcularValorAReceber("ciclano", LocalDate.of(2018, 2, 1), LocalDate.of(2018, 2, 28));
        assert result == 0.0;
    }
}