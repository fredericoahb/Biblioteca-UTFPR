package br.com.utfpr.dao;

import java.util.List;

import br.com.utfpr.model.Reserva;

public interface ReservaDAO extends GenericDAO {

	public boolean efetivarReserva(List<Item_EmprestimoDAO> reservas);

	public Reserva carregarReserva(Integer ra_aluno);

}
