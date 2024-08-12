import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite a agência: ");
        String agencia = input.nextLine();

        System.out.println("Digite o número da agência: ");
        int numero = input.nextInt();

        System.out.println("Informe seu saldo: ");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero +" e seu saldo "+ saldo + " já está disponível para saque.");
        
        input.close();
    }
}
