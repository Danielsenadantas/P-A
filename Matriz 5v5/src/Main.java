//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] [] A = {
                {4, 4, 5, 3, 7},
                {8, 8, 6, 1, 9},
                {2, 7, 4, 3, 8},
                {6, 5, 2, 1, 4},
                {6, 8, 3, 5, 9}

        };
        int [] [] B = {
                {2, 4, 1, 3, 7},
                {4, 2, 3, 8, 9},
                {1, 7, 7, 3, 6},
                {3, 1, 2, 1, 4},
                {3, 4, 9, 5, 5}

        };

        int [] [] C = new int [5][5];
        int [] [] D = new int [5][5];
        int [] [] E = new int [5][5];


        for (int i = 0; i < 5; i++) {


            for (int j = 0; j < 5; j++) {


                C[i][j] = A[i][j] - B[i][j];
                D[i][j] = A[i][j] + B[i][j];
                B[i][j] = A[i][j] / B[i][j];

            }
        }
        System.out.println("\nMatriz A:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nMatriz B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nResultado da Subtração:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nResultado da Adição:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(D[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nResultado da Divisão");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(E[i][j] + "\t");
            }
            System.out.println();
        }}}