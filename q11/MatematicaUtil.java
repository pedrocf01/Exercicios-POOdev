public class MatematicaUtil {

    public static double calcularQuadrado(double n) {
        return n * n;
    }

    public static double calcularCubo(double n) {
        return n * n * n;
    }

    public static double raizQuadrada(double n) {
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        double n = 16;

        System.out.println("Quadrado de " + n + ": " + calcularQuadrado(n));
        System.out.println("Cubo de " + n + ": " + calcularCubo(n));
        System.out.println("Raiz quadrada de " + n + ": " + raizQuadrada(n));
    }
}
