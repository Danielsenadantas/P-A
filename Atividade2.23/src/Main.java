import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 1 numero"));
        if (A == 0) {
            System.out.println("o numero é 0");
        }else{ if(A % 2 == 0){
            System.out.println(" o numero é par");}
                else{ System.out.println("o numero é impar");}
            if (A > 0){
                System.out.println("o numero é positivo");
            }else{
                System.out.println("o numero é negativo");}







    }
}}