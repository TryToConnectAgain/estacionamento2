package br.gov.sp.etec.estacionamento.service;

import br.gov.sp.etec.estacionamento.entity.UsuarioEntity;
import br.gov.sp.etec.estacionamento.model.Usuario;
import br.gov.sp.etec.estacionamento.repositor.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired UsuarioRepository repository;



    @Override
    public String CadastrarUsuario(Usuario usuario) {
        UsuarioEntity entity = new UsuarioEntity();

        entity.setNome(usuario.getNome());
        entity.setCpf(usuario.getCpf());
        entity.setEmail(usuario.getEmail());
        entity.setTelefone(usuario.getTelefone());
        entity.setData_de_nascimento(usuario.getData_de_nascimento());
        entity.setSenha(usuario.getSenha());

        repository.save(entity);

        return "Usuario cadastrado com sucesso";
    }

    @Override
    public List<Usuario> ListarUsuario() {
        return List.of();
    }

    @Override
    public String AtualizarUsuario(Usuario usuario) {
        return "";
    }

    @Override
    public String DeletarUsuario(long id) {
        return "";
    }

    @Override
    public Usuario BuscaUsuarioPorEmail(String email) {
        UsuarioEntity userEntity = repository.findByemail(email);
        Usuario user = ToUsuario(userEntity);
        return user;
    }

    private Usuario ToUsuario(UsuarioEntity userEntity) {
        Usuario usuario = new Usuario();
        usuario.setEmail(userEntity.getEmail());
        usuario.setSenha(userEntity.getSenha());

        return usuario;
    }
}
