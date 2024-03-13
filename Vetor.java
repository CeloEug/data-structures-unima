import Aluno.java

public class Vetor {
    private Aluno[] alunos = new Aluno[100000];
    private int totalAlunos = 0;
    public void add(Aluno aluno) {
        this.alunos[this.totalAlunos] = aluno;
        this.totalAlunos = this.totalAlunos + 1;
    }
    public void add(int posicao, Aluno aluno) {
        for (int i = this.totalAlunos - 1; i >= posicao; i -= 1) {
            this.alunos[i + 1] = this.alunos[i];
        }
        this.alunos[posicao] = aluno;
        this.totalAlunos = totalAlunos + 1;
    }
    public Aluno get(int posicao) {
        return this.alunos[posicao];
    }
    public void remove(int posicao) {
        for (int i = posicao; i < this.totalDeAlunos - 1; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }
        this.totalAlunos--;
    }
    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (aluno.equals(this.alunos[i])) {
                return true;
            }
        }
        return false;
    }
    public int siz() {
        return this.totalAlunos;
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < this.totalAlunos - 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }
        builder.append(this.alunos[this.totalAlunos - 1]);
        builder.append("]");
        return builder.toString();
    }
    public void garantaEspaco() {
        if (this.totalAlunos == this.alunos.length) {
            Aluno[] auxArray = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                auxArray[i] = this.alunos[i];
            }
            this.alunos = auxArray;
        }
    }
}
