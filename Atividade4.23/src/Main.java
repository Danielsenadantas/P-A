import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 numero"));
        int B = 0;
        int C = 0;


        B = A + 1;
        C = A - 1;
        System.out.println("o numero é " + A + " seu sucessor é " + B + " seu antecessor é " + C);
    }}