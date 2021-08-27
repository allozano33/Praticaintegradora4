package com.company;

import com.company.Interessantes.AlunosTecnicos;

public class SuporteTecnico extends Pessoas implements AlunosTecnicos {

    public void suporteRedes(){
        System.out.println("Manutenção de Redes");
    }

    public void suporteComputadores(){
        System.out.println("Manutenção de Computadores");
    }

    public SuporteTecnico(String nome, String cpf, String endereco, int idade) {
        super(nome, cpf, endereco, idade);
    }
}

