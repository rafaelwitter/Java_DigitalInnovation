package optionals;

import java.util.Optional;
import java.util.OptionalInt;

public class  ExemploOptionalEstados {
    public static void main(String[] args){
        Optional<String> optionalString = Optional.of("Valor presente.");

        System.out.println("Valor opcional que está presente.");
        optionalString.ifPresentOrElse(System.out::println,()->System.out.println("Nao esta presente"));

        System.out.println();
        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional nao esta presente");
        optionalNull.ifPresentOrElse(System.out::println,()->System.out.println("Null = nao esta presente"));

        System.out.println();
        Optional<String> emptyOptinional = Optional.empty();

        System.out.println("Valor opcional que nao esta presente");
        emptyOptinional.ifPresentOrElse(System.out::println,()->System.out.println("Empty = n esta presente"));

        System.out.println();
        System.out.println("Valor inteiro opcional");
        OptionalInt.of(12).ifPresent(System.out::println);

        /*
        Optional<String> optionalNullError = Optional.of(null);

        System.out.println("Valor opcional que lança erro NullPointerException");
        optionalNullError.ifPresentOrElse(System.out::println,()->System.out.println("Errp = n esta presente"));
        */
    }
}
