package br.com.utfpr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Tb_Categoria_Obra")
public class Categoria_Obra implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="id_categoria_obra", insertable = true, updatable = false)
	private Integer id_categoria_obra;
	
	@Column (name="descricao_categoria_obra", length=50)
	private String descricao_categoria_obra;
	
	@Column (name="nro_categoria_obra")
	private Integer nro_dias_categoria_obra;
	
	@Column (name="multa_dia_categoria_obra")
	private float multa_dia_categoria_obra;

	public Integer getId_categoria_obra() {
		return id_categoria_obra;
	}

	public void setId_categoria_obra(Integer id_categoria_obra) {
		this.id_categoria_obra = id_categoria_obra;
	}

	public String getDescricao_categoria_obra() {
		return descricao_categoria_obra;
	}

	public void setDescricao_categoria_obra(String descricao_categoria_obra) {
		this.descricao_categoria_obra = descricao_categoria_obra;
	}

	public Integer getNro_dias_categoria_obra() {
		return nro_dias_categoria_obra;
	}

	public void setNro_dias_categoria_obra(Integer nro_dias_categoria_obra) {
		this.nro_dias_categoria_obra = nro_dias_categoria_obra;
	}

	public float getMulta_dia_categoria_obra() {
		return multa_dia_categoria_obra;
	}

	public void setMulta_dia_categoria_obra(float multa_dia_categoria_obra) {
		this.multa_dia_categoria_obra = multa_dia_categoria_obra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao_categoria_obra == null) ? 0 : descricao_categoria_obra.hashCode());
		result = prime * result + ((id_categoria_obra == null) ? 0 : id_categoria_obra.hashCode());
		result = prime * result + Float.floatToIntBits(multa_dia_categoria_obra);
		result = prime * result + ((nro_dias_categoria_obra == null) ? 0 : nro_dias_categoria_obra.hashCode());
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
		Categoria_Obra other = (Categoria_Obra) obj;
		if (descricao_categoria_obra == null) {
			if (other.descricao_categoria_obra != null)
				return false;
		} else if (!descricao_categoria_obra.equals(other.descricao_categoria_obra))
			return false;
		if (id_categoria_obra == null) {
			if (other.id_categoria_obra != null)
				return false;
		} else if (!id_categoria_obra.equals(other.id_categoria_obra))
			return false;
		if (Float.floatToIntBits(multa_dia_categoria_obra) != Float.floatToIntBits(other.multa_dia_categoria_obra))
			return false;
		if (nro_dias_categoria_obra == null) {
			if (other.nro_dias_categoria_obra != null)
				return false;
		} else if (!nro_dias_categoria_obra.equals(other.nro_dias_categoria_obra))
			return false;
		return true;
	}
	
	

}
