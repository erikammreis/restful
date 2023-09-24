/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fiap.restful.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CLIENTES") // Especifica o nome da tabela no banco de dados
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
public class Cliente extends Usuario{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Ou outra estratégia apropriada
    @Column(name = "cliente_id") // Nome da coluna no Oracle (em maiúsculas)
    private Long idCliente;
       
    @Column(name = "NUMERO_TELEFONE", length = 11) // Nome da coluna no Oracle (em maiúsculas)
    private String numeroTelefone;
    
    @Column(name = "QUANTIDADE_PESSOAS") // Nome da coluna no Oracle (em maiúsculas)
    private int quantidadePessoas;
    
    @Column(name = "TAMANHO_CASA") // Nome da coluna no Oracle (em maiúsculas)
    private int tamanhoCasa;
    
    @Column(name = "BANHEIROS") // Nome da coluna no Oracle (em maiúsculas)
    private int banheiros;
    
    @Column(name = "QUARTOS") // Nome da coluna no Oracle (em maiúsculas)
    private int quartos;
    
    @OneToOne
    @JoinColumn(name = "USUARIO_ID", unique = true) // Referência ao ID na tabela USUARIOS
    private int idUsuario;




    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public int getTamanhoCasa() {
        return tamanhoCasa;
    }

    public void setTamanhoCasa(int tamanhoCasa) {
        this.tamanhoCasa = tamanhoCasa;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }
}
