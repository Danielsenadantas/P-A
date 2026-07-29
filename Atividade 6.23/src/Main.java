import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 1 numero"));
        double R = 0;
        R = A * 1.05;
        System.out.println("valor original " + A +" reajuste de 5% " + R);}}
