import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nome;
        Double saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = scanner.next();

        System.out.println("Digite o número da sua conta: ");
        numero = (int) scanner.nextInt();

        System.out.println("Digite a sua agência: ");
        agencia = scanner.next();

        System.out.println("Digite o seu saldo: ");
        saldo = (Double) scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo é " + saldo + "já está disponível para saque. Obrigado(a)!");
    }
}