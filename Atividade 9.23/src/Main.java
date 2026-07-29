import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        double A = double.parseDouble(JOptionPane.showInputDialog(null, "Digite altura"));
        double B = double.parseDouble(JOptionPane.showInputDialog(null, "Digite peso"));
        double IMC = 0;

        IMC = B * A^2;
        if (IMC < 18.5) {
            System.out.println("Abaixo do peso");}
        else if (IMC > 18.6) &&


    }
        Abaixo de 18,5 | Abaixo do peso
        Entre 18,6 e 24,9 | Peso ideal (parabéns)
        Entre 25,0 e 29,9 | Levemente acima do peso
        Entre 30,0 e 34,9 | Obesidade grau I
        Entre 35,0 e 39,9 | Obesidade grau II (severa)
                Maior ou igual a 40 | Obesidade grau III (mórbida)