package br.edu.ifsp.dmo.listviewexemplolistaalunos;

public class Aluno {
    private int prontuario;
    private String nome;
    private String curso;

    public Aluno(int prontuario, String nome, String curso) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return nome + "(" + prontuario + ") - " + curso;
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

