/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fiap.restful.business;

/**
 *
 * @author Erika
 */
import com.Fiap.restful.entity.Cliente;
import com.Fiap.restful.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClienteService {
    private final UsuarioRepositorio clienteRepository;

    @Autowired
    public ClienteService(UsuarioRepositorio clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Transactional
    public Cliente cadastrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
