/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package senha;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Senha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String senha1 = (JOptionPane.showInputDialog(null, "Digite senha "));
        String senha2 = "abcd";
        
        if (senha1.equals(senha2)); {
            System.out.println("sua senha esta correta");
        }
        else  {
        System.out.println("sua senha esta errada");
                }
    
}
}