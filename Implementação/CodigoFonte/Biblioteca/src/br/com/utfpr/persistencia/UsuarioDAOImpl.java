package br.com.utfpr.persistencia;

import java.util.List;

import org.hibernate.Session;

import br.com.utfpr.dao.UsuarioDAO;
import br.com.utfpr.model.Aluno;
import br.com.utfpr.model.Servidor;
import br.com.utfpr.model.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO{

	@SuppressWarnings("unused")
	private Session	session;
	    
	public void setSession(Session session) {
		this.session = session;	
	}
	
	@Override
	public void salvar(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object carregar(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listarPorAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listarPorServidor(Servidor servidor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean autenciarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean bloquearDesbloquearUsuario(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
