package br.com.utfpr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table (name="Tb_Emprestimo")
public class Emprestimo implements Serializable {
	
	/**
	 *  Criado constantes para diferenciar devolução completa e devolução parcial.
	 */
	public static final String DEVOLUCAO_COMPLETA = "Dev. Completa";
	public static final String DEVOLUCAO_PARCIAL = "Dev. Parcial";
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE) 
	@Column (name="id_emprestimo", insertable = true, updatable = false)
	private Integer id_emprestimo;
	
	@Column(name = "situacao_emprestimo", length = 10)
	private String situacao_emprestimo;
	
	
	@OneToMany(targetEntity = Item_Emprestimo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_item_emprestimo")
	private List<Item_Emprestimo> itens_emprestimo = new ArrayList<Item_Emprestimo>();
	
	@OneToOne
	@JoinColumn(name = "ra_aluno")
	private Aluno aluno;
	
	@OneToOne
	@JoinColumn(name = "siape_funcionario")
	private Funcionario funcionario;
	
	
	@OneToOne
	@JoinColumn(name = "reserva_id")
	@NotFound(action = NotFoundAction.IGNORE)
	private Reserva reserva;


	public Integer getId_emprestimo() {
		return id_emprestimo;
	}


	public void setId_emprestimo(Integer id_emprestimo) {
		this.id_emprestimo = id_emprestimo;
	}


	public String getSituacao_emprestimo() {
		return situacao_emprestimo;
	}


	public void setSituacao_emprestimo(String situacao_emprestimo) {
		this.situacao_emprestimo = situacao_emprestimo;
	}


	public List<Item_Emprestimo> getItens_emprestimo() {
		return itens_emprestimo;
	}


	public void setItens_emprestimo(List<Item_Emprestimo> itens_emprestimo) {
		this.itens_emprestimo = itens_emprestimo;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public Reserva getReserva() {
		return reserva;
	}


	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}


	public static String getDevolucaoCompleta() {
		return DEVOLUCAO_COMPLETA;
	}


	public static String getDevolucaoParcial() {
		return DEVOLUCAO_PARCIAL;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + ((id_emprestimo == null) ? 0 : id_emprestimo.hashCode());
		result = prime * result + ((itens_emprestimo == null) ? 0 : itens_emprestimo.hashCode());
		result = prime * result + ((reserva == null) ? 0 : reserva.hashCode());
		result = prime * result + ((situacao_emprestimo == null) ? 0 : situacao_emprestimo.hashCode());
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
		Emprestimo other = (Emprestimo) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (id_emprestimo == null) {
			if (other.id_emprestimo != null)
				return false;
		} else if (!id_emprestimo.equals(other.id_emprestimo))
			return false;
		if (itens_emprestimo == null) {
			if (other.itens_emprestimo != null)
				return false;
		} else if (!itens_emprestimo.equals(other.itens_emprestimo))
			return false;
		if (reserva == null) {
			if (other.reserva != null)
				return false;
		} else if (!reserva.equals(other.reserva))
			return false;
		if (situacao_emprestimo == null) {
			if (other.situacao_emprestimo != null)
				return false;
		} else if (!situacao_emprestimo.equals(other.situacao_emprestimo))
			return false;
		return true;
	}


	
}

