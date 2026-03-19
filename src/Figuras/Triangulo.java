package Figuras;

public class Triangulo extends GestorFiguras implements Figuras {

    /**Atributo del triangulo**/
    private final double base;

    /**Atributo del triangulo**/
    private final double altura;

    /**Atributo del triangulo**/
    private final double lado1;

    /**Atributo del triangulo**/
    private final double lado2;

    /**Atributo del triangulo**/
    private final double lado3;

    /**Constructor del triangulo**/
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**Metodo implementado de la figura**/
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    /**Metodo implementado de la figura**/
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    /**Metodo implementado de la figura**/
    @Override
    public void dibujar() {
        System.out.println("Dibujando triangulo");
    }
}