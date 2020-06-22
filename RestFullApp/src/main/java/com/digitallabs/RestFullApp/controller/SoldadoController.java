package com.digitallabs.RestFullApp.controller;

import com.digitallabs.RestFullApp.controller.request.SoldadoEditRequest;
import com.digitallabs.RestFullApp.dto.Soldado;
import com.digitallabs.RestFullApp.service.SoldadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {
    private SoldadoService soldadoService;

    public SoldadoController(SoldadoService soldadoService){
        this.soldadoService = soldadoService;
    }

    @GetMapping("/{matricula}")
    public ResponseEntity<Soldado> buscarSoldado(@PathVariable() String matricula){
        Soldado soldado = soldadoService.buscarSoldado(matricula);
        return ResponseEntity.status(HttpStatus.OK).body(soldado);
    }

    @PostMapping
    public ResponseEntity criarSoldado(@RequestBody Soldado soldado){
        soldadoService.criarSoldade(soldado);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{matricula}")
    public ResponseEntity editarSoldado(@PathVariable() String matricula,
                                            @RequestBody SoldadoEditRequest soldadoEditRequest){
        soldadoService.alterarSoldado(matricula, soldadoEditRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{matricula}")
    public ResponseEntity deletarSoldado(@PathVariable String matricula){
        soldadoService.deletarSoldado(matricula);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Soldado>> buscarSoldados(){
        List<Soldado> soldados = soldadoService.buscarSoldados();
        return ResponseEntity.status(HttpStatus.OK).body(soldados);
    }
}