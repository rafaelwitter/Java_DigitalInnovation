package digitalinnovation.example.restfull.mock;

import digitalinnovation.example.restfull.dto.Soldado;

public class SoldadoRequest {
    public static Soldado create(){
        Soldado soldado = new Soldado();
        soldado.setArma("M4A1");
        //soldado.setIdade(24);
        soldado.setNome("Witt");
        soldado.setStatus("vivo");
        return soldado;
    }
}
