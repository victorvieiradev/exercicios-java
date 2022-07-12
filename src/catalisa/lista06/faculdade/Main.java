package catalisa.lista06.faculdade;

public class Main {
    public static void main(String[] args) {
        FuncionarioAdministrativo f1 = new FuncionarioAdministrativo("Victor Oliveira", "123.456.123-122", "234312", "Secretaria municipal da educação", 1000, "Gestor de projetos", "Pleno");
        f1.apresentar();
        Professor p1 = new Professor("Leonardo Pereira", "999.321.777-32", "443321", "Secretaria estadual da educação", 2000, "Graduação em Letras", "Português", 60, 3);
        Professor p2 = new Professor("João da Silva", "111.321.727-32", "123321", "Secretaria estadual da educação", 3000, "Graduação em Geografia", "Geografia", 60, 3);
        Cordenador c1 = new Cordenador("Patricia Pereira", "111.222.333-21", "090921", "Secretaria da educação estadualo", 3000);
        c1.adicionarProfessor(p1);
        c1.adicionarProfessor(p2);
        c1.apresentar();
    }
}
