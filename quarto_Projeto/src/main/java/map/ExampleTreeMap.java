package map;

import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
     public static void main(String[] args){
            TreeMap<String,String> treeCapitais = new TreeMap<>();

            treeCapitais.put("SC", "Santa Catarina");
            treeCapitais.put("RJ","Rio de Janeiro");
            treeCapitais.put("PR","Parana");
            treeCapitais.put("SP","São Paulo");
            System.out.println(treeCapitais);

            System.out.println("Primeira chave adicionada: "+treeCapitais.firstKey());
            System.out.println("Primeira entrada: "+treeCapitais.firstEntry());
            System.out.println("Ultima entrada: "+ treeCapitais.lastEntry());
        }
    }