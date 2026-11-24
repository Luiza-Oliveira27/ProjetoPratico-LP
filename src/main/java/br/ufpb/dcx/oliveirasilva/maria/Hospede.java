package br.ufpb.dcx.oliveirasilva.maria;

import java.util.List;

public class Hospede{
    private String codigo;
    private String nome;
    private String telefone;
    private String cpf;
    private String data;
    private int quarto;

    public Hospede(String codigo, String nome, String telefone, String cpf, String data, int quarto) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.data = data;
        this.quarto = quarto;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getData(){
        return this.data;
    }

    public int getQuarto(){
        return this.quarto;
    }

}
