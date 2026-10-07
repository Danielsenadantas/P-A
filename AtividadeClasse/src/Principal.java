import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {


        int matricula = Integer.parseInt(
                JOptionPane.showInputDialog("Digite a matrícula do aluno:")
        );

        String nomeAluno = JOptionPane.showInputDialog(
                "Digite o nome do aluno:"
        );

        int idade = Integer.parseInt(
                JOptionPane.showInputDialog("Digite a idade do aluno:")
        );


        Aluno aluno = new Aluno(matricula, nomeAluno, idade);



        int codigo = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o código do curso:")
        );

        String nomeCurso = JOptionPane.showInputDialog(
                "Digite o nome do curso:"
        );

        int duracao = Integer.parseInt(
                JOptionPane.showInputDialog("Digite a duração do curso:")
        );

        Curso curso = new Curso(codigo, nomeCurso, duracao);



        JOptionPane.showMessageDialog(
                null,
                "=== DADOS DO ALUNO ===\n" +
                        "Matrícula: " + matricula + "\n" +
                        "Nome: " + nomeAluno + "\n" +
                        "Idade: " + idade
        );

        JOptionPane.showMessageDialog(
                null,
                "=== DADOS DO CURSO ===\n" +
                        "Código: " + codigo + "\n" +
                        "Nome: " + nomeCurso + "\n" +
                        "Duração: " + duracao + " anos"
        );

        JOptionPane.showMessageDialog(
                null,
                "Aluno matriculado no curso: " + nomeCurso
        );
    }
}