package br.com.utfpr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="Tb_Estado")
public class Estado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="id_estado", insertable = true, updatable = false)
	private Integer id_estado;
	
	@Column (name="descricao_estado", length=50)
	private String descricao_estado;
	
	@Column (name="sigla_estado", length=2)
	private String sigla_estado;

	public Integer getId_estado() {
		return id_estado;
	}

	public void setId_estado(Integer id_estado) {
		this.id_estado = id_estado;
	}

	public String getDescricao_estado() {
		return descricao_estado;
	}

	public void setDescricao_estado(String descricao_estado) {
		this.descricao_estado = descricao_estado;
	}

	public String getSigla_estado() {
		return sigla_estado;
	}

	public void setSigla_estado(String sigla_estado) {
		this.sigla_estado = sigla_estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao_estado == null) ? 0 : descricao_estado.hashCode());
		result = prime * result + ((id_estado == null) ? 0 : id_estado.hashCode());
		result = prime * result + ((sigla_estado == null) ? 0 : sigla_estado.hashCode());
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
		Estado other = (Estado) obj;
		if (descricao_estado == null) {
			if (other.descricao_estado != null)
				return false;
		} else if (!descricao_estado.equals(other.descricao_estado))
			return false;
		if (id_estado == null) {
			if (other.id_estado != null)
				return false;
		} else if (!id_estado.equals(other.id_estado))
			return false;
		if (sigla_estado == null) {
			if (other.sigla_estado != null)
				return false;
		} else if (!sigla_estado.equals(other.sigla_estado))
			return false;
		return true;
	}
	
	
}
