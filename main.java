package javaapplication1;
public class javaapplication1{
    public static void main(String[] args){
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Gabriel", "Brasil", 20, 10, 2, 1.70f, 60f);
        l[1] = new Lutador("Marcelo", "EUA", 21, 14, 3, 1.80f, 70f);
        
        for (int i=0 ; i<=1; i++){
          l[i].status();
        }
        
        l[1].apresentar();
        l[1].ganharluta();
        
        Luta UFC1 = new Luta();
        UFC1.marcarLuta(l[0], l[1]);
        UFC1.lutar();
          for (int i=0 ; i<=1; i++){
          l[i].apresentar();
        }
    }
}
