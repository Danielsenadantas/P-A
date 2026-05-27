import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        int i = 0;

        while (i < 4) {
            int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 numero"));
            if (A == 0) {
                i = i + 5;
            } else if (A > 100 || A > 200) {
                JOptionPane.showMessageDialog(null, " seu numero esta entre 200 e 100 ");
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "nao esta entre 200 e 100 ");
            }

        }
    }
}
