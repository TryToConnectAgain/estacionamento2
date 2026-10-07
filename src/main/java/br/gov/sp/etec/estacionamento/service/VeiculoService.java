package br.gov.sp.etec.estacionamento.service;

import br.gov.sp.etec.estacionamento.entity.VeiculoEntity;
import br.gov.sp.etec.estacionamento.model.Veiculo;

import java.util.List;

public interface VeiculoService {
    public void cadastrarVeiculo(Veiculo veiculo);
    public List<VeiculoEntity> listarVeiculo();
    public boolean deletarVeiculo(Long id);
    public VeiculoEntity atualizarVeiculo(VeiculoEntity veiculo);
    public VeiculoEntity buscarVeiculo(Long id);
}
