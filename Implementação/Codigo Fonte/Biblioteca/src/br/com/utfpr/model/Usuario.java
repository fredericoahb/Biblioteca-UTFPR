package br.com.utfpr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table (name="Tb_Usuario")
public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE) 
	@Column (name="id_usuario", insertable = true, updatable = false)
	private Integer id_usuario;
	
	@Column (name="nome_usuario",  length=100)
	private String nome_usuario;
	
	@Column (name="endereco_usuario",  length=200)
	private String endereco_usuario;
	
	@Column (name="dt_nascimento_usuario")
	private Date dt_nascimento_usuario;

	@OneToMany(targetEntity = Emprestimo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_emprestimo")
	private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	@OneToMany(targetEntity = Telefone.class, cascade = CascadeType.ALL)
	@JoinColumn (name = "id_telefone")
	private List<Telefone> telefones = new ArrayList<Telefone>();
	
	@Column(name = "situacao_usuario")
	private boolean situacao_usuario;
	
	@OneToOne
	@JoinColumn (name="id_estado")
	private Estado estado;
	
	@OneToOne
	@JoinColumn (name="id_cidade")
	private Cidade cidade;

	@OneToOne
	@JoinColumn (name="id_categoria_leito")
	private Categoria_Leitor categoria_leitor;

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getEndereco_usuario() {
		return endereco_usuario;
	}

	public void setEndereco_usuario(String endereco_usuario) {
		this.endereco_usuario = endereco_usuario;
	}

	public Date getDt_nascimento_usuario() {
		return dt_nascimento_usuario;
	}

	public void setDt_nascimento_usuario(Date dt_nascimento_usuario) {
		this.dt_nascimento_usuario = dt_nascimento_usuario;
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public boolean isSituacao_usuario() {
		return situacao_usuario;
	}

	public void setSituacao_usuario(boolean situacao_usuario) {
		this.situacao_usuario = situacao_usuario;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Categoria_Leitor getCategoria_leitor() {
		return categoria_leitor;
	}

	public void setCategoria_leitor(Categoria_Leitor categoria_leitor) {
		this.categoria_leitor = categoria_leitor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria_leitor == null) ? 0 : categoria_leitor.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((dt_nascimento_usuario == null) ? 0 : dt_nascimento_usuario.hashCode());
		result = prime * result + ((emprestimos == null) ? 0 : emprestimos.hashCode());
		result = prime * result + ((endereco_usuario == null) ? 0 : endereco_usuario.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((id_usuario == null) ? 0 : id_usuario.hashCode());
		result = prime * result + ((nome_usuario == null) ? 0 : nome_usuario.hashCode());
		result = prime * result + (situacao_usuario ? 1231 : 1237);
		result = prime * result + ((telefones == null) ? 0 : telefones.hashCode());
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
		Usuario other = (Usuario) obj;
		if (categoria_leitor == null) {
			if (other.categoria_leitor != null)
				return false;
		} else if (!categoria_leitor.equals(other.categoria_leitor))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (dt_nascimento_usuario == null) {
			if (other.dt_nascimento_usuario != null)
				return false;
		} else if (!dt_nascimento_usuario.equals(other.dt_nascimento_usuario))
			return false;
		if (emprestimos == null) {
			if (other.emprestimos != null)
				return false;
		} else if (!emprestimos.equals(other.emprestimos))
			return false;
		if (endereco_usuario == null) {
			if (other.endereco_usuario != null)
				return false;
		} else if (!endereco_usuario.equals(other.endereco_usuario))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (id_usuario == null) {
			if (other.id_usuario != null)
				return false;
		} else if (!id_usuario.equals(other.id_usuario))
			return false;
		if (nome_usuario == null) {
			if (other.nome_usuario != null)
				return false;
		} else if (!nome_usuario.equals(other.nome_usuario))
			return false;
		if (situacao_usuario != other.situacao_usuario)
			return false;
		if (telefones == null) {
			if (other.telefones != null)
				return false;
		} else if (!telefones.equals(other.telefones))
			return false;
		return true;
	}

	
}
