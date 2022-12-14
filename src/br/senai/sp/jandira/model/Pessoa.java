package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public String getDataNascimentoComBarra() {
        
        String[] separado =  dataNascimento.toString().split("-");
        String dataCerta = separado[2] + "/" + separado[1] + "/" + separado[0];
        return dataCerta;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
