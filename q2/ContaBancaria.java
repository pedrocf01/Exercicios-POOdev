public class ContaBancaria {
   
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("\nR$" + valor + " foram depositados.");
        } else {
            System.out.println("Valor inválido.\n");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("\nR$" + valor + " foram sacados.");
        } else {
            System.out.println("Saldo insuficiente para este saque.\n");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria(1000.0);

        conta.consultarSaldo();
        conta.depositar(500.0);
        conta.consultarSaldo();
        conta.sacar(300.0);
        conta.consultarSaldo();
        conta.sacar(1500.0); 
        conta.consultarSaldo();
    }
}

