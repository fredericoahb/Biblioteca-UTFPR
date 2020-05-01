package br.com.utfpr.dao;

import java.util.Date;
import java.util.List;

import br.com.utfpr.model.Usuario;

public interface ReservaDAO extends GenericDAO {
	
	public List<Usuario> listarReservaDiaria(Date dataAtual);

}
