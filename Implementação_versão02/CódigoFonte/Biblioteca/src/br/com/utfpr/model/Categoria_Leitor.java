package br.com.utfpr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tb_Categoria_Leitor")
public class Categoria_Leitor implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="id_categoria_leitor", insertable = true, updatable = false)
	private Integer id_categoria_leitor;
	
	@Column (name="descricao_categoria_leitor", length=50)
	private String descricao_categoria_leitor;
	
	@Column (name="dias_categoria_leitor")
	private Integer dias_categoria_leitor;
	
	@Column (name="qtde_emprestimo_categoria_leitor")
	private Integer qtde_emprestimo_categoria_leitor;

	public Integer getId_categoria_leitor() {
		return id_categoria_leitor;
	}

	public void setId_categoria_leitor(Integer id_categoria_leitor) {
		this.id_categoria_leitor = id_categoria_leitor;
	}

	public String getDescricao_categoria_leitor() {
		return descricao_categoria_leitor;
	}

	public void setDescricao_categoria_leitor(String descricao_categoria_leitor) {
		this.descricao_categoria_leitor = descricao_categoria_leitor;
	}

	public Integer getDias_categoria_leitor() {
		return dias_categoria_leitor;
	}

	public void setDias_categoria_leitor(Integer dias_categoria_leitor) {
		this.dias_categoria_leitor = dias_categoria_leitor;
	}

	public Integer getQtde_emprestimo_categoria_leitor() {
		return qtde_emprestimo_categoria_leitor;
	}

	public void setQtde_emprestimo_categoria_leitor(Integer qtde_emprestimo_categoria_leitor) {
		this.qtde_emprestimo_categoria_leitor = qtde_emprestimo_categoria_leitor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao_categoria_leitor == null) ? 0 : descricao_categoria_leitor.hashCode());
		result = prime * result + ((dias_categoria_leitor == null) ? 0 : dias_categoria_leitor.hashCode());
		result = prime * result + ((id_categoria_leitor == null) ? 0 : id_categoria_leitor.hashCode());
		result = prime * result
				+ ((qtde_emprestimo_categoria_leitor == null) ? 0 : qtde_emprestimo_categoria_leitor.hashCode());
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
		Categoria_Leitor other = (Categoria_Leitor) obj;
		if (descricao_categoria_leitor == null) {
			if (other.descricao_categoria_leitor != null)
				return false;
		} else if (!descricao_categoria_leitor.equals(other.descricao_categoria_leitor))
			return false;
		if (dias_categoria_leitor == null) {
			if (other.dias_categoria_leitor != null)
				return false;
		} else if (!dias_categoria_leitor.equals(other.dias_categoria_leitor))
			return false;
		if (id_categoria_leitor == null) {
			if (other.id_categoria_leitor != null)
				return false;
		} else if (!id_categoria_leitor.equals(other.id_categoria_leitor))
			return false;
		if (qtde_emprestimo_categoria_leitor == null) {
			if (other.qtde_emprestimo_categoria_leitor != null)
				return false;
		} else if (!qtde_emprestimo_categoria_leitor.equals(other.qtde_emprestimo_categoria_leitor))
			return false;
		return true;
	}

	

}
