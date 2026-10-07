public class Aluno {

    private int matricula;
    private String nome;
    private int idade;

    public Aluno(int matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
