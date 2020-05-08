package br.com.utfpr.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "converterCharset")
public class ConverterCharset implements Converter {

 public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) throws ConverterException {
  return value;
 }

 public String getAsString(FacesContext arg0, UIComponent arg1, Object value) throws ConverterException {
  String convertedString = StringUtils.convertUtf8ToIso88591(value);
  return convertedString;
 }
}