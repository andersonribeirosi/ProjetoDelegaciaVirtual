package dao;

import model.Usuario;

public interface UsuarioDao {
	public void addUsuario(Usuario usuario);

	public Usuario getUsuario(int id_usuario);

}
