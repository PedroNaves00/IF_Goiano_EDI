public class Pessoa {
    private String id;
    private int idade;
    private boolean gestante;
    private boolean lactante;
    private boolean necessidadeEspecial;
    private int prioridade;

    public Pessoa(String id, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial, int prioridade) {
        this.id = id;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
        this.prioridade = prioridade;
    }

    public String getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isGestante() {
        return gestante;
    }

    public boolean isLactante() {
        return lactante;
    }

    public boolean isNecessidadeEspecial() {
        return necessidadeEspecial;
    }

    public int getPrioridade() {
        return prioridade;
    }
}