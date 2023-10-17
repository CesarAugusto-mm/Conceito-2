package com.http.httpps.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("TesteApi")
public class TesteController {
	
	@GetMapping
	/*Obter recurso*/
	public String retornandoString () {
		return "HTTP e HTTPS são protocolos de segurança na Internet bastante evidentes quando acessamos sites "
				+ "de banco ou lojas virtuais para realizar transações financeiras.";
	}
	
	@GetMapping("/1")
	/*Obter recurso*/
	public String retornandoStringHttps () {
		return "Geralmente, eles aparecem por meio de avisos para verificar o cadeado de segurança ou "
				+ "observar a sigla HTTPS";
	}
	
	@PostMapping
	/*Criar um recurso*/
	public String post (@RequestBody String texto) {	
	System.out.println(texto);	
	return texto;

	}
	
	@PutMapping
	/*Atualizar recurso*/
	public String put (@RequestBody String texto) {
		System.out.println(texto);
		return texto;
	}
	
	@PatchMapping
	/*Fazer a alteração de valores específicos de um recurso*/
	public String patch (@RequestBody String texto) {
		System.out.println(texto);
		return texto;
	}
	
	@DeleteMapping
	/*Remoção recurso*/
	public String deletado () {
		return "deleta alguma coisa pelo amor!!!";
	}	
	
}
