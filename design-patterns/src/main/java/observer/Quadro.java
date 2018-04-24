package observer;

import java.util.ArrayList;
import java.util.List;

public class Quadro {

	private List<SerHumaninho> serHumaninhos = new ArrayList<>();
	private String texto;

	public String getTexto() {
		return texto;
	}

	public void escrever(String texto) {
		this.texto = texto;
		notificar();
	}

	public void adicionar(SerHumaninho serHumaninho) {
		serHumaninhos.add(serHumaninho);
	}

	public void notificar() {
		serHumaninhos.forEach(s -> s.visualizar());
	}
}
