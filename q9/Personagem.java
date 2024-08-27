interface Movimentavel {
    void mover();
}

interface Desenhavel {
    void desenhar();
}


public class Personagem implements Movimentavel, Desenhavel {

    public void mover() {
        System.out.println("Movendo personagem");
    }

    public void desenhar() {
        System.out.println("Desenhando personagem");
    }

    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        personagem.desenhar();
        personagem.mover();
    }
}
