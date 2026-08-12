//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Declaração da matriz A de ordem 2x2
        int [] [] A = {
                {2, 4},
                {6, 8}
        };
        //Declaração da matriz B de ordem 2x2
        int [] [] B = {
                {1, 3},
                {5, 7}
        };
        //Declaração da matriz C, que armazenará o resultado
        int [] [] C = new int [2][2];
        //Percorre as linhas da matriz
        for (int i = 0; i < 2; i++) {
            //Percorre as colunas da matriz

            for (int j = 0; j < 2; j++) {
                //Soma os elementos correspondentes

                C[i][j] = A[i][j] + B[i][j];
            }
        }
            System.out.println("Matriz A:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println(A[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("Matriz B:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println(B[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("Matriz C:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println(C[i][j] + "\t");
                }
                System.out.println();
            }
        }}