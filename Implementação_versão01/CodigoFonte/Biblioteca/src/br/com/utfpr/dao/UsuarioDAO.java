package br.com.utfpr.dao;

import java.util.List;

import br.com.utfpr.model.Aluno;
import br.com.utfpr.model.Servidor;
import br.com.utfpr.model.Usuario;

public interface UsuarioDAO extends GenericDAO {
	
	public List<Usuario> listarPorAluno(Aluno aluno);
	
	public List<Usuario> listarPorServidor(Servidor servidor);
	
	public Boolean autenciarUsuario(Usuario usuario); 
	
	public Boolean bloquearDesbloquearUsuario(Integer codigo);
	
}
