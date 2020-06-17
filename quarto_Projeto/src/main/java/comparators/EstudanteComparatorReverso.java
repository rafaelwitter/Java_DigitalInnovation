package comparators;
import java.util.Comparator;


public class EstudanteComparatorReverso implements Comparator<Estudante>{

    @Override
    public int compare(Estudante estudante, Estudante t1) {
        return t1.getIdade() - estudante.getIdade();
    }
}
