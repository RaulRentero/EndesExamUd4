public class Circulo extends GestorFiguras implements Figuras {

    public static final double PI = 3.1416;
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    public void dibujar() {
        System.out.println("Dibujando circulo de radio " + radio);
    }
}