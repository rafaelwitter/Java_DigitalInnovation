package digitalinnovation.example.restfull.mock;

import digitalinnovation.example.restfull.dto.Soldado;

public class SoldadoResponse {
    public static Soldado create(){
        Soldado soldado = new Soldado();
        soldado.setArma("M4A1");
        //soldado.setIdade(24);
        soldado.setNome("Rafael");
        soldado.setStatus("vivo");
        return soldado;
    }
}
