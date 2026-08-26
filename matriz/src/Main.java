import javax.swing.JOptionPane;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Declaração da primeira matriz A (2x2)
        int[][] A = new int[2][4];
        int[][] B = new int[4][2];
        int[][] C = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                String input = JOptionPane.showInputDialog(
                        null,
                        "Matriz B (4x2)\nDigite o elemento [" + i + "][" + j + "]:");
                A[i][j] = Integer.parseInt(input);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(
                        null,
                        "Matriz B (4x2)\nDigite o elemento [" + i + "][" + j + "]:");


                B[i][j] = Integer.parseInt(input);
            }}

        // Realiza a multiplicação das matrizes
        // Regra: linha da matriz A × coluna da matriz B
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 4; k++) {

                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Exibe a matriz A
        System.out.println("Matriz A:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibe a matriz B
        System.out.println("\nMatriz B:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibe a matriz resultante C
        System.out.println("\nMatriz C = A x B:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
