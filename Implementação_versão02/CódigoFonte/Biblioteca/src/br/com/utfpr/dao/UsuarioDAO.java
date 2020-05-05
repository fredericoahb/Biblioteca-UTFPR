package br.com.utfpr.dao;

import br.com.utfpr.model.Usuario;

public interface UsuarioDAO extends GenericDAO {
	
	public Boolean autenciarUsuario(Usuario usuario);
	
	public Usuario buscarPorLogin (String cpf);
	
	public Usuario recuperarSenha(String cpf, Integer ra_aluno, Integer siape_funcionario);
	
	public Boolean bloquearDesbloquearUsuario(Integer id_usuario);
	
	
	
		
}
