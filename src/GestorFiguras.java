import java.util.ArrayList;

public class GestorFiguras {

    private final ArrayList<Object> figuras;

    public GestorFiguras() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(Object figura) {
        figuras.add(figura);
    }

    public void mostrarAreas() {

        for (Object figura : figuras) {

            // horrible uso de instanceof
            if (figura instanceof Circulo) {
                Circulo circulo = (Circulo) figura;
                System.out.println("Area circulo: " + circulo.calcularArea());
            }

            if (figura instanceof Rectangulo) {
                Rectangulo rectangulo = (Rectangulo) figura;
                System.out.println("Area rectangulo: " + rectangulo.calcularArea());
            }

            if (figura instanceof Triangulo) {
                Triangulo triangulo = (Triangulo) figura;
                System.out.println("Area triangulo: " + triangulo.calcularArea());
            }
        }
    }

    public void mostrarPerimetros() {

        for (Object figura : figuras) {

            if (figura instanceof Circulo) {
                Circulo circulo = (Circulo) figura;
                System.out.println("Perimetro circulo: " + circulo.calcularPerimetro());
            }

            if (figura instanceof Rectangulo) {
                Rectangulo rectangulo = (Rectangulo) figura;
                System.out.println("Perimetro rectangulo: " + rectangulo.calcularPerimetro());
            }

            if (figura instanceof Triangulo) {
                Triangulo triangulo = (Triangulo) figura;
                System.out.println("Perimetro triangulo: " + triangulo.calcularPerimetro());
            }
        }
    }

    public void dibujarTodo() {

        for (Object figura : figuras) {

            if (figura instanceof Circulo) {
                ((Circulo) figura).dibujar();
            }

            if (figura instanceof Rectangulo) {
                ((Rectangulo) figura).dibujar();
            }

            if (figura instanceof Triangulo) {
                ((Triangulo) figura).dibujar();
            }
        }
    }
}