package com.api.controleestacionamento.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_VAGA_ESTACIONAMENTO")
public class VagaEstacionamentoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String numeroVaga;
    @Column(nullable = false, unique = true, length = 7)
    private String placaCarro;
    @Column(nullable = false, length = 70)
    private String marcaCarro;
    @Column(nullable = false, length = 70)
    private String modeloCarro;
    @Column(nullable = false, length = 70)
    private String corCarro;
    @Column(nullable = false)
    private LocalDateTime dataRegistro;
    @Column(nullable = false, length = 130)
    private String nomeResponsavel;
    @Column(nullable = false, length = 30)
    private String apartamento;
    @Column(nullable = false, length = 30)
    private String bloco;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNumeroVaga() {
        return numeroVaga;
    }

    public void setNumeroVaga(String numeroVaga) {
        this.numeroVaga = numeroVaga;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }
}
