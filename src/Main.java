import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CarteiraDigital carteira = new CarteiraDigital();
        String resposta = "";
        Scanner sc = new Scanner(System.in);

        carteira.bemVindo();

        while (!resposta.equals("4")) {
            carteira.menu();
            carteira.LerEntradaUsuario();
            resposta = carteira.LerEntradaUsuario();

            switch (resposta) {
                case "1":
                    System.out.println("Digite o valor para adicionar ao saldo: ");
                    double valorAdicionar = sc.nextDouble();
                    carteira.adiconarvalor(valorAdicionar);
                    break;
                case "2":
                    System.out.println("Digite o valor do pagamento: ");
                    double valorPagar = sc.nextDouble();
                    carteira.FazerPagamento(valorPagar);
                    break;
                case "3":
                    System.out.println("Seu saldo atual é: " + carteira.saldo);
                case "4":
                    carteira.Saida();
            }
        }
    }
}