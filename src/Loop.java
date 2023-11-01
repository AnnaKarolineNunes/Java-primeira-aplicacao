import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        // loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliacao para o filme ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("media de avaliaçoes " + mediaAvaliacao/3);
    }
}
