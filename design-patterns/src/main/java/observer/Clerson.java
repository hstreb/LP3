package observer;

public class Clerson extends SerHumaninho {

	public Clerson(Quadro quadro) {
		this.quadro = quadro;
		quadro.adicionar(this);
	}
	
	@Override
	public void visualizar() {
		System.out.println("Clerson visualizou o " + quadro.getTexto());
	}

}
