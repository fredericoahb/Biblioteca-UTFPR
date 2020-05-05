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
@Table(name = "Tb_Usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_usuario", insertable = true, updatable = false)
	private Integer id_usuario;

	@Column(name = "situacao_usuario")
	private boolean situacao_usuario;

	@Column(name = "nome_usuario", length = 100)
	private String nome_usuario;

	@Column(name = "logradouro_usuario", length = 200)
	private String logradouro_usuario;

	@Column(name = "bairro_usuario", length = 60)
	private String bairro_usuario;

	@Column(name = "cep_usuario")
	private Integer cep_usuario;

	@OneToOne
	@JoinColumn(name = "id_estado")
	private Estado estado;

	@OneToOne
	@JoinColumn(name = "id_cidade")
	private Cidade cidade;

	@Column(name = "dt_nascimento_usuario")
	private Date dt_nascimento_usuario;

	@Column (name = "email_usuario", length = 50)
	private String email_usuario;
	
	@Column(name = "cpf_usuario", length = 15)
	private String cpf_usuario;

	@Column(name = "senha_usuario", length = 20)
	private String senha_usuario;

	@OneToOne
	@JoinColumn(name = "id_categoria_leito")
	private Categoria_Leitor categoria_leitor;

	@OneToMany(targetEntity = Telefone.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_telefone")
	private List<Telefone> telefones = new ArrayList<Telefone>();

	@OneToOne
	@JoinColumn(name = "id_emprestimo")
	private Emprestimo emprestimo;

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public boolean isSituacao_usuario() {
		return situacao_usuario;
	}

	public void setSituacao_usuario(boolean situacao_usuario) {
		this.situacao_usuario = situacao_usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getLogradouro_usuario() {
		return logradouro_usuario;
	}

	public void setLogradouro_usuario(String logradouro_usuario) {
		this.logradouro_usuario = logradouro_usuario;
	}

	public String getBairro_usuario() {
		return bairro_usuario;
	}

	public void setBairro_usuario(String bairro_usuario) {
		this.bairro_usuario = bairro_usuario;
	}

	public Integer getCep_usuario() {
		return cep_usuario;
	}

	public void setCep_usuario(Integer cep_usuario) {
		this.cep_usuario = cep_usuario;
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

	public Date getDt_nascimento_usuario() {
		return dt_nascimento_usuario;
	}

	public void setDt_nascimento_usuario(Date dt_nascimento_usuario) {
		this.dt_nascimento_usuario = dt_nascimento_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public String getCpf_usuario() {
		return cpf_usuario;
	}

	public void setCpf_usuario(String cpf_usuario) {
		this.cpf_usuario = cpf_usuario;
	}

	public String getSenha_usuario() {
		return senha_usuario;
	}

	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}

	public Categoria_Leitor getCategoria_leitor() {
		return categoria_leitor;
	}

	public void setCategoria_leitor(Categoria_Leitor categoria_leitor) {
		this.categoria_leitor = categoria_leitor;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro_usuario == null) ? 0 : bairro_usuario.hashCode());
		result = prime * result + ((categoria_leitor == null) ? 0 : categoria_leitor.hashCode());
		result = prime * result + ((cep_usuario == null) ? 0 : cep_usuario.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((cpf_usuario == null) ? 0 : cpf_usuario.hashCode());
		result = prime * result + ((dt_nascimento_usuario == null) ? 0 : dt_nascimento_usuario.hashCode());
		result = prime * result + ((email_usuario == null) ? 0 : email_usuario.hashCode());
		result = prime * result + ((emprestimo == null) ? 0 : emprestimo.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((id_usuario == null) ? 0 : id_usuario.hashCode());
		result = prime * result + ((logradouro_usuario == null) ? 0 : logradouro_usuario.hashCode());
		result = prime * result + ((nome_usuario == null) ? 0 : nome_usuario.hashCode());
		result = prime * result + ((senha_usuario == null) ? 0 : senha_usuario.hashCode());
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
		if (bairro_usuario == null) {
			if (other.bairro_usuario != null)
				return false;
		} else if (!bairro_usuario.equals(other.bairro_usuario))
			return false;
		if (categoria_leitor == null) {
			if (other.categoria_leitor != null)
				return false;
		} else if (!categoria_leitor.equals(other.categoria_leitor))
			return false;
		if (cep_usuario == null) {
			if (other.cep_usuario != null)
				return false;
		} else if (!cep_usuario.equals(other.cep_usuario))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (cpf_usuario == null) {
			if (other.cpf_usuario != null)
				return false;
		} else if (!cpf_usuario.equals(other.cpf_usuario))
			return false;
		if (dt_nascimento_usuario == null) {
			if (other.dt_nascimento_usuario != null)
				return false;
		} else if (!dt_nascimento_usuario.equals(other.dt_nascimento_usuario))
			return false;
		if (email_usuario == null) {
			if (other.email_usuario != null)
				return false;
		} else if (!email_usuario.equals(other.email_usuario))
			return false;
		if (emprestimo == null) {
			if (other.emprestimo != null)
				return false;
		} else if (!emprestimo.equals(other.emprestimo))
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
		if (logradouro_usuario == null) {
			if (other.logradouro_usuario != null)
				return false;
		} else if (!logradouro_usuario.equals(other.logradouro_usuario))
			return false;
		if (nome_usuario == null) {
			if (other.nome_usuario != null)
				return false;
		} else if (!nome_usuario.equals(other.nome_usuario))
			return false;
		if (senha_usuario == null) {
			if (other.senha_usuario != null)
				return false;
		} else if (!senha_usuario.equals(other.senha_usuario))
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
