abstract class FormaGeometrica {
    public abstract double calcularArea();
}

class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}

class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return 3.14 * raio * raio;
    }
}

public class Formas{
    public static void main(String[] args) {
        FormaGeometrica quadrado = new Quadrado(4);
        FormaGeometrica circulo = new Circulo(3);

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}
