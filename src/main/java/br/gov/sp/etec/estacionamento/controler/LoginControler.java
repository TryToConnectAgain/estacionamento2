package br.gov.sp.etec.estacionamento.controler;

import br.gov.sp.etec.estacionamento.model.Usuario;

import br.gov.sp.etec.estacionamento.service.UsuarioService;
import br.gov.sp.etec.estacionamento.service.UsuarioServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginControler {

    private static final Logger log = LoggerFactory.getLogger(LoginControler.class);

    @Autowired
    UsuarioService service;

    @Autowired

    @GetMapping("/")

    public String index() {
        return "login";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "/cadastro";
    }

    @PostMapping("/efetuar_cadastro")
    public String efetuar_cadastro(Usuario usuario) {
        log.info(usuario.toString());
        service.CadastrarUsuario(usuario);
        return "cadastro-success";
    }

    @PostMapping("/autenticar")
    public String autenticar(String email, String senha) {
        Usuario user = service.BuscaUsuarioPorEmail(email);

        if (user != null && user.getSenha().equals(senha)) {
            if (user.getEmail().equals(email)) {
                return "painel";
            }
        } else {
            return "cadastro-failure";
        }
        return "cadastro-failure";
    }

}
