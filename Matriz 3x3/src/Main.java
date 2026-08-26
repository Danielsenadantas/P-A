import javax.swing.*;
public class Main {
    public static void main(String[] args) {


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



                int[][] A = new int[3][3];
                int[][] B = new int[3][3];
                int[][] C = new int[3][3];
                int[][] D = new int[3][3];
                double[][] E = new double[3][3];

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        String input = JOptionPane.showInputDialog(
                                null,
                                "Matriz A (3x3)\nDigite o elemento [" + i + "][" + j + "]:");
                        A[i][j] = Integer.parseInt(input);
                    }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        String input = JOptionPane.showInputDialog(
                                null,
                                "Matriz B (3x3)\nDigite o elemento [" + i + "][" + j + "]:");


                        B[i][j] = Integer.parseInt(input);
                    }
                }

                for (int i = 0; i < 3; i++) {

                    for (int j = 0; j < 3; j++) {

                        C[i][j] += A[i][j] - B[i][j];
                        D[i][j] += A[i][j] + B[i][j];
                        E[i][j] += A[i][j] / B[i][j];
                    }
                }
                System.out.println("\nMatriz A:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(A[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("\nMatriz B:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(B[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("\nResultado da Subtração:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(C[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("\nResultado da Adição:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(D[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("\nResultado da Divisão");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(E[i][j] + "\t");
                    }
                    System.out.println();
                }

            }}
