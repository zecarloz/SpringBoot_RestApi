package br.com.jose.exerciciossb.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {
	
	@GetMapping
	public String get() {
		return "REQUISICAO GET";
				
	}
	
	@PostMapping
	public String post() {
		return "REQUISICAO POST";
				
	}
	
	@PutMapping
	public String put() {
		return "REQUISICAO PUT";
				
	}
	
	@PatchMapping
	public String patch() {
		return "REQUISICAO PATCH";
				
	}
	
	@DeleteMapping
	public String delete() {
		return "REQUISICAO DELETE";
				
	}
}