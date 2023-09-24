/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fiap.restful.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author Erika
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "profissional")
public class Profissional extends Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Ou outra estratégia apropriada
    @Column(name = "profissional_id") // Nome da coluna no Oracle (em maiúsculas)
    private Long id;

    @Column(name = "profissao", nullable = false)
    private String profissao;

    @Column(name = "descricao_servicos")
    private String descricaoServicos;

    @Column(name = "tempo_de_experiencia")
    private int tempoDeExperiencia;

    @Column(name = "avaliacao_media")
    private BigDecimal avaliacaoMedia;
    



    // Getters and setters
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        if (profissao == null || profissao.isEmpty()) {
            throw new IllegalArgumentException("profissao não pode ser nulo ou vazio");
        }
        this.profissao = profissao;
    }

    public String getDescricaoServicos() {
        return descricaoServicos;
    }

    public void setDescricaoServicos(String descricaoServicos) {
        this.descricaoServicos = descricaoServicos;
    }

    public int getTempoDeExperiencia() {
        return tempoDeExperiencia;
    }

    public void setTempoDeExperiencia(int tempoDeExperiencia) {
        this.tempoDeExperiencia = tempoDeExperiencia;
    }

    public BigDecimal getAvaliacaoMedia() {
        return avaliacaoMedia;
    }

    public void setAvaliacaoMedia(BigDecimal avaliacaoMedia) {
        this.avaliacaoMedia = avaliacaoMedia;
    }
}
