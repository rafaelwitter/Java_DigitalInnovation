package aulas.oo.part03.encapsulamento.exemplo001;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String nomeCompleto;
    private LocalDate dataNascimento;

    public Pessoa(String nome,String sobrenome, int dia, int mes, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeCompleto = nome + sobrenome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public int calculaIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCompleto(){ return nomeCompleto; }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
