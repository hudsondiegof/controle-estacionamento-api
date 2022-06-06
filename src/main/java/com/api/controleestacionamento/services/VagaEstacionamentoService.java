package com.api.controleestacionamento.services;

import com.api.controleestacionamento.models.VagaEstacionamentoModel;
import com.api.controleestacionamento.repositores.VagaEstacionamentoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VagaEstacionamentoService {

    final VagaEstacionamentoRepository vagaEstacionamentoRepository;

    public VagaEstacionamentoService(VagaEstacionamentoRepository vagaEstacionamentoRepository) {
        this.vagaEstacionamentoRepository = vagaEstacionamentoRepository;
    }

    @Transactional
    public VagaEstacionamentoModel save(VagaEstacionamentoModel vagaEstacionamentoModel) {
        return vagaEstacionamentoRepository.save(vagaEstacionamentoModel);
    }

    public boolean existsByPlacaCarro(String placaCarro) {
        return vagaEstacionamentoRepository.existsByPlacaCarro(placaCarro);
    }

    public boolean existsByNumeroVaga(String numeroVaga) {
        return vagaEstacionamentoRepository.existsByNumeroVaga(numeroVaga);

    }

    public boolean existsByApartamentoBloco(String apartamento, String bloco) {
        return vagaEstacionamentoRepository.existsByApartamentoEBloco(apartamento, bloco);
    }

    public Page<VagaEstacionamentoModel> findAll(Pageable paginavel) {return vagaEstacionamentoRepository.findAll(paginavel);
    }

    public Optional<VagaEstacionamentoModel> findById(UUID id) {
        return vagaEstacionamentoRepository.findById(id);
    }

    @Transactional
    public void delete(VagaEstacionamentoModel parkingSpotModel) {vagaEstacionamentoRepository.delete(parkingSpotModel);
    }
}