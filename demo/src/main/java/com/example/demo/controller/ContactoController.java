package com.example.demo.controller;

//import javax.validation.Valid;

import com.example.demo.bean.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ContactoController {
    //@Autowired
    Cliente cliente;

    @GetMapping("/clientesGET")
    public Cliente getCliente(){
        return cliente;
    }

    @PostMapping("/clientesPOST")
    public void postCliente(@RequestBody Cliente cliente){
        this.cliente = cliente;
    }

    

}
