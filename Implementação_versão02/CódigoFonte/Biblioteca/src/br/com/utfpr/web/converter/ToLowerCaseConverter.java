package br.com.utfpr.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("toLowerCaseConverter")
public class ToLowerCaseConverter implements Converter {

    public String getAsString(FacesContext context, UIComponent component, Object value) {
    	String convertedString = StringUtils.convertUtf8ToIso88591(value);
    	return convertedString.toLowerCase();
    	//return (String) value; // Or (value != null) ? value.toString().toUpperCase() : null;
    }

    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return (value != null) ? value.toLowerCase() : null;
    }

}