/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calc;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 0;
         int B = 0;
        int i = 0;
         while(i < 21)
         {   B = A % 2;       
          if (B == 0  )
          {System.out.println("Esse numero eh par "+ A);}

        
         
         
         A = A + 1;
         i++;
        
    }
    
}
}