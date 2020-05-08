package br.com.utfpr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name="Tb_Aluno")
@PrimaryKeyJoinColumn(name="id_usuario")
public class Aluno extends Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column (name="ra_aluno")
	private Integer ra_aluno;

	public Integer getRa_aluno() {
		return ra_aluno;
	}

	public void setRa_aluno(Integer ra_aluno) {
		this.ra_aluno = ra_aluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ra_aluno == null) ? 0 : ra_aluno.hashCode());
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
		Aluno other = (Aluno) obj;
		if (ra_aluno == null) {
			if (other.ra_aluno != null)
				return false;
		} else if (!ra_aluno.equals(other.ra_aluno))
			return false;
		return true;
	}
	
	
	
}
