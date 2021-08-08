package com.jose.myapi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jose.myapi.domain.Usuario;
import com.jose.myapi.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping (value = "/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Integer id) {
			Usuario obj = this.service.findById(id);
			return ResponseEntity.ok().body(obj);
		}
	
}

