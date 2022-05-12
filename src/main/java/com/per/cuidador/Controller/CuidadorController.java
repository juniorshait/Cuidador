package com.per.cuidador.Controller;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import com.per.cuidador.Entity.Cuidador;
import com.per.cuidador.Service.CuidadorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ph/cuidador")
public class CuidadorController {
    
    @Autowired
    private CuidadorService service;

    @PostMapping("/salvar")
    public ResponseEntity<Object> salvarCuidador(@RequestBody Cuidador cuidador, HttpServletRequest request){
        return ResponseEntity.ok(new Gson().toJson(service.salvarCuidador(cuidador)));
    }

    @GetMapping("/buscar/{cpf}")
    public ResponseEntity<Object> buscarIdoso(@PathVariable("cpf") String cpf){
        return ResponseEntity.ok(new Gson().toJson(service.buscarCuidador(cpf)));
    }
}
