public class SmartTv {
    
    // Variaveis de estado:
    boolean ligada = false ;
    int canal = 0 ;
    int volume = 0;

    public void ligarDesligar(String acao) {
        
        if (acao.equals("Ligar")){
            ligada = true;
        } else if (acao.equals("Desligar")){
            ligada = false;
        }
        
    }

    public int ajustarVolume(String acao){

        if (acao.equals("Aumentar")){
            volume++;
        } else if (acao.equals("Diminuir")){
            volume--;
        }
        return volume;

    }

    public int trocarCanal(String acao){

        if (acao.equals("Subir")){
            canal++;
        } else if (acao.equals("descer")){
            canal--;
        }

        return canal;
    }

}
