import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua Conta !");
        int Numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        String Agencia = scanner.next();
        System.out.println("Por favor, digite o Seu Nome !");
        String NomeCliente = scanner.next();
        System.out.println("Por favor, digite o Seu Saldo !");
        Double Saldo = scanner.nextDouble();

        scanner.close();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", NomeCliente, Agencia, Numero, Saldo);
    }
}
