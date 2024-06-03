import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeCliente = "MARIO ANDRADE";
        String agencia = "067-8";
        int numero = 1021;
        BigDecimal saldo = new BigDecimal("237.48");

        System.out.println(
                "=== Bem vindo ao banco Banco ===\n" +
                        "Para poder usar os nossos serviços, " +
                        "é necessário que você crie uma conta " +
                        "inserindo os dados requisitados"
        );

        try {

            System.out.print("Por favor, digite seu nome: ");
            nomeCliente = scanner.nextLine();
            //scanner.nextLine();

            System.out.print("Por favor, digite o número da agência: ");
            agencia = scanner.nextLine();
            //scanner.nextLine();

            System.out.print("Por favor, digite o número da conta: ");
            numero = scanner.nextInt();
            //scanner.nextLine();

            System.out.print("Por favor, digite o seu saldo: ");
            saldo = scanner.nextBigDecimal();
            //scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Erro: " + e);
            System.exit(0);
        } finally {
            scanner.close();
        }
        System.out.println("Olá " + nomeCliente + ", " +
                    "obrigado por criar uma conta em nosso banco. " +
                    "A sua agência é " + agencia + ", a sua conta é " + numero + " e o " +
                    "seu saldo de R$ " + saldo + " já está disponível para saque"
        );

        /*
        System.out.println(
                "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco. A sua agência é ").concat(agencia)
                .concat(", a sua conta é ").concat(String.valueOf(numero))
                .concat( " e o seu saldo de R$ ").concat(String.valueOf(saldo))
                .concat(" já está disponível para saque")
        );
        */
    }
}