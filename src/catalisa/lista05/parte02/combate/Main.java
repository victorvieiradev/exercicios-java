package combate;

public class Main {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[6];
        l[0] = new Lutador("Victor", "Brasil", 24, 1.60, 70, 2, 1, 2);
        l[1] = new Lutador("Gabriel", "Canada", 24, 1.60, 70, 2, 1, 2);
        Luta luta = new Luta();
        luta.marcarLuta(l[0], l[1]);
        luta.lutar();
        l[0].status();
        l[1].status();


    }
}
