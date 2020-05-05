package br.com.utfpr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="Tb_Tefefone")
public class Telefone implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE) 
	@Column (name="id_telefone", insertable = true, updatable = false)
	private Integer id_telefone;
	
	@Column (name = "ddd_telefone")
	private Integer ddd_telefone;
	
	@Column (name="nro_telefone")
	private Integer nro_telefone;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Integer getId_telefone() {
		return id_telefone;
	}

	public void setId_telefone(Integer id_telefone) {
		this.id_telefone = id_telefone;
	}

	public Integer getDdd_telefone() {
		return ddd_telefone;
	}

	public void setDdd_telefone(Integer ddd_telefone) {
		this.ddd_telefone = ddd_telefone;
	}

	public Integer getNro_telefone() {
		return nro_telefone;
	}

	public void setNro_telefone(Integer nro_telefone) {
		this.nro_telefone = nro_telefone;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ddd_telefone == null) ? 0 : ddd_telefone.hashCode());
		result = prime * result + ((id_telefone == null) ? 0 : id_telefone.hashCode());
		result = prime * result + ((nro_telefone == null) ? 0 : nro_telefone.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Telefone other = (Telefone) obj;
		if (ddd_telefone == null) {
			if (other.ddd_telefone != null)
				return false;
		} else if (!ddd_telefone.equals(other.ddd_telefone))
			return false;
		if (id_telefone == null) {
			if (other.id_telefone != null)
				return false;
		} else if (!id_telefone.equals(other.id_telefone))
			return false;
		if (nro_telefone == null) {
			if (other.nro_telefone != null)
				return false;
		} else if (!nro_telefone.equals(other.nro_telefone))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	
}
