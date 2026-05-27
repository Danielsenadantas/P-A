import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        int i = 1;
        int i2 = 10;
        int R = 0;
        while(i < i2){
        int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 numero"));
        R = R + A;
        i2++;
        if (A == 0) {
           i = i - 1000;
            JOptionPane.showMessageDialog(null, "o resultado é "+ R);
            R = R - R;

        }

    }}}
