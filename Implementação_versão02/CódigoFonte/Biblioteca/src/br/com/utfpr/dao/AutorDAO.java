package br.com.utfpr.dao;

import java.util.List;

import br.com.utfpr.model.Autor;
import br.com.utfpr.model.Obra;

public interface AutorDAO extends GenericDAO{
	
	public List<Autor> listarAutorPorObra(Obra obra);
	
}
