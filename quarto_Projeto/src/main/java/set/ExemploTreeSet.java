package set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args){
        TreeSet<String> treeCapitais = new TreeSet<>();
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Curitiba");
        System.out.println(treeCapitais);
        System.out.println(treeCapitais.first());
        System.out.println(treeCapitais.last());
        System.out.println();
        System.out.println(treeCapitais.lower("Florianopolis"));
        System.out.println();
        System.out.println(treeCapitais.higher("Florianopolis"));
        System.out.println();
        System.out.println(treeCapitais.pollFirst());
        System.out.println(treeCapitais.pollLast());
        System.out.println(treeCapitais);
    }
}
