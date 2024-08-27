
class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException(String mensagem) {
        super(mensagem);
    }
}


public class Divisao {

    public static double dividir(int numerador, int denominador) throws DivisaoPorZeroException {
        if (denominador == 0) {
            throw new DivisaoPorZeroException("Não é possível dividir por zero.");
        }
        return (double) numerador / denominador;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Resultado da divisão: " + dividir(10, 2));
            System.out.println("Resultado da divisão: " + dividir(10, 0));
            
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
