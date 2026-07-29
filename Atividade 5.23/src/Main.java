import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salario"));
        double B = 1293.20;
        double R = 0;

        R = A / B;
        System.out.println("voce possui "+ R +" salarios");

    }
}