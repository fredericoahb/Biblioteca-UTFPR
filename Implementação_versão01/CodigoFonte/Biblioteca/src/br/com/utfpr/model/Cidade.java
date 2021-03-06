package br.com.utfpr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Tb_Cidade")
public class Cidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="id_cidade", insertable = true, updatable = false)
	private Integer id_cidade;
	
	@Column (name="descricao_cidade", length=200)
	private String descricao_cidade;

	@OneToOne
	@JoinColumn (name="id_estado")
	private Estado estado;

	public Integer getId_cidade() {
		return id_cidade;
	}

	public void setId_cidade(Integer id_cidade) {
		this.id_cidade = id_cidade;
	}

	public String getDescricao_cidade() {
		return descricao_cidade;
	}

	public void setDescricao_cidade(String descricao_cidade) {
		this.descricao_cidade = descricao_cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao_cidade == null) ? 0 : descricao_cidade.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((id_cidade == null) ? 0 : id_cidade.hashCode());
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
		Cidade other = (Cidade) obj;
		if (descricao_cidade == null) {
			if (other.descricao_cidade != null)
				return false;
		} else if (!descricao_cidade.equals(other.descricao_cidade))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (id_cidade == null) {
			if (other.id_cidade != null)
				return false;
		} else if (!id_cidade.equals(other.id_cidade))
			return false;
		return true;
	}
	
	
}
