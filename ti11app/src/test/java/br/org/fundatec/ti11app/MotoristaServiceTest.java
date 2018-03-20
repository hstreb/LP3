package br.org.fundatec.ti11app;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/*
 * Encontrar motorista
 * Calcular o valor ganho
 */
public class MotoristaServiceTest {

    private MotoristaService motoristaService;

    private List<Passageiro> passageiros = Arrays.asList(new Passageiro("outrociclano", 5.0, 25, LocalDate.of(2018, 1, 2)));
    private Motorista ciclano = new Motorista("ciclano", passageiros);
    private Motorista fulano = new Motorista("fulano", Collections.emptyList());

    @Before
    public void init() {
        CalculadoraValores calculadora = mock(CalculadoraValores.class);
        when(calculadora.calcularValorMotorista(ciclano, LocalDate.of(2018, 1, 1), LocalDate.of(2018, 1, 31))).thenReturn(10.0);
        motoristaService = new MotoristaService(calculadora);
    }

    @Test
    public void testCalcularValorevido() {
        double result = motoristaService.calcularValorDevido("fulano", LocalDate.of(2017, 1, 1), LocalDate.of(2017, 1, 31));
        assert result == 0.0;
    }

    @Test
    public void deveRetornarDez(){
        double result = motoristaService.calcularValorDevido("ciclano", LocalDate.of(2018, 1, 1), LocalDate.of(2018, 1, 31));
        assert result == 10.0;
    }

    @Test
    public void aaa (){
        double result = motoristaService.calcularValorDevido("ciclano", LocalDate.of(2018, 2, 1), LocalDate.of(2018, 2, 28));
        assert result == 0.0;
    }
}