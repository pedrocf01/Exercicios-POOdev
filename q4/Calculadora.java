public class Calculadora {

    public int adicionar(int a, int b) {
        return a + b;
    }

    public int adicionar(int a, int b, int c) {
        return a + b + c;
    }
    
    public int subtrair(int a, int b) {
        return a - b;
    }

    public int subtrair(int a, int b, int c) {
        return a - b - c;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Adição:");
        System.out.println(calc.adicionar(10, 5));
        System.out.println(calc.adicionar(10, 5, 2));

        System.out.println("\nSubtração:");
        System.out.println(calc.subtrair(10, 5));
        System.out.println(calc.subtrair(10, 5, 2));
       

        System.out.println("\nMultiplicação:");
        System.out.println(calc.multiplicar(10, 5));
        System.out.println(calc.multiplicar(10, 5, 2));

        System.out.println("\nDivisão:");
        System.out.println(calc.dividir(10, 5));
        System.out.println(calc.dividir(10.5, 5.5));
    }
}
