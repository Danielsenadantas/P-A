import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        int i = 0;

        while (i < 16) {
            int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 numero"));
            if (A > 30) {
                JOptionPane.showMessageDialog(null, " seu numero é maior que 30");
                i++;
            } else {
                JOptionPane.showMessageDialog(null, " seu numero nao eh maior que 30 ");
                i++;
            }


        }
    }
}


