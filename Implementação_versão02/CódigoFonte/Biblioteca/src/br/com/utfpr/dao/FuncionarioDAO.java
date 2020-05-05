package br.com.utfpr.dao;

import br.com.utfpr.model.Usuario;

public interface FuncionarioDAO extends GenericDAO{
	
	public boolean validarSiapeFuncionario(Integer siape_funcionario);
	
	public Usuario carregarFuncionario(Integer siape_funcionario);

}
