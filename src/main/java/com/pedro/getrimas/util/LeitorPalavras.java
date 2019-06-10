package com.pedro.getrimas.util;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;

import com.pedro.getrimas.model.Palavra;
import com.pedro.getrimas.repository.PalavraRepository;

public class LeitorPalavras {
	
	@Autowired
	private PalavraRepository pr;
	
	public void lerArq() {
		
		String path = "C:\\Users\\Pedro\\Desktop\\palavras.txt";
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(path));
			System.out.println("Achei o arquivo");
			while(br.ready()) {
				String linha = br.readLine();
				System.out.println(linha);
				//fazer a inserção no banco de dados
				Palavra p = new Palavra(1, linha);
				//if(p!=null)
				pr.save(p);
			}
			br.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
