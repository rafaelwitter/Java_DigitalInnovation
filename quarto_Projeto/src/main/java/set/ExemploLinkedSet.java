package set;

import java.util.LinkedHashSet;

public class ExemploLinkedSet {
    public static void main(String[] args){
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
        sequenciaNumerica.add(12);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(5);
        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(8);

        System.out.println(sequenciaNumerica);
    }
}
