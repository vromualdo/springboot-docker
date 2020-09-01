package br.com.purple.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.purple.model.Usuario;

@RestController
@RequestMapping("/controller")
public class UsuarioController {

	
	@GetMapping("/lista")
    public ResponseEntity<List<Usuario>> listar() throws Exception  {
		
		
		List<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Vagner", 38, "M"));
		lista.add(new Usuario("Ana", 94, "F"));
		
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
}
