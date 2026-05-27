public class Main {
    public static void main(String[] args) {
        int i = 75;
        while (i < 197) {
            //criação da variavel e repetição do while
            if (i % 2 != 0) {
                //condição a ser confirmada e usada na saída
                System.out.println("esse numero eh impar " + i);
            }
            i++;
        }
    }
}