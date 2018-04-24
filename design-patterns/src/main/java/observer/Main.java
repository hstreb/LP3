package observer;

public class Main {
	public static void main(String[] args) {
		Quadro quadro = new Quadro();
		new Janisval(quadro);
		
		quadro.escrever("faustop na tv");
		quadro.escrever("equinos do filo cordata");
	}
}
