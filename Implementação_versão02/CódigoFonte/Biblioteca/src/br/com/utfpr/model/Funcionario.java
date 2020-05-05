package br.com.utfpr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name="Tb_Funcionario")
@PrimaryKeyJoinColumn(name="id_usuario")
public class Funcionario extends Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column (name="siape_funcionario")
	private Integer siape_funcionario;

	public Integer getSiape_funcionario() {
		return siape_funcionario;
	}

	public void setSiape_funcionario(Integer siape_funcionario) {
		this.siape_funcionario = siape_funcionario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((siape_funcionario == null) ? 0 : siape_funcionario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (siape_funcionario == null) {
			if (other.siape_funcionario != null)
				return false;
		} else if (!siape_funcionario.equals(other.siape_funcionario))
			return false;
		return true;
	}

	
	
}
