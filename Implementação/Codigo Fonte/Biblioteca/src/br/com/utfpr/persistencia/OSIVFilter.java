package br.com.utfpr.persistencia;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;

public class OSIVFilter implements Filter {

	private SessionFactory sf;
	private Logger log = Logger.getLogger(OSIVFilter.class);

	public void init(FilterConfig fConfig) throws ServletException {
		// Obtém a SessionFactory
		sf = HibernateUtil.getSessionFactory();
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		try {

			// Inicia a transação
			sf.getCurrentSession().beginTransaction();

			// Chama o Servlet
			chain.doFilter(request, response);

			// Comita a transação
			sf.getCurrentSession().getTransaction().commit();

			// Fecha a session
			sf.getCurrentSession().close();
			
		} catch (Throwable t1) {
			try {
				// Faz rollback
				if (sf.getCurrentSession().getTransaction().isActive()) {
					sf.getCurrentSession().getTransaction().rollback();
				}
			} catch (Throwable t2) {
				log.error("Não conseguiu fazer rollback", t2);
			}
			throw new ServletException(t1);
		}

	}

	public void destroy() {

	}

}
