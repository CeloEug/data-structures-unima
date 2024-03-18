//Aluno: Marcelo Eugênio de Almeida Barbosa
public class Main {
    public static void main(String[] args) {
        Vetor lista = new Vetor();

        System.out.println("Hello and welcome!");
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        Aluno a11 = new Aluno();
        Aluno a12 = new Aluno();
        Aluno a13 = new Aluno();
        Aluno a14 = new Aluno();
        Aluno a15 = new Aluno();
        Aluno a16 = new Aluno();
        Aluno a17 = new Aluno();

        a1.setNome("Glevson");
        a2.setNome("Francisco");
        a3.setNome("Maria");
        a4.setNome("João");
        a5.setNome("José");
        a6.setNome("Miguel");
        a7.setNome("Junior");
        a8.setNome("Caio");
        a9.setNome("Davi");
        a10.setNome("Marcelo");
        a11.setNome("Maria");
        a12.setNome("Ana");
        a13.setNome("João");
        a14.setNome("Leo");
        a15.setNome("Gabriel");
        a16.setNome("Pikachu");
        a17.setNome("Omori");

        lista.Adiciona(a1);
        lista.Adiciona(a2);
        lista.Adiciona(a3);
        lista.Adiciona(a4);
        lista.Adiciona(a5);
        lista.Adiciona(a6);
        lista.Adiciona(a7);
        lista.Adiciona(a8);
        lista.Adiciona(a9);
        lista.Adiciona(a10);
        lista.Adiciona(a11);
        lista.Adiciona(a12);
        lista.Adiciona(a13);
        lista.Adiciona(a14);
        lista.Adiciona(a15);

        System.out.println("Total de alunos: " + lista.getTotalDealunos());

        System.out.println("Lista de alunos: " + lista);
        System.out.println("Aluno Removido: " + a1 + ", " + a2);

        lista.remove(0);
        lista.remove(0);



        System.out.println("Lista de alunos: " + lista);

        System.out.println("Total de alunos após remoção: " + lista.getTotalDealunos());

        System.out.println("Lista de alunos após remoção: " + lista);

        lista.adicionaPosicao(0, a16);
        lista.adicionaPosicao(1, a17);

        System.out.println("Total de alunos após adição dos dois alunos novos: " + lista.getTotalDealunos());

        System.out.println("Lista de alunos após adição dos dois alunos novos: " + lista);
    }
}