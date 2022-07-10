package combate;

import java.util.Random;

public class Luta {
    private  Lutador desafiante, desafiado;
    private  int rounds;
    private  boolean aprovado;
    public void marcarLuta(Lutador desafiante, Lutador desafiado){
        if (desafiante.getCategoria().equalsIgnoreCase(desafiado.getCategoria()) && desafiante != desafiado){
            this.setAprovado(true);
            this.setDesafiante(desafiante);
            this.setDesafiado(desafiado);
        }else {
            this.setAprovado(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }
    public void  lutar(){
        if (this.isAprovado()){
            System.out.println("O desafiante é: ");
            this.desafiante.apresentar();
            System.out.println("O desafiado é: ");
            this.desafiado.apresentar();
            Random random = new Random();
            int vencedor = random.nextInt(3);
            switch (vencedor){
                case  0:
                    System.out.println("Empatou");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                break;
                case  1:
                    System.out.println("O vencedor é " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                break;
                case  2:
                    System.out.println("O vencedor é: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                break;
            }
        }else {
            System.out.println("A luta não pode acontecer.");
        }
    }
    // Métodos get e set

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
