import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Datas datas = new Datas();

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o ano que vc nasceu");
        int anoQueAPessoaNasceu = scanner.nextInt();

        datas.quantosAnosAPessoaViveu(anoQueAPessoaNasceu);

    }
}