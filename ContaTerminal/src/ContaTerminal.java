import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        var scanner = new Scanner(System.in);
        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Exibir as mensagens para o nosso usuário (Conta)
        System.out.println("Por favor, digite o número da Conta !");
        //Obter pela scanner os valores digitados no terminal (Conta)
        conta = scanner.nextInt();

        scanner.nextLine(); 

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome !");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta !");
        saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque. \n",  nomeCliente, agencia, conta, saldo); 
        
    }
}
