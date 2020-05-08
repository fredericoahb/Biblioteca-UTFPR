package br.com.utfpr.web.converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("dateConverter")
public class DateConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		System.out.println("Dentro do metodo que retorna um OBJ");
		try {
			if (value != null && !value.equals("")) {
				java.util.Date dataUtil = new SimpleDateFormat("dd/MM/yyyy").parse(value);
				java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
				return dataSql;
			} else {
				return null;
			}

		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a execu��o do programa: " + e.getMessage());
		}
		return null;
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		System.out.println("Dentro do metodo que retorna uma STRING");
		try {
			if (value != null && !value.equals("")) {
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				String dataTexto = df.format(value);
				return dataTexto;
			} else {
				return "";
			}

		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a execu��o do programa: " + e.getMessage());
		}
		return "";
	}

}
