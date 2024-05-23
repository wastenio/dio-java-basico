import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Valor a ser depositado? ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " o valor depositado na sua conta foi de: " + saldo + " esse valor foi depositado na sua conta de " + numero + " e agencia " + agencia + "!");
    }
    
}