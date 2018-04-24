package observer;

public class Janisval extends SerHumaninho{

	public Janisval(Quadro quadro) {
		this.quadro = quadro;
		quadro.adicionar(this);
	}
	
	@Override
	public void visualizar() {
		System.out.println("Janisval bisoiou " + quadro.getTexto());
		System.out.println("Janisval -> haaaaa, peguei tu...");
	}

}
