package br.com.utfpr.dao;

import java.util.Date;
import java.util.List;

import br.com.utfpr.model.Autor;
import br.com.utfpr.model.Categoria_Obra;
import br.com.utfpr.model.Obra;

public interface ObraDAO extends GenericDAO{
	
	public List<Obra> listarObrarPorAutor(Autor autor);
	
	public List<Obra> verificarDisponibilidadeObra(Date inicio, Date fim);
	
	public List<Obra> listarObrasEmprestimoPorCategoria(Categoria_Obra categoria_obra);
	
	public List<Obra> verificarObraAtraso(Date inicio, Date fim);

}
