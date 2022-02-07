package br.com.jose.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jose.exerciciossb.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping("/qualquer") // insira na url : (localhost:8080/clientes/qualquer)
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00");
	}

//	@GetMapping("/{id}")
//	public Cliente obterClientePorId1(@PathVariable int id) {
//		return new Cliente(id , "Maria" , "987.654.321-00");
//	}

}
