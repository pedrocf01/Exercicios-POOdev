import java.util.ArrayList;

class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota: " + nota);
    }
}

public class Escola {
    private ArrayList<Aluno> alunos;

    public Escola() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirAlunos() {
        for (Aluno aluno : alunos) {
            aluno.exibirInfo();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Escola escola = new Escola();

        Aluno aluno1 = new Aluno("Pedro", "1234", 6.5);
        Aluno aluno2 = new Aluno("Maria", "4321", 9.0);
        Aluno aluno3 = new Aluno("João", "2143", 7.5);

        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarAluno(aluno3);

        escola.exibirAlunos();
    }
}
