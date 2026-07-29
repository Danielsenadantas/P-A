import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double R = 0;
        double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 1 numero"));
        double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 2 numero"));
        double C = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 3 numero"));
        R = A + B;
        if (R > C) {
            System.out.println("A soma dos numeros é maior que C "+ C);}
        else {System.out.println("A soma dos numeros é menor que C "+ C);
        }}}