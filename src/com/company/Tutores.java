package com.company;


import com.company.Interessantes.TutorEnsino;

public class Tutores extends Pessoas implements TutorEnsino {

    private String disciplina;

    public Tutores(String nome, String cpf, String endereco, int idade, String disciplina) {
        super(nome, cpf, endereco, idade);
        this.disciplina = disciplina;
    }

    public void ensino(){
        System.out.println("Aula de Programaçao Java POO");
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
