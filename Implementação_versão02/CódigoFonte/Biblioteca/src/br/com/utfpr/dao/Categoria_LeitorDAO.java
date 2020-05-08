package br.com.utfpr.dao;

import java.util.List;

import br.com.utfpr.model.Categoria_Leitor;

public interface Categoria_LeitorDAO extends GenericDAO {
	
	public List<Categoria_Leitor> listarTodasCategoriaLeitor();

}
