package br.com.utfpr.dao;

import java.util.List;

public interface GenericDAO {

	public void salvar(Object obj);

	public void atualizar(Object obj);

	public void excluir(Object obj);

	public Object carregar(Integer codigo);

	public List<Object> listarTodos();
	
	
}
