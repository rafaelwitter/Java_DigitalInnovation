package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args){
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Pedro");
        estudantes.add("Rafael");
        estudantes.add("Helena");
        estudantes.add("Livia");
        estudantes.add("Beatriz");
        estudantes.add("Aline");
        estudantes.add("Tiago");

        //Contagem dos elementos da stream
        System.out.println("Contagem: "+estudantes.stream().count());
        System.out.println();

        //Verifica e retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letras: "+estudantes.stream().
                max(Comparator.comparingInt(String::length)));
        System.out.println();

        //Verifica e retorna o elemento com menor numero de letras
        System.out.println("Menor numero de letras: "+estudantes.stream().
                min(Comparator.comparingInt(String::length)));
        System.out.println();

        //Retorna elementos com a letra R
        System.out.println("Retorna elementos com a letra R: "+estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
        System.out.println();

        //Retorna uma nova coleçao com a qtd de caracteres de cada nome
        System.out.println("Coleçao com a qtd de caracteres: "+estudantes.stream().map((estudante)->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).
                collect(Collectors.toList()));
        System.out.println();

        //Retorna os 3 primeiiros elementos
        System.out.println("Os 3 primeiros estudantes sâo: "+estudantes.stream().limit(3).
                collect(Collectors.toList()));
        System.out.println();

        //Exibe cada elementos e depois retorna a colecao
        System.out.println("Retorna os elementos: "+estudantes.stream().peek(System.out::println).
                collect(Collectors.toList()));
        System.out.println();

        //Exibe cada elemento sem retornar outra coleçao
        System.out.println("Novamente os elementos: ");
        estudantes.stream().forEach(System.out::println);
        System.out.println();

        //Exemplo de operacao encadeada
        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream().
                peek(System.out::println).
                map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length()))).
                peek(System.out::println).
                filter((estudante) ->
                        estudante.toLowerCase().contains("r")).
//                collect(Collectors.toList()));
                collect(Collectors.joining(", ")));
//                collect(Collectors.toSet()));


    }
}
