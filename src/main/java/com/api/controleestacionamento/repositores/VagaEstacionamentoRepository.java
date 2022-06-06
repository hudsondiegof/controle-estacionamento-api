package com.api.controleestacionamento.repositores;

import com.api.controleestacionamento.models.VagaEstacionamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VagaEstacionamentoRepository extends JpaRepository<VagaEstacionamentoModel, UUID> {

    boolean existsByPlacaCarro(String placaCarro);
    boolean existsByNumeroVaga(String numeroVaga);
    boolean existsByApartamentoEBloco(String apartamento, String bloco);
}
