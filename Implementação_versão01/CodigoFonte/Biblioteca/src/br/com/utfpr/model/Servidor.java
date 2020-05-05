package br.com.utfpr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name="Tb_Servidor")
@PrimaryKeyJoinColumn(name="id_usuario")
public class Servidor extends Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column (name="matricula_siape_servidor")
	private Integer matricula_siape_servidor;

	public Integer getMatricula_siape_servidor() {
		return matricula_siape_servidor;
	}

	public void setMatricula_siape_servidor(Integer matricula_siape_servidor) {
		this.matricula_siape_servidor = matricula_siape_servidor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((matricula_siape_servidor == null) ? 0 : matricula_siape_servidor.hashCode());
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
		Servidor other = (Servidor) obj;
		if (matricula_siape_servidor == null) {
			if (other.matricula_siape_servidor != null)
				return false;
		} else if (!matricula_siape_servidor.equals(other.matricula_siape_servidor))
			return false;
		return true;
	}

	
	
}
