package br.com.utfpr.controle;

import java.util.ResourceBundle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.RequestDispatcher;

import br.com.utfpr.web.util.FacesUtil;

@ManagedBean(name = "loginMB")
@SessionScoped
public class LoginMB {

	private Integer opcao;
	private Integer opcaoTipo;
	private String parametro;
	private ResourceBundle bundle = null;
	private FacesUtil faces = new FacesUtil();

	private String retornoInfo;

	private Integer tipoLogin;

	
	public LoginMB() {
		bundle = ResourceBundle.getBundle("br.com.utfpr.idioma.messages", faces.carregaLocale());
	}


	public Integer getTipoLogin() {
		return tipoLogin;
	}

	public void setTipoLogin(Integer tipoLogin) {
		this.tipoLogin = tipoLogin;
	}

	public String recuperarSenha() {
		return "recuperar_senha";
	}

	public String voltarLogin() {
		return "voltar";
	}

	public String loginEmpresa() {
		this.setTipoLogin(2);
		return "login";
	}

	public String loginCandidato() {
		this.setTipoLogin(1);
		return "login";
	}

	public String logar() {
		try {
			RequestDispatcher dispatcher = FacesUtil.getServletRequest()
					.getRequestDispatcher("/j_spring_security_check");
			dispatcher.forward(FacesUtil.getServletRequest(), FacesUtil.getServletResponse());
			FacesContext.getCurrentInstance().responseComplete();
			String login = this.LoginAutenticado();
			if (login.contains(".")) {
				// this.montaMenuBarCandidato(cadastro);
				retornoInfo = "/paginas/templates/infoUsuario.xhtml";
			} else if (!login.contains(".")) {
				// this.montaMenuBarUsuario(usuario);
				retornoInfo = "/paginas/templates/info.xhtml";
			}
		} catch (Exception ex) {
			FacesUtil.exibirMensagemErro(ex.getMessage());
			return null;
		}
		return null;
	}

	public String logout() {
		FacesUtil.exibirMensagemAlerta(bundle.getString("msg_finaliza_sessao_sucesso"));
		try {
			RequestDispatcher dispatcher = FacesUtil.getServletRequest()
					.getRequestDispatcher("/j_spring_security_logout");
			dispatcher.forward(FacesUtil.getServletRequest(), FacesUtil.getServletResponse());
			FacesContext.getCurrentInstance().responseComplete();
		} catch (Exception ex) {
			FacesUtil.exibirMensagemErro(bundle.getString("msg_finaliza_sessao_falha"));
			return null;
		}
		return null;
	}

	public void recuperaSenha() {
		if (opcaoTipo == 0) {

		} else if (opcaoTipo == 1) {

		}
	}

	public Integer getOpcao() {
		return opcao;
	}

	public void setOpcao(Integer opcao) {
		this.opcao = opcao;
	}

	public Integer getOpcaoTipo() {
		return opcaoTipo;
	}

	public void setOpcaoTipo(Integer opcaoTipo) {
		this.opcaoTipo = opcaoTipo;
	}

	public String getParametro() {
		return parametro;
	}

	public void setParametro(String parametro) {
		this.parametro = parametro;
	}

	public String getRetornoInfo() {
		return retornoInfo;
	}

	public void setRetornoInfo(String retornoInfo) {
		this.retornoInfo = retornoInfo;
	}

	public String LoginAutenticado() {
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext external = context.getExternalContext();
		return external.getRemoteUser();
	}



	public String mascara() {
		return bundle.getString("lbl_msk_cpf");
	}

	public String titulo() {
		return bundle.getString("lbl_login_titulo_1");
	}

}
