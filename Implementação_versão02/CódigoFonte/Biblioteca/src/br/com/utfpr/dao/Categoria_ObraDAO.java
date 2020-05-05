package br.com.utfpr.dao;

import java.util.List;

import br.com.utfpr.model.Categoria_Obra;

public interface Categoria_ObraDAO extends GenericDAO {
	
	public List<Categoria_Obra> listarTodasCategoriaObra();

}
