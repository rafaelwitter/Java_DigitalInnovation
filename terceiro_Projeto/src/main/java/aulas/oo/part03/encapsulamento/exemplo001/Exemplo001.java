package aulas.oo.part03.encapsulamento.exemplo001;

public class Exemplo001 {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa("Rafael","Witt", 25, 01, 1999);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());
        System.out.println((eu.getNomeCompleto()));

        eu.setNome("Marco Paulo");

        System.out.println(eu.getNome());

    }
}
