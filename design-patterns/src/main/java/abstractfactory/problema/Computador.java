package abstractfactory.problema;

public class Computador {
    private String modelo = "Os velhos";

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "modelo='" + modelo + '\'' +
                '}';
    }
}
