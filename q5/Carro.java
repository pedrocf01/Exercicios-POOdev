class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
   
}


public class Carro extends Veiculo {
    private int numeroPortas;
    private boolean eAutomatico;

    public Carro(String marca, String modelo, int numeroPortas, boolean eAutomatico) {
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
        this.eAutomatico = eAutomatico;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("Automático: " + (eAutomatico ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 4, true);
        carro.exibirDetalhes();
    }
}
