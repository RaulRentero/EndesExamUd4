package Figuras;

public class Circulo extends GestorFiguras implements Figuras {

    /**Atributo del cirulo**/
    public static final double PI = 3.1416;

    /**Atributo del cirulo**/
    private final double radio;

    /**Constructor del circulo**/
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**Metodo implementado de la figura**/
    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    /**Metodo implementado de la figura**/
    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    /**Metodo implementado de la figura**/
    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo de radio " + radio);
    }
}