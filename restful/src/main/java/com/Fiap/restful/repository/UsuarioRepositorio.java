/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Fiap.restful.repository;

import com.Fiap.restful.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Erika
 */

public interface UsuarioRepositorio extends  JpaRepository<Cliente, Long>{
    
}
