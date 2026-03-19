package Figuras;

public class Circulo extends GestorFiguras implements Figuras {

    //Atributos del cirulo//
    public static final double PI = 3.1416;
    private final double radio;

    //Constructor del circulo//
    public Circulo(double radio) {
        this.radio = radio;
    }

    //Metodos implementados de la figura//

    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo de radio " + radio);
    }
}