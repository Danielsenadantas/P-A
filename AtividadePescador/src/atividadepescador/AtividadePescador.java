/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadepescador;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class AtividadePescador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double R;
        double pesoex;
           double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite peso dos peixes "));
          if (peso <= 50) System.out.println(" não possui peso excedente");
    else if (peso > 50) {
    pesoex = peso - 50;
    R = 4 * pesoex;
    System.out.println("Sua multa é "+ R);}

}
}
