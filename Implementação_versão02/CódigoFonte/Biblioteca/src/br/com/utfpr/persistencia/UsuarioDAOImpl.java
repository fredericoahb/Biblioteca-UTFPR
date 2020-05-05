package br.com.utfpr.persistencia;

import org.hibernate.Session;

import br.com.utfpr.dao.UsuarioDAO;
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
	public Boolean autenciarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscarPorLogin(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario recuperarSenha(String cpf, Integer ra_aluno, Integer siape_funcionario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean bloquearDesbloquearUsuario(Integer id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
