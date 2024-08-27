public class Produto {
 
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public void exibirInfo() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + qtdEstoque );
        System.out.println();
    }

   
    public static void main(String[] args) {
     
        Produto produto1 = new Produto("Notebook", 3500, 10);
        Produto produto2 = new Produto("|TV", 2500, 5);
        Produto produto3 = new Produto("Celular", 50, 100);

        produto1.exibirInfo();
        produto2.exibirInfo();
        produto3.exibirInfo();
    }
}
