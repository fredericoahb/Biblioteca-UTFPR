package br.com.utfpr.persistencia;

import br.com.utfpr.dao.UsuarioDAO;

public class DAOFactory {

	
	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}

}
