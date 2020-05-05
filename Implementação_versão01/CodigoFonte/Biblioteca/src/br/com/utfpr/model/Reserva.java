package br.com.utfpr.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Tb_Reserva")
public class Reserva implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="id_reserva", insertable = true, updatable = false)
	private Integer id_reserva; 
	
	@Column (name="dt_reserva")
	private Date dt_reserva;
	
	@Column (name = "dt_prevista_retirada")
	private Date dt_prevista_retirada;
	
	@Column (name = "dt_prevista_devolucao")
	private Date dt_prevista_devolucao;
	
	@OneToOne
	@JoinColumn(name = "matricula_siape_servidor")
	private Servidor servidor;
	
	@OneToOne
	@JoinColumn(name = "ra_aluno")
	private Aluno aluno;

	public Integer getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(Integer id_reserva) {
		this.id_reserva = id_reserva;
	}

	public Date getDt_reserva() {
		return dt_reserva;
	}

	public void setDt_reserva(Date dt_reserva) {
		this.dt_reserva = dt_reserva;
	}

	public Date getDt_prevista_retirada() {
		return dt_prevista_retirada;
	}

	public void setDt_prevista_retirada(Date dt_prevista_retirada) {
		this.dt_prevista_retirada = dt_prevista_retirada;
	}

	public Date getDt_prevista_devolucao() {
		return dt_prevista_devolucao;
	}

	public void setDt_prevista_devolucao(Date dt_prevista_devolucao) {
		this.dt_prevista_devolucao = dt_prevista_devolucao;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result + ((dt_prevista_devolucao == null) ? 0 : dt_prevista_devolucao.hashCode());
		result = prime * result + ((dt_prevista_retirada == null) ? 0 : dt_prevista_retirada.hashCode());
		result = prime * result + ((dt_reserva == null) ? 0 : dt_reserva.hashCode());
		result = prime * result + ((id_reserva == null) ? 0 : id_reserva.hashCode());
		result = prime * result + ((servidor == null) ? 0 : servidor.hashCode());
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
		Reserva other = (Reserva) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (dt_prevista_devolucao == null) {
			if (other.dt_prevista_devolucao != null)
				return false;
		} else if (!dt_prevista_devolucao.equals(other.dt_prevista_devolucao))
			return false;
		if (dt_prevista_retirada == null) {
			if (other.dt_prevista_retirada != null)
				return false;
		} else if (!dt_prevista_retirada.equals(other.dt_prevista_retirada))
			return false;
		if (dt_reserva == null) {
			if (other.dt_reserva != null)
				return false;
		} else if (!dt_reserva.equals(other.dt_reserva))
			return false;
		if (id_reserva == null) {
			if (other.id_reserva != null)
				return false;
		} else if (!id_reserva.equals(other.id_reserva))
			return false;
		if (servidor == null) {
			if (other.servidor != null)
				return false;
		} else if (!servidor.equals(other.servidor))
			return false;
		return true;
	}
	
	

}
