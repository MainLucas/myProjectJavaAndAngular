package com.example.meuProjetoJavaAngular.controller;

import com.example.meuProjetoJavaAngular.model.Cliente;
import com.example.meuProjetoJavaAngular.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvarCliente(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
    }
}
