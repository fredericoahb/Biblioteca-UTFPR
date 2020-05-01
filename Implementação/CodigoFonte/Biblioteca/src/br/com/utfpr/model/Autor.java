package br.com.utfpr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table (name="Tb_Autor")
public class Autor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE) 
	@Column (name="id_autor", insertable = true, updatable = false)
	private Integer id_autor;
	
	@Column (name="nome_autor", length=100)
	private String nome_autor;

	@ManyToMany(targetEntity = Obra.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@Fetch(FetchMode.SUBSELECT)
	@JoinTable(name = "Tb_Autor_Obra", joinColumns = @JoinColumn(name = "id_autor"), inverseJoinColumns = @JoinColumn(name = "id_obra", unique=false))
	private List<Obra> obras = new ArrayList<Obra>();

	public Integer getId_autor() {
		return id_autor;
	}

	public void setId_autor(Integer id_autor) {
		this.id_autor = id_autor;
	}

	public String getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

	public List<Obra> getObras() {
		return obras;
	}

	public void setObras(List<Obra> obras) {
		this.obras = obras;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_autor == null) ? 0 : id_autor.hashCode());
		result = prime * result + ((nome_autor == null) ? 0 : nome_autor.hashCode());
		result = prime * result + ((obras == null) ? 0 : obras.hashCode());
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
		Autor other = (Autor) obj;
		if (id_autor == null) {
			if (other.id_autor != null)
				return false;
		} else if (!id_autor.equals(other.id_autor))
			return false;
		if (nome_autor == null) {
			if (other.nome_autor != null)
				return false;
		} else if (!nome_autor.equals(other.nome_autor))
			return false;
		if (obras == null) {
			if (other.obras != null)
				return false;
		} else if (!obras.equals(other.obras))
			return false;
		return true;
	}	
	
	
	
}
