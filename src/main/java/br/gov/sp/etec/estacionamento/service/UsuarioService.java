package br.gov.sp.etec.estacionamento.service;

import br.gov.sp.etec.estacionamento.model.Usuario;

import java.util.List;

public interface UsuarioService {
    String CadastrarUsuario(Usuario usuario);
    List<Usuario> ListarUsuario();
    String AtualizarUsuario(Usuario usuario);
    String DeletarUsuario(long id);
    Usuario BuscaUsuarioPorEmail(String email);
}
