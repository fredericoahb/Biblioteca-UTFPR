package br.com.utfpr.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table (name = "Tb_Item_Emprestimo")
public class Item_Emprestimo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_item_emprestimo", insertable = true, updatable = false)
	private Integer id_item_emprestimo;
	
	@Column(name = "situacao_item_emprestimo")
	private boolean situacao_item_emprestimo;
	
	@Column(name = "dt_emprestimo_item_emprestimo")
	private Date dt_emprestimo_item_emprestimo;
	
	@Column (name = "dt_prev_devolucao_item_emprestimo")
	private Date dt_prev_devolucao_item_emprestimo;
	
	@Column(name = "dt_devolucao_item_emprestimo")
	private Date dt_devolucao_item_emprestimo;
	
	@Column(name = "valor_multa_item_emprestimo")
	private Double valor_multa_item_emprestimo;
	
	@OneToOne
	@JoinColumn(name = "id_obra")
	private Obra obra;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_emprestimo")
	private Emprestimo emprestimo;

	@ManyToOne
	@Cascade({ CascadeType.ALL })
	@JoinColumn(name = "id_reserva")
	private Reserva reserva;

	public Integer getId_item_emprestimo() {
		return id_item_emprestimo;
	}

	public void setId_item_emprestimo(Integer id_item_emprestimo) {
		this.id_item_emprestimo = id_item_emprestimo;
	}

	public boolean isSituacao_item_emprestimo() {
		return situacao_item_emprestimo;
	}

	public void setSituacao_item_emprestimo(boolean situacao_item_emprestimo) {
		this.situacao_item_emprestimo = situacao_item_emprestimo;
	}

	public Date getDt_emprestimo_item_emprestimo() {
		return dt_emprestimo_item_emprestimo;
	}

	public void setDt_emprestimo_item_emprestimo(Date dt_emprestimo_item_emprestimo) {
		this.dt_emprestimo_item_emprestimo = dt_emprestimo_item_emprestimo;
	}

	public Date getDt_prev_devolucao_item_emprestimo() {
		return dt_prev_devolucao_item_emprestimo;
	}

	public void setDt_prev_devolucao_item_emprestimo(Date dt_prev_devolucao_item_emprestimo) {
		this.dt_prev_devolucao_item_emprestimo = dt_prev_devolucao_item_emprestimo;
	}

	public Date getDt_devolucao_item_emprestimo() {
		return dt_devolucao_item_emprestimo;
	}

	public void setDt_devolucao_item_emprestimo(Date dt_devolucao_item_emprestimo) {
		this.dt_devolucao_item_emprestimo = dt_devolucao_item_emprestimo;
	}

	public Double getValor_multa_item_emprestimo() {
		return valor_multa_item_emprestimo;
	}

	public void setValor_multa_item_emprestimo(Double valor_multa_item_emprestimo) {
		this.valor_multa_item_emprestimo = valor_multa_item_emprestimo;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dt_devolucao_item_emprestimo == null) ? 0 : dt_devolucao_item_emprestimo.hashCode());
		result = prime * result
				+ ((dt_emprestimo_item_emprestimo == null) ? 0 : dt_emprestimo_item_emprestimo.hashCode());
		result = prime * result
				+ ((dt_prev_devolucao_item_emprestimo == null) ? 0 : dt_prev_devolucao_item_emprestimo.hashCode());
		result = prime * result + ((emprestimo == null) ? 0 : emprestimo.hashCode());
		result = prime * result + ((id_item_emprestimo == null) ? 0 : id_item_emprestimo.hashCode());
		result = prime * result + ((obra == null) ? 0 : obra.hashCode());
		result = prime * result + ((reserva == null) ? 0 : reserva.hashCode());
		result = prime * result + (situacao_item_emprestimo ? 1231 : 1237);
		result = prime * result + ((valor_multa_item_emprestimo == null) ? 0 : valor_multa_item_emprestimo.hashCode());
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
		Item_Emprestimo other = (Item_Emprestimo) obj;
		if (dt_devolucao_item_emprestimo == null) {
			if (other.dt_devolucao_item_emprestimo != null)
				return false;
		} else if (!dt_devolucao_item_emprestimo.equals(other.dt_devolucao_item_emprestimo))
			return false;
		if (dt_emprestimo_item_emprestimo == null) {
			if (other.dt_emprestimo_item_emprestimo != null)
				return false;
		} else if (!dt_emprestimo_item_emprestimo.equals(other.dt_emprestimo_item_emprestimo))
			return false;
		if (dt_prev_devolucao_item_emprestimo == null) {
			if (other.dt_prev_devolucao_item_emprestimo != null)
				return false;
		} else if (!dt_prev_devolucao_item_emprestimo.equals(other.dt_prev_devolucao_item_emprestimo))
			return false;
		if (emprestimo == null) {
			if (other.emprestimo != null)
				return false;
		} else if (!emprestimo.equals(other.emprestimo))
			return false;
		if (id_item_emprestimo == null) {
			if (other.id_item_emprestimo != null)
				return false;
		} else if (!id_item_emprestimo.equals(other.id_item_emprestimo))
			return false;
		if (obra == null) {
			if (other.obra != null)
				return false;
		} else if (!obra.equals(other.obra))
			return false;
		if (reserva == null) {
			if (other.reserva != null)
				return false;
		} else if (!reserva.equals(other.reserva))
			return false;
		if (situacao_item_emprestimo != other.situacao_item_emprestimo)
			return false;
		if (valor_multa_item_emprestimo == null) {
			if (other.valor_multa_item_emprestimo != null)
				return false;
		} else if (!valor_multa_item_emprestimo.equals(other.valor_multa_item_emprestimo))
			return false;
		return true;
	}

	
}
