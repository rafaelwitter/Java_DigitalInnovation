package comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import comparators.Estudante;
import comparators.EstudanteComparatorReverso;

public class ExemploComparator {
    public static void main(String[] args){
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Rafael", 21));
        estudantes.add(new Estudante("Joao", 22));
        estudantes.add(new Estudante("Livia", 20));
        estudantes.add(new Estudante("Pedro", 26));

        System.out.println("---------Ordem de inserçao---------");
        System.out.println(estudantes);

        estudantes.sort((first,second) -> first.getIdade() - second.getIdade());
        System.out.println("----------Ordem naturais dos numeros ----- Idade");
        System.out.println(estudantes);

        estudantes.sort((first, second)->second.getIdade()-first.getIdade());
        System.out.println("----------Ordem reversa dos numeros ------- Idade");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("----------Ordem natural dos numeros ------- idade (implementacao referencia)");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("----------Ordem reversa dos numeros ------- idade (implementacao referencia)");
        System.out.println(estudantes);
    }
}
