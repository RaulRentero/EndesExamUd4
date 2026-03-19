package Figuras;

import java.util.ArrayList;

public class GestorFiguras {
    //Clase padre que gestiona a las figuras//

    private final ArrayList<Object> figuras;

    //constructor//
    public GestorFiguras() {
        figuras = new ArrayList<>();
    }

    //Agrega una figura a un Array List//
    public void agregarFigura(Object figura) {
        figuras.add(figura);
    }

    //Imprime el area de las figuras en la lista//
    public void mostrarAreas() {

        for (Object figura : figuras) {

            if (figura instanceof Circulo circulo) {
                System.out.println("Area circulo: " + circulo.calcularArea());
            }

            if (figura instanceof Rectangulo rectangulo) {
                System.out.println("Area rectangulo: " + rectangulo.calcularArea());
            }

            if (figura instanceof Triangulo triangulo) {
                System.out.println("Area triangulo: " + triangulo.calcularArea());
            }
        }
    }

    //Imprime el perimetro de las figuras de la lista//
    public void mostrarPerimetros() {

        for (Object figura : figuras) {

            if (figura instanceof Circulo circulo) {
                System.out.println("Perimetro circulo: " + circulo.calcularPerimetro());
            }

            if (figura instanceof Rectangulo rectangulo) {
                System.out.println("Perimetro rectangulo: " + rectangulo.calcularPerimetro());
            }

            if (figura instanceof Triangulo triangulo) {
                System.out.println("Perimetro triangulo: " + triangulo.calcularPerimetro());
            }
        }
    }

    //Dibuja todas las figuras de una lista//
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