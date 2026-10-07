package br.gov.sp.etec.estacionamento.repositor;

import br.gov.sp.etec.estacionamento.entity.VeiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepositor extends JpaRepository<VeiculoEntity,Long> {

}
