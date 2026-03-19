public class Triangulo extends GestorFiguras implements Figuras {

    private final double base;
    private final double altura;
    private final double lado1;
    private final double lado2;
    private final double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public void dibujar() {
        System.out.println("Dibujando triangulo");
    }
}