package filas;
import java.util.Queue;
import java.util.LinkedList;

//FILA ---> PRIMEIRA ENTRA, PRIMEIRA SAI
public class ExemploLista {
    public static void main(String[] args){
        Queue<String> filaBanco = new LinkedList<>();
        Queue<String> filaMercado = new LinkedList<>();

        filaBanco.add("Rafael");
        filaBanco.add("Maria");
        filaBanco.add("Rene");
        filaBanco.add("Andre");
        System.out.println(filaBanco);

        String proximoCliente = filaBanco.element();
        //RETORNA UM ERRO SE NAO EXISTIREM PESSOAS NA FILA
        System.out.println("O proximo cliente a ser atendido é: "+proximoCliente);

        filaBanco.poll();
        System.out.println(filaBanco);

        /*
        String proximoAtendimento = filaMercado.element();
        System.out.println(proximoAtendimento);
         */

        for (String cliente:filaBanco){
            System.out.println(cliente);
        }
    }
}
