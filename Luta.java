package javaapplication1;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author gabriel.crangel
 */

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l1;
        }else{
            this.aprovada = false;
            this.desafiado= null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if (this.aprovada){
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("Empatou");
                    System.out.println("");
                    this.desafiado.empatar();
                    this.desafiante.empatar();
                    break;
                case 1:
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    System.out.println("");
                    this.desafiado.ganharluta();
                    break;
                case 2:
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    System.out.println("");
                    this.desafiante.ganharluta();
                    break;
            }
        }else{
            System.out.println("A luta não vai rolar");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
   
}
