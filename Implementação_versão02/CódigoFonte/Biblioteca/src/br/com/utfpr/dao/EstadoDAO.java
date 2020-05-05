package br.com.utfpr.dao;

import java.util.List;

import br.com.utfpr.model.Estado;

public interface EstadoDAO extends GenericDAO{

	public List<Estado> listarTodosEstados();
}
