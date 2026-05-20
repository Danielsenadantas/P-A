/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite numero desejado para ver sua tabuada"));
       int i = 0;
       int B = 0;
       int C = 0;
       while (i < 10) {
           C = A * B;
           System.out.println(A + " vezes " + B + " eh igual a " + C);
           B = B + 1;
           i++;
       }
    }
    
}
