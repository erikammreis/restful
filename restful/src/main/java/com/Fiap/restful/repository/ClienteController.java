/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fiap.restful.repository;

/**
 *
 * @author Erika
 */
import com.Fiap.restful.business.ClienteService;
import com.Fiap.restful.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/clientes") // Mapeie as solicitações para o endpoint /clientes
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

@PostMapping("/cadastrar")
public ResponseEntity<?> cadastrarCliente(@RequestBody Cliente cliente) {
    try {
        Cliente novoCliente = clienteService.cadastrarCliente(cliente);
        if (novoCliente != null) {
            return new ResponseEntity<>(novoCliente, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Falha ao cadastrar cliente", HttpStatus.BAD_REQUEST);
        }
    } catch (Exception e) {
        // Lida com erros de validação ou exceções
        return new ResponseEntity<>("Falha ao cadastrar cliente", HttpStatus.BAD_REQUEST);
    }
}

}
