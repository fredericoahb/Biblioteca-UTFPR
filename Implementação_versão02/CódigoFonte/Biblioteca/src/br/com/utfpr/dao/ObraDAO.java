package br.com.utfpr.dao;

import java.util.Date;
import java.util.List;

import br.com.utfpr.model.Autor;
import br.com.utfpr.model.Categoria_Obra;
import br.com.utfpr.model.Obra;

public interface ObraDAO extends GenericDAO{
	
	public List<Obra> listarObraPorAutor(Autor autor);
	
	public List<Obra> listarObraPorCategoria(Categoria_Obra categoria);
	
	public List<Obra> verificarDisponibilidadeObra(Date inicio, Date fim);
	
	public List<Obra> verificarObraAtraso(Date inicio, Date fim);
	
	public Date verificarDevolucao(Obra obra);
	
	public boolean verificarDisponibilidadeObra(Obra obra);

}
