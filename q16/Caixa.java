import java.util.ArrayList;

public class Caixa<T> {
    private ArrayList<T> itens;

    public Caixa() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(T item) {
        itens.add(item);
    }

    public boolean removerItem(T item) {
        return itens.remove(item);
    }

    public ArrayList<T> getItens() {
        return new ArrayList<>(itens);
    }

    
    public static void main(String[] args) {
        Caixa<String> caixa1 = new Caixa<>();
        caixa1.adicionarItem("Batata");
        caixa1.adicionarItem("Cenoura");
        caixa1.adicionarItem("Nabo");

        System.out.println("Itens na caixa de legumes:");
        for (String legume : caixa1.getItens()) {
            System.out.println(legume);
        }

        caixa1.removerItem("Cenoura");

        System.out.println("\nItens na caixa após remoção:");
        for (String legume : caixa1.getItens()) {
            System.out.println(legume);
        }

        Caixa<Integer> caixa2 = new Caixa<>();
        caixa2.adicionarItem(1);
        caixa2.adicionarItem(2);
        caixa2.adicionarItem(3);

        System.out.println("\nItens na caixa de números:");
        for (Integer numero : caixa2.getItens()) {
            System.out.println(numero);
        }
    }
}
