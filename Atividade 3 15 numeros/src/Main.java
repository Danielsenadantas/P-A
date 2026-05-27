import javax.swing.JOptionPane;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int b = 0;

        while (i <= 15) {
            int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 numero"));
            if (A > 30) {

                b = b + 1;
                //verifica se a condição e verdadeira e caso seja aumenta 1 valor sendo se o numero é maior q 30
            }  {

                i++;
            }


        }
        System.out.println("quantidade de numeros maiores que 30 eh " + b);
    }
}


