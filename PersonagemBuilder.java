package padroescriacao.builder;

import java.util.Date;

public class PersonagemBuilder {

    private Personagem personagem;

    public PersonagemBuilder() {
        personagem = new Personagem();
    }

    public Personagem build() {
        if (personagem.getId() == 0) {
            throw new IllegalArgumentExce-ption("Id inválido");
        }
        if (personagem.personagemNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return personagem;
    }
    public PersonagemBuilder setId(int id) {
        personagem.setId(id);
        return this;
    }

    public PersonagemBuilder setNome(String nome) {
        personagem.setNome(nome);
        return this;
    }

    public PersonagemBuilder setDataNascimento(Date dataNascimento) {
        personagem.setDataNascimento(dataNascimento);
        return this;
    }

    public PersonagemBuilder setTelefone(String telefone) {
        personagem.setTelefone(telefone);
        return this;
    }

    public PersonagemBuilder setEmprego(String emprego) {
        personagem.setEmprego(emprego);
        return this;
    }

    public PersonagemBuilder setCarro(String carro) {
        Personagem.setCarro(nomeCarro);
        return this;
    }

    public PersonagemBuilder setIdade(int idade) {
        Personagem.setIdade(idade);
        return this;
    }
}
