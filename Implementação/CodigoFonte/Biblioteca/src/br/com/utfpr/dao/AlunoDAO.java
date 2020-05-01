package br.com.utfpr.dao;

import java.util.List;

import br.com.utfpr.model.Usuario;

public interface AlunoDAO extends GenericDAO{
	
	public boolean validarRAAluno(Integer ra_aluno);
	
	public List<Usuario> listarTodosUsuarioAluno(Integer ra_aluno);
	
	
	
}
