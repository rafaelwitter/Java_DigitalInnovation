package set;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args){
        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.add(2.6);
        notasAlunos.add(6.3);
        notasAlunos.add(5.2);
        notasAlunos.add(10.0);
        notasAlunos.add(5.64);
        notasAlunos.add(3.0);
        notasAlunos.add(7.7);
        notasAlunos.add(2.6);

        System.out.println(notasAlunos);
        notasAlunos.remove(3.0);
        System.out.println(notasAlunos);

        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(notasAlunos.size());
        notasAlunos.clear();
        if(!notasAlunos.isEmpty()){
            System.out.println(notasAlunos);
        } else {
            System.out.println("Nao foi possivel imprimir. Não há notas.");
        }

    }
}
