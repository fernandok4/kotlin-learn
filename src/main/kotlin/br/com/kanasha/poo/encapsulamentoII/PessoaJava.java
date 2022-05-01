package br.com.kanasha.poo.encapsulamentoII;

import java.time.LocalDate;

public class PessoaJava {

    private String nome;
    private String cpf;
    private LocalDate dtNascimento;
    private Integer idade;
    private String email;

    public PessoaJava(String nome, String cpf, LocalDate dtNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.idade = LocalDate.now().getYear() - dtNascimento.getYear();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}