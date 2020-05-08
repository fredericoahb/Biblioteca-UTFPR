package br.com.utfpr.dao;

import java.util.List;

import br.com.utfpr.model.Emprestimo;
import br.com.utfpr.model.Item_Emprestimo;
import br.com.utfpr.model.Reserva;

public interface EmprestimoDAO {

	public boolean efetivarEmprestimo(List<Item_Emprestimo> emprestimos);

	public Reserva consultaReserva(Integer ra_aluno);

	public String atualizaSituacaoEmprestimo(Emprestimo emprestimo);

}
