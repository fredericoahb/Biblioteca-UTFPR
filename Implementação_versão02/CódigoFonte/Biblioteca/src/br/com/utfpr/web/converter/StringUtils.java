package br.com.utfpr.web.converter;

public class StringUtils {
	 /**
	  * Verifica se valor string do objeto passado como parametro e UTF-8 e entao converte para ISO-8859-1
	  */
	 public static String convertUtf8ToIso88591(Object value) {
	  if (value instanceof String == false) {
	      return value.toString();
	  }
	     
	     String originalValue = (String) value;

	  // verifica se e UTF-8 (se tem caracteres especiais)
	  if (originalValue.contains("�") || originalValue.contains("�")) {
	   java.nio.charset.Charset utf8charset = java.nio.charset.Charset.forName("UTF-8");
	   java.nio.charset.Charset iso88591charset = java.nio.charset.Charset.forName("ISO-8859-1");
	   java.nio.ByteBuffer inputBuffer = java.nio.ByteBuffer.wrap(originalValue.getBytes());
	   // decode UTF-8
	   java.nio.CharBuffer data = utf8charset.decode(inputBuffer);
	   // encode ISO-8559-1
	   java.nio.ByteBuffer outputBuffer = iso88591charset.encode(data);
	   byte[] outputData = outputBuffer.array();

	   String convertedString = new String(outputData);

	   // se a conversao deu errado retorna o valor original
	   if (convertedString.contains("?")) {
	    return originalValue;
	   }

	   // retorna o valor convertido
	   return convertedString;
	  }

	  return originalValue;
	 }
	}