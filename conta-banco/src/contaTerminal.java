import java.util.Scanner;


public class contaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:CONHECER E IMPORTAR A CLASSE SCANNER
        //EXIBIR AS MSGS P O NOSSO USUARIO
        //OBTER PELA SCANNER OS VALORES DIGITADOS
        //EXIBIR A MSG CONTA CRIADA

        Scanner scanner = new Scanner(System.in);
        //criando o objeto scanner p receber dados

        System.out.println("Por favor, digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println(" Por favor, digite o nome do cliente: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();


        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();




    }
}
