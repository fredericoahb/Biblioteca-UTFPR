package br.com.utfpr.dao;

import br.com.utfpr.model.Usuario;

public interface ServidorDAO extends GenericDAO{
	
	public boolean validarSIAPEServidor(Integer siape_servidor);
	
	public Usuario carregarServidor(Integer matriculaSIAPE);

}
