package com.digitallabs.RestFullApp.service;

import com.digitallabs.RestFullApp.controller.request.SoldadoEditRequest;
import com.digitallabs.RestFullApp.dto.Soldado;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String matricula){
        Soldado soldado = new Soldado();
        soldado.setMatricula(matricula);
        soldado.setNome("Witt");
        soldado.setRaça("Assault");
        soldado.setArma("M4A1");
        return soldado;
    }

    public void criarSoldade(Soldado soldado){

    }

    public void alterarSoldado(String matricula, SoldadoEditRequest soldadoEditRequest) {

    }

    public void deletarSoldado(String matricula) {

    }

    public List<Soldado> buscarSoldados(){
        Soldado soldado1 = new Soldado();
        soldado1.setMatricula("09821714986");
        soldado1.setNome("Witt");
        soldado1.setRaça("Assault");
        soldado1.setArma("M4A1");
        Soldado soldado2 = new Soldado();
        soldado2.setMatricula("09821714986");
        soldado2.setNome("Rafael");
        soldado2.setRaça("Sniper");
        soldado2.setArma("AWP");
        return Arrays.asList(soldado1,soldado2);

    }
}
