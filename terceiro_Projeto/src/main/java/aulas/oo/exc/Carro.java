package aulas.oo.exc;

public class Carro {
    private Integer capacidade;
    private Integer pessoasDentro = 0;

    public Carro(Integer capacidade){
        this.capacidade = capacidade;
    }

    public void adicionaPessoa(){
        if (this.pessoasDentro < this.capacidade) {
            this.pessoasDentro += 1;
            System.out.println("Pessoa adicionada. Agora existem "+pessoasDentro+" pessoas dentro do carro");
        } else {
            System.out.println("Carro cheio!!");
        }
    }

    public void removePessoa(){
        if (this.pessoasDentro != 0){
            this.pessoasDentro -= 1;
            System.out.println("Pessoa retirada. Agora existem "+pessoasDentro+" pessoas dentro do carro");
        }
        else {
            System.out.println("Carro já está vazio.");
        }
    }
}
