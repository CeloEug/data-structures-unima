public class Main {
    public static void main(String[] args) {

        Vetor lista = new Vetor();

        System.out.printf("Hello and welcome!");
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno().;
        Aluno a9 = new Aluno();

        a1.setNome("Glevson");
        a2.setNome("Francisco");
        a3.setNome("Maria");
        a4.setNome("João");
        a5.setNome("José");
        a6.setNome("Miguel");
        a7.setNome("Teste");
        a8.setNome("Teste");
        a9.setNome("Teste");

        System.out.println("\nAlunos: "+ a2.getNome());
        System.out.println("Alunos: "+ a1.getNome());


        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        lista.add(a5);
        lista.add(a6);
        lista.add(a7);
        lista.add(a8);
        lista.add(a9);
        
        System.out.println("Total de alunos: " +lista.siz());
        System.out.println(lista);
        lista.remove(0);
        lista.remove(2);
        lista.remove(5);
        lista.remove(8);


        System.out.println(lista.contem(a9));

        System.out.println(lista.get(8));


    }
}
