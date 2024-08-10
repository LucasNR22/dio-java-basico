import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Variaveis globais:
        int numConta;
        String agencia;
        String nmCorrentista;
        float vlSaldoConta=0;
        
        // Scanner de entrada:
        Scanner ler = new Scanner(System.in);


        System.out.println();
        System.out.println();
        System.out.println("Olá. seja bem vindo à sua conta terminal!");
        System.out.println("Por favor, digite o numero da sua conta (4 digitos)");
        numConta = ler.nextInt();
        System.out.println("Agora, digite o numero da sua agencia com o digito verificador (''4 digitos'' - ''1 digito verificador'')");
        agencia = ler.next();

        //Limpeza de buffer
        ler.nextLine();
        
        System.out.println("Agora, digite seu nome completo");
        nmCorrentista = ler.nextLine();
        System.out.println("Digite, entao, o valor do saldo atual da sua conta");
        vlSaldoConta = ler.nextFloat();
        System.out.println("Olá " + nmCorrentista + " , obrigado por criar uma conta em nosso banco! ");
        System.out.println("Sua agência é a "+ agencia +", conta numero "+ numConta + " e seu saldo R$ "+ vlSaldoConta +" e já está disponível para saque");
        System.out.println();
        
        ler.close();
    }
}
