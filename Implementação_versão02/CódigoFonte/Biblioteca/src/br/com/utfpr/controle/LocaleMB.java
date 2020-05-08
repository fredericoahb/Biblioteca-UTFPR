package br.com.utfpr.controle;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
@ManagedBean(name="localeMB")
@SessionScoped
	public class LocaleMB{
	 private Locale currentLocale = null;

	 public LocaleMB(){
		 currentLocale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
	 }
	 
	 public void inglesLocale() {
	  UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
	  currentLocale = Locale.US;
	  viewRoot.setLocale(currentLocale);
	 }

	 public void portuguesLocale() {
	  UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
	  currentLocale = new Locale("pt", "BR");
	  viewRoot.setLocale(currentLocale);
	 }
	 
	 public void espanholLocale() {
		  UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		  currentLocale = new Locale("es", "ES");
		  viewRoot.setLocale(currentLocale);
		 }

	 public Locale getCurrentLocale() {
		  return currentLocale;
	 }
	 
	 
}
