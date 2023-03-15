package padroescriacao.builder;

import java.util.Date;

public class Aluno {

    private int id;
    private String nome;
    private Date dataNascimento;
    private String telefone;
    private String emprego;
    private String carro;
    private String idade;

    public Aluno() {
        this.id = 0;
        this.nome = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmprego() {
        return emprego;
    }

    public void setEmprego(String emprego) {
        this.emprego = emprego;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(Int idade) {
        this.idade = idade;
    }




