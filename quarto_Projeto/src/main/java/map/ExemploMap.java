package map;
import java.util.Map;
import java.util.HashMap;

public class ExemploMap {
    public static void main(String[] args){
        Map<String, Integer> campeosMundiaisFifa = new HashMap<>();
        campeosMundiaisFifa.put("Brasil", 5);
        campeosMundiaisFifa.put("Alemanha",2);
        campeosMundiaisFifa.put("EUA", 1);
        campeosMundiaisFifa.put("Dinamarca",3);
        campeosMundiaisFifa.put("Suecia", 4);
        System.out.println(campeosMundiaisFifa);
        campeosMundiaisFifa.put("Brasil", 7);
        System.out.println(campeosMundiaisFifa);
        System.out.println(campeosMundiaisFifa.containsKey("França"));
        System.out.println(campeosMundiaisFifa.containsValue(4));

        System.out.println();

        for(Map.Entry<String, Integer> entry : campeosMundiaisFifa.entrySet()){
            System.out.println(entry.getKey() + "==" + entry.getValue());
        }

        System.out.println();

        for (String key : campeosMundiaisFifa.keySet()){
            System.out.println(key + "==" + campeosMundiaisFifa.get(key));
        }
    }
}