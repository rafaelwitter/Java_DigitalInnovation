package list;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exemplo1 {
    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();

        nomes.add("Rafael");
        nomes.add("Mariana");
        nomes.add("Aliny");
        nomes.add("Maria");
        nomes.add("Joao");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(4, "Rafael eh lindo e usa set");

        System.out.println(nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Mariana");
        System.out.println(nomes);

        var str = nomes.get(1);
        System.out.println(str);

        System.out.println(nomes.size());

        for (String nome : nomes){
            System.out.println(nome);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("NOME: "+iterator.next());
        }

    }
}
