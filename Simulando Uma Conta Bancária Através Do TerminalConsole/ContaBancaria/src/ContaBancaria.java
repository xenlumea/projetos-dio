import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldoConta;

        System.out.println("Digite o número da Conta: (1234)");
        numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o número da Agência: (123-4)");
        numeroAgencia = sc.nextLine();

        System.out.println("Informe seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Informe seu saldo atual: ");
        saldoConta = sc.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em "
                + "nosso banco, sua agência é %s, "
                + "conta %d e seu saldo %.2f já está disponível "
                + "para saque.\n", nomeCliente, numeroAgencia, numeroConta, saldoConta);

        sc.close();
    }

}
