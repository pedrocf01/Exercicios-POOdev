import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    private String id;
    private String nome;
    private String cargo;

    public Funcionario(String id, String nome, String cargo) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Cargo: " + cargo;
    }
}


public class Funcionarios {
    private ArrayList<Funcionario> funcionarios;

    public Funcionarios() {
        funcionarios = new ArrayList<>();
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String id) {
        for (int i = 0; i < funcionarios.size(); i++) {
           if (funcionarios.get(i).getId().equals(id)) {
               funcionarios.remove(i);
               System.out.println("Funcionário removido com sucesso.");
               return;
           }
        }
        System.out.println("Funcionário não encontrado.");
    }

    public void atualizarFuncionario(String id, String nome, String cargo) {
        for (Funcionario f : funcionarios) {
            if (f.getId().equals(id)) {
                f.setNome(nome);
                f.setCargo(cargo);
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionarios sistema = new Funcionarios();
        
        while (true) {
            System.out.println("\n1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Atualizar Funcionário");
            System.out.println("4. Listar Funcionários");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            
            System.out.println();
            scanner.nextLine();

            switch (opcao) {
                
                case 1:
                    System.out.print("Digite o ID do funcionário: ");
                    String id = scanner.nextLine();
                    System.out.print("Digite o nome do funcionário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o cargo do funcionário: ");
                    String cargo = scanner.nextLine();
                    Funcionario funcionario = new Funcionario(id, nome, cargo);
                    sistema.addFuncionario(funcionario);
                    System.out.println("Funcionário adicionado com sucesso.");
                    break;
                    
                case 2:
                    System.out.print("Digite o ID do funcionário a ser removido: ");
                    id = scanner.nextLine();
                    sistema.removerFuncionario(id);
                    break;
                    
                case 3:
                    System.out.print("Digite o ID do funcionário a ser atualizado: ");
                    id = scanner.nextLine();
                    System.out.print("Digite o novo nome do funcionário: ");
                    nome = scanner.nextLine();
                    System.out.print("Digite o novo cargo do funcionário: ");
                    cargo = scanner.nextLine();
                    sistema.atualizarFuncionario(id, nome, cargo);
                    break;
                    
                case 4:
                    System.out.println("Lista de Funcionários:");
                    sistema.listarFuncionarios();
                    break;
                    
                case 5:
                    System.out.println("Saindo do sistema.");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
