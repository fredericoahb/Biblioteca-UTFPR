package br.com.utfpr.dao;

import java.util.List;

import br.com.utfpr.model.Devolucao;
import br.com.utfpr.model.Emprestimo;
import br.com.utfpr.model.Usuario;

public interface DevolucaoDAO extends GenericDAO {
	
	public Devolucao realizarDevolucao(Emprestimo emprestimo);
	
	public List<Devolucao> listarDevolucao(Usuario usuario); 
	
	public float calcularMultaPorAtraso(Emprestimo emprestimo);

}
