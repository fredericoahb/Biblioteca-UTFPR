package br.com.utfpr.dao;

import java.util.List;

import br.com.utfpr.model.Telefone;
import br.com.utfpr.model.Usuario;

public interface TelefoneDAO extends GenericDAO{
	
	public List<Telefone> carregarTelefone (Usuario usuario);

}
