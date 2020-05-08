package br.com.utfpr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Tb_Obra")
public class Obra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="id_obra", insertable = true, updatable = false)
	private Integer id_obra;
	
	@Column (name = "disponivel_obra")
	private boolean disponivel_obra;
	
	@Column (name = "isbn_obra", length = 20)
	private String isbn_obra;
	
	@Column (name = "titulo_obra", length = 50)
	private String titulo_obra;
	
	@Column (name = "palavras_chave_obra", length = 200)
	private String palavras_chave_obra;
	
	@Column (name = "dt_publicacao_obra")
	private Date dt_publicacao_obra;
	
	@Column (name = "edicao_obra", length = 50)
	private String edicao_obra;
	
	@Column (name = "editora_obra", length = 50)
	private String editora_obra;
	
	@Column (name = "nro_paginas_obra")
	private Integer nro_paginas_obra;
	
	@OneToOne
	@JoinColumn(name = "id_categoria_obra")
	private Categoria_Obra categoria_obra;
	
	@OneToMany(targetEntity = Autor.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_autor")
	private List<Autor> autores = new ArrayList<Autor>();

	public Integer getId_obra() {
		return id_obra;
	}

	public void setId_obra(Integer id_obra) {
		this.id_obra = id_obra;
	}

	public boolean isDisponivel_obra() {
		return disponivel_obra;
	}

	public void setDisponivel_obra(boolean disponivel_obra) {
		this.disponivel_obra = disponivel_obra;
	}

	public String getIsbn_obra() {
		return isbn_obra;
	}

	public void setIsbn_obra(String isbn_obra) {
		this.isbn_obra = isbn_obra;
	}

	public String getTitulo_obra() {
		return titulo_obra;
	}

	public void setTitulo_obra(String titulo_obra) {
		this.titulo_obra = titulo_obra;
	}

	public String getPalavras_chave_obra() {
		return palavras_chave_obra;
	}

	public void setPalavras_chave_obra(String palavras_chave_obra) {
		this.palavras_chave_obra = palavras_chave_obra;
	}

	public Date getDt_publicacao_obra() {
		return dt_publicacao_obra;
	}

	public void setDt_publicacao_obra(Date dt_publicacao_obra) {
		this.dt_publicacao_obra = dt_publicacao_obra;
	}

	public String getEdicao_obra() {
		return edicao_obra;
	}

	public void setEdicao_obra(String edicao_obra) {
		this.edicao_obra = edicao_obra;
	}

	public String getEditora_obra() {
		return editora_obra;
	}

	public void setEditora_obra(String editora_obra) {
		this.editora_obra = editora_obra;
	}

	public Integer getNro_paginas_obra() {
		return nro_paginas_obra;
	}

	public void setNro_paginas_obra(Integer nro_paginas_obra) {
		this.nro_paginas_obra = nro_paginas_obra;
	}

	public Categoria_Obra getCategoria_obra() {
		return categoria_obra;
	}

	public void setCategoria_obra(Categoria_Obra categoria_obra) {
		this.categoria_obra = categoria_obra;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autores == null) ? 0 : autores.hashCode());
		result = prime * result + ((categoria_obra == null) ? 0 : categoria_obra.hashCode());
		result = prime * result + (disponivel_obra ? 1231 : 1237);
		result = prime * result + ((dt_publicacao_obra == null) ? 0 : dt_publicacao_obra.hashCode());
		result = prime * result + ((edicao_obra == null) ? 0 : edicao_obra.hashCode());
		result = prime * result + ((editora_obra == null) ? 0 : editora_obra.hashCode());
		result = prime * result + ((id_obra == null) ? 0 : id_obra.hashCode());
		result = prime * result + ((isbn_obra == null) ? 0 : isbn_obra.hashCode());
		result = prime * result + ((nro_paginas_obra == null) ? 0 : nro_paginas_obra.hashCode());
		result = prime * result + ((palavras_chave_obra == null) ? 0 : palavras_chave_obra.hashCode());
		result = prime * result + ((titulo_obra == null) ? 0 : titulo_obra.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obra other = (Obra) obj;
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		if (categoria_obra == null) {
			if (other.categoria_obra != null)
				return false;
		} else if (!categoria_obra.equals(other.categoria_obra))
			return false;
		if (disponivel_obra != other.disponivel_obra)
			return false;
		if (dt_publicacao_obra == null) {
			if (other.dt_publicacao_obra != null)
				return false;
		} else if (!dt_publicacao_obra.equals(other.dt_publicacao_obra))
			return false;
		if (edicao_obra == null) {
			if (other.edicao_obra != null)
				return false;
		} else if (!edicao_obra.equals(other.edicao_obra))
			return false;
		if (editora_obra == null) {
			if (other.editora_obra != null)
				return false;
		} else if (!editora_obra.equals(other.editora_obra))
			return false;
		if (id_obra == null) {
			if (other.id_obra != null)
				return false;
		} else if (!id_obra.equals(other.id_obra))
			return false;
		if (isbn_obra == null) {
			if (other.isbn_obra != null)
				return false;
		} else if (!isbn_obra.equals(other.isbn_obra))
			return false;
		if (nro_paginas_obra == null) {
			if (other.nro_paginas_obra != null)
				return false;
		} else if (!nro_paginas_obra.equals(other.nro_paginas_obra))
			return false;
		if (palavras_chave_obra == null) {
			if (other.palavras_chave_obra != null)
				return false;
		} else if (!palavras_chave_obra.equals(other.palavras_chave_obra))
			return false;
		if (titulo_obra == null) {
			if (other.titulo_obra != null)
				return false;
		} else if (!titulo_obra.equals(other.titulo_obra))
			return false;
		return true;
	}
	
}
