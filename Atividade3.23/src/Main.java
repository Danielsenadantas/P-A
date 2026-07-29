import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 1 numero"));
        double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 2 numero"));
        double C = 0;
        if (A == B) {
            C = A + B;
            System.out.println(C);}
        else{
            C = A * B;
            System.out.println(C);}
        }
        }

