package DAO;

import Models.Usuario;

import java.util.HashMap;
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
    protected void SetTabela() {
        Tabela = "Usuarios.txt";
    }
}
