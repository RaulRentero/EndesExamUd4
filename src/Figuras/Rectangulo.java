package Figuras;

public class Rectangulo extends GestorFiguras implements Figuras {

    //Atributos del rectangulo//
    private final double ancho;
    private final double alto;

    //Constructor del rectangulo//
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    //Metodos implementados de la figura//

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * ancho + 2 * alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando rectangulo " + ancho + "x" + alto);
    }
}