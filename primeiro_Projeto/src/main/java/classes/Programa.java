package classes;
import classes.pessoa.Pessoa;

public class Programa {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa(21, 57.40f);
        System.out.println(pessoa1.getIdade());
        System.out.println("Hello Cauã");
        boolean b = true;
        System.out.println(b);
        boolean ca =  true;
        if (ca == true){
            System.out.println("oi");
        }
        else{
            System.out.println("thcau");
        }
    }
}
