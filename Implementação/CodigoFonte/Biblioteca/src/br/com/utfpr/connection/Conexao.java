package br.com.utfpr.connection;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;


@Component("dataSource")
public class Conexao extends DriverManagerDataSource {
	/*
	 *Conexao com Postgres 9 */ 
	 
	public Conexao(){
		
		/* Conexao Local */  
			this.setDriverClassName("org.postgresql.Driver");
		  	this.setUrl("jdbc:postgresql://localhost:5432/BibliotecaUTFPR");
		 	this.setUsername("postgres");
		 	this.setPassword("N@lson1br");
	}
	
	
	
}
