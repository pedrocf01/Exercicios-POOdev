public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }

    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 21);
        p1.exibirInfo();
    }
}


