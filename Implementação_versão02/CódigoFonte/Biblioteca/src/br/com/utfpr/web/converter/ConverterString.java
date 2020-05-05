package br.com.utfpr.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = String.class, value="Test")
public class ConverterString implements Converter {

    //vem da tela / request
 public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) throws ConverterException {
        if ("".equals(value.toString().trim())) {
            return null;
        }

  String convertedString = StringUtils.convertUtf8ToIso88591(value);
  return convertedString;
 }

 //vai para tela / response
 public String getAsString(FacesContext arg0, UIComponent arg1, Object value) throws ConverterException {
  String convertedString = StringUtils.convertUtf8ToIso88591(value);
  return convertedString;
 }
}