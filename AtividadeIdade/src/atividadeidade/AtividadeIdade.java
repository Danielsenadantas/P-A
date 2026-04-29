/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeidade;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class AtividadeIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int nasc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite ano de nascimento"));
         int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite ano atual"));
         int R; 
         R = ano - nasc;
         if (18 <= R){
             System.out.println("voce eh maior de idade");
             JOptionPane.showMessageDialog(null, "vc eh maior de idade" );
         }
         else
         { System.out.println("voce nao eh maior de idade");    
         JOptionPane.showMessageDialog(null, "vc eh menor de idade" );}
         
                 
             
         
         
        // TODO code application logic here
    }
    
}
