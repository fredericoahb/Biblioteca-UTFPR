package br.com.utfpr.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Tb_Devolucao")
public class Devolucao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE) 
	@Column (name="id_devolucao", insertable = true, updatable = false)
	private Integer id_devolucao;
	
	@Column (name="data_devolucao")
	private Date data_devolucao;

	public Integer getId_devolucao() {
		return id_devolucao;
	}

	public void setId_devolucao(Integer id_devolucao) {
		this.id_devolucao = id_devolucao;
	}

	public Date getData_devolucao() {
		return data_devolucao;
	}

	public void setData_devolucao(Date data_devolucao) {
		this.data_devolucao = data_devolucao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data_devolucao == null) ? 0 : data_devolucao.hashCode());
		result = prime * result + ((id_devolucao == null) ? 0 : id_devolucao.hashCode());
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
		Devolucao other = (Devolucao) obj;
		if (data_devolucao == null) {
			if (other.data_devolucao != null)
				return false;
		} else if (!data_devolucao.equals(other.data_devolucao))
			return false;
		if (id_devolucao == null) {
			if (other.id_devolucao != null)
				return false;
		} else if (!id_devolucao.equals(other.id_devolucao))
			return false;
		return true;
	}
	
	
	

	
}
