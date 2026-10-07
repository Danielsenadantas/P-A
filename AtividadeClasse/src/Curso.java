public class Curso {

    private int codigo;
    private String nome;
    private int duracao;

    public Curso(int codigo, String nome, int duracao) {
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
    }

    public void exibirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Duração: " + duracao + " anos");
    }
}