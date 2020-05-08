package br.com.utfpr.dao;

import java.util.Date;
import java.util.List;

import br.com.utfpr.model.Aluno;
import br.com.utfpr.model.Categoria_Obra;
import br.com.utfpr.model.Emprestimo;
import br.com.utfpr.model.Obra;
import br.com.utfpr.model.Reserva;
import br.com.utfpr.model.Servidor;
import br.com.utfpr.model.Usuario;

public interface EmprestimoDAO {
	
	public Emprestimo realizarEmprestimo (Aluno aluno, Servidor servidor);
	
	public Date calcularDataPrevistaDevolucao (Categoria_Obra categoria_obra);
	
	public Obra localizarReserva (Aluno aluno, Reserva reserva);
	
	public List<Emprestimo> listarEmprestimoPorUsuario (Usuario usuario);
	
	public List<Emprestimo> listarDevolucao (Usuario usario);
	
	public List<Emprestimo> listaPendenciaPeriodo(Date inicio, Date fim);
	
	public List<Emprestimo> listaDevolucaoPendente(Usuario usuario);
	
	public Boolean buscarUsuario();
}
