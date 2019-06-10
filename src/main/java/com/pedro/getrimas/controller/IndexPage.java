package com.pedro.getrimas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.getrimas.model.Palavra;
import com.pedro.getrimas.util.LeitorPalavras;

@RestController
@RequestMapping("/index")
public class IndexPage {

	@RequestMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Palavra> getJson() {
		
		List<Palavra> entities = getPalavras();
		return entities;
	}
	
	@RequestMapping("/insertPalavras")
	public String insert() {
		LeitorPalavras l = new LeitorPalavras();
		l.lerArq();
		return "OK";
	}
	
	private List<Palavra> getPalavras() {
		List<Palavra> palavras = new ArrayList();
		
		palavras.add(new Palavra(1, "Pedro"));
		palavras.add(new Palavra(2, "Joao"));
		palavras.add(new Palavra(3, "felipe"));
		palavras.add(new Palavra(4, "jose"));
		palavras.add(new Palavra(5, "maria"));
		palavras.add(new Palavra(6, "instante"));
		palavras.add(new Palavra(7, "colchao"));
		palavras.add(new Palavra(8, "lalala"));
		return palavras;
	}
	
}
