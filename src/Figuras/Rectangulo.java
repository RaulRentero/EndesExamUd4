package Figuras;

public class Rectangulo extends GestorFiguras implements Figuras {

    /**Atributo del rectangulo**/
    private final double ancho;

    /**Atributo del rectangulo**/
    private final double alto;

    /**Constructor del rectangulo**/
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /**Metodo implementado de la figura**/
    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    /**Metodo implementado de la figura**/
    @Override
    public double calcularPerimetro() {
        return 2 * ancho + 2 * alto;
    }

    /**Metodo implementado de la figura**/
    @Override
    public void dibujar() {
        System.out.println("Dibujando rectangulo " + ancho + "x" + alto);
    }
}