import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        for(int i = 1; i < 6; i++) {
            double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 1 numero"));
            A = Math.pow(A, 2);
            JOptionPane.showMessageDialog(null, "o quadrado desse numero "+ A);
        }


    }}
