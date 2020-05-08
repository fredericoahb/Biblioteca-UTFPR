package br.com.utfpr.dao;

import java.util.List;

import br.com.utfpr.model.Telefone;

public interface TelefoneDAO extends GenericDAO{
	
	public List<Telefone> listarTelefone(Integer id_usuario);
	

}
