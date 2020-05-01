package br.com.utfpr.dao;

import java.util.List;

import br.com.utfpr.model.Cidade;
import br.com.utfpr.model.Estado;



public interface CidadeDAO extends GenericDAO {
	
	public List<Cidade> listarTodas(Estado estado);

}
