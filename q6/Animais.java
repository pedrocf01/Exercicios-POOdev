class Animal {
    public void emitirSom() {
        System.out.println("Som de animal");
    }
}

class Cachorro extends Animal{
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal{
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

public class Animais{
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
