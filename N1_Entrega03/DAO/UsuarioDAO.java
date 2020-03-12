package DAO;

import Models.Usuario;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsuarioDAO extends PadraoDAO<Usuario> {
    @Override
    protected Map<String, String> CriaParametros(Usuario usuario) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Id", String.valueOf(usuario.getId()));
        map.put("Username", usuario.getUsername());
        map.put("Password", usuario.getPassword());

        return map;
    }

    @Override
    protected Usuario MontaModel(String registro) {
        Usuario usuario = new Usuario();
        List<String> registros = Arrays.asList(registro.split("|"));

        usuario.setId(Integer.parseInt(registros.get(0)));
        usuario.setUsername(registros.get(1));
        usuario.setPassword(registros.get(2));

        return usuario;
    }

    @Override
    protected void SetTabela() {
        Tabela = "Usuarios.txt";
    }
}
