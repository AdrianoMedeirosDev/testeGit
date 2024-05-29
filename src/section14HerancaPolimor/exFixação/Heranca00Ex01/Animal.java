package section14HerancaPolimor.exFixação.Heranca00Ex01;

// Classe base Animal
class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void falar() {
        System.out.println("O animal faz um som");
    }

    public void correr() {
        System.out.println("Animal corre!");
    }
}

/* Classe derivada Cachorro
class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    // Override do método falar
    public void falar() {
        System.out.println("O cachorro late");
    }

    // Método específico do Cachorro
    public void correr() {
        System.out.println("O cachorro corre");
    }
}

// Classe derivada Gato
class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    // Override do método falar
    public void falar() {
        System.out.println("O gato mia");
    }

    // Método específico do Gato
    private void arranhar() {
        System.out.println("O gato arranha");
    }
}

// Classe principal para testar as classes
public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro("Rex");
        Animal meuGato = new Gato("Tom");

        // Chama o método falar para os dois animais
        meuCachorro.falar();
        meuGato.falar();

        // Chama o método específico do Cachorro
        meuCachorro.correr(); // ERRO! Este método não existe para a classe Animal.

        // Chama o método específico do Gato
        meuGato.arranhar(); // ERRO! Este método também não existe para a classe Animal.
    }
}
*/