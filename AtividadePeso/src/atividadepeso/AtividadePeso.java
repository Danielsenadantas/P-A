/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadepeso;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class AtividadePeso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sexo = JOptionPane.showInputDialog(null, "Digite seu sexo");
        
        double R;
        String masculino, feminino;
        double alt = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura"));
   if (sexo.equals(  "masculino") ){
       R =(72.7 * alt) - 58;
       System.out.println("voce eh homem");
       System.out.println("seu peso ideal eh "+ R);
    } else if (sexo.equals( "feminino")){
   R = (62.1 * alt) - 44.7;
   System.out.println("voce eh mulher");
   System.out.println("seu peso ideal eh "+ R);
            }
    }
    
}
