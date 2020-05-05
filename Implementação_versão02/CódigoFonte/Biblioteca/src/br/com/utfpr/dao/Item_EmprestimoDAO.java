package br.com.utfpr.dao;

import java.util.Date;
import java.util.List;

import br.com.utfpr.model.Categoria_Leitor;
import br.com.utfpr.model.Item_Emprestimo;
import br.com.utfpr.model.Obra;

public interface Item_EmprestimoDAO extends GenericDAO {
	
	public boolean consultarDisponibilidade(Obra obra);
	
	public void adicionarItem(Obra obra);
	
	public void removerItem(Obra obra);
	
	public List<Item_Emprestimo> listarItem(Integer id);
	
	public Date calcularDataPrevista(Categoria_Leitor categoria);
	
	public Double calcularMulta(Obra obra);
	
	public boolean efetivarDevolucao(Item_Emprestimo item);
}
