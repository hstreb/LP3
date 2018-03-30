package br.org.fundatec.ti11app.viagem;

import br.org.fundatec.ti11app.motorista.MotoristaService;
import br.org.fundatec.ti11app.passageiro.PassageiroService;
import exemplo.Motorista;

public class ViagemService {
	private ViagemDao viagemDao;
	private MotoristaService motoristaService;
	private PassageiroService passageiroService;

	public ViagemService(ViagemDao viagemDao) {
		this.viagemDao = viagemDao;
	}
	
	public Viagem buscarViagemPassageiroPorNome(String nomePassageiro) {
		return viagemDao.pegaViagemPeloNomePassageiro(nomePassageiro).get();
	}
	
	public void adicionaViagem(ViagemDTO dto) {
		// TODO adicionar regras para salvar Viagem
//		viagemDao.adiciona(viagem);
	}
}
