package br.com.utfpr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table (name="Tb_Emprestimo")
public class Emprestimo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE) 
	@Column (name="id_emprestimo", insertable = true, updatable = false)
	private Integer id_emprestimo;
	
	@Column (name="dt_emprestimo")
	private Date dt_emprestimo;
	
	@Column (name="dt_previsao_dev_emprestimo")
	private Date dt_previsao_dev_emprestimo;
	
	@OneToOne
	@JoinColumn(name = "ra_aluno")
	private Aluno aluno;
	
	@OneToOne
	@JoinColumn (name = "matricula_siape_servidor")
	private Servidor servidor;
	
	@ManyToMany(targetEntity = Obra.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@Fetch(FetchMode.SUBSELECT)
	@JoinTable(name = "Tb_Emprestimo_Obra", joinColumns = @JoinColumn(name = "id_emprestimo"), inverseJoinColumns = @JoinColumn(name = "id_obra", unique=false))
	private List<Obra> obras = new ArrayList<Obra>();

	public Integer getId_emprestimo() {
		return id_emprestimo;
	}

	public void setId_emprestimo(Integer id_emprestimo) {
		this.id_emprestimo = id_emprestimo;
	}

	public Date getDt_emprestimo() {
		return dt_emprestimo;
	}

	public void setDt_emprestimo(Date dt_emprestimo) {
		this.dt_emprestimo = dt_emprestimo;
	}

	public Date getDt_previsao_dev_emprestimo() {
		return dt_previsao_dev_emprestimo;
	}

	public void setDt_previsao_dev_emprestimo(Date dt_previsao_dev_emprestimo) {
		this.dt_previsao_dev_emprestimo = dt_previsao_dev_emprestimo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public List<Obra> getObras() {
		return obras;
	}

	public void setObras(List<Obra> obras) {
		this.obras = obras;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result + ((dt_emprestimo == null) ? 0 : dt_emprestimo.hashCode());
		result = prime * result + ((dt_previsao_dev_emprestimo == null) ? 0 : dt_previsao_dev_emprestimo.hashCode());
		result = prime * result + ((id_emprestimo == null) ? 0 : id_emprestimo.hashCode());
		result = prime * result + ((obras == null) ? 0 : obras.hashCode());
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
		Emprestimo other = (Emprestimo) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (dt_emprestimo == null) {
			if (other.dt_emprestimo != null)
				return false;
		} else if (!dt_emprestimo.equals(other.dt_emprestimo))
			return false;
		if (dt_previsao_dev_emprestimo == null) {
			if (other.dt_previsao_dev_emprestimo != null)
				return false;
		} else if (!dt_previsao_dev_emprestimo.equals(other.dt_previsao_dev_emprestimo))
			return false;
		if (id_emprestimo == null) {
			if (other.id_emprestimo != null)
				return false;
		} else if (!id_emprestimo.equals(other.id_emprestimo))
			return false;
		if (obras == null) {
			if (other.obras != null)
				return false;
		} else if (!obras.equals(other.obras))
			return false;
		if (servidor == null) {
			if (other.servidor != null)
				return false;
		} else if (!servidor.equals(other.servidor))
			return false;
		return true;
	}
	
	
	
		
}
