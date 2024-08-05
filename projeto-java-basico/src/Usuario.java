import java.util.Scanner;

public class Usuario {
    public static void main(String [] args) throws Exception{
        Scanner ler = new Scanner(System.in);

        SmartTv smartTv = new SmartTv();
        int acao;

        System.out.println();
        System.out.println("Ola usuario. Seja bem vindo à sua SmartTv");
        System.out.println("Sua Tv encontra-se desligada. Gostaria de liga-la? \n1 - Sim; \n2 - Nao;");
        acao = ler.nextInt();
        if (acao==1){
            smartTv.ligarDesligar("Ligar");
        }
        else if (acao == 2) {
            smartTv.ligarDesligar("Desligar");
        } else {
            System.out.println("Acao invalida. Aguarde");
        }

        while (true){
        
        System.out.print("Estado atual da sua tv: ");
        System.out.println(smartTv.ligada?"Ligada":"Desligada" );
        if (smartTv.ligada == true){
            System.out.println("Volume: " + smartTv.volume);
            System.out.println("Canal: " + smartTv.canal);
        }
        System.out.println("Qual acao deseja relizar?");
        System.out.println("1 - Aumentar volume; \n" + 
                           "2 - Diminuit Volume; \n" +
                           "3 - Subir de canal; \n" +
                           "4 - Descer de canal; \n" +
                           "0 - Sair.");
        acao = ler.nextInt();
        if (acao == 0){
            System.out.println("Agradecemos sua visita. Até mais");    
            ler.close();
            break;
        } 
        else if (acao==1){ smartTv.ajustarVolume("Aumentar");}
        else if (acao==2){ smartTv.ajustarVolume("Diminuir");}
        else if (acao==3){ smartTv.trocarCanal("Subir");}
        else if (acao==4){ smartTv.trocarCanal("Descer");}

        }

    }
}
