package br.com.pavaneli.varejo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pavaneli.varejo.dto.UsuarioDto;
import br.com.pavaneli.varejo.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<UsuarioDto> findAll(){
		return usuarioService.findAll();
	}

	@PostMapping
	public void insert(@RequestBody UsuarioDto usuario) {
		usuarioService.insert(usuario);
	}
	
	@PutMapping
	public UsuarioDto alterar(@RequestBody UsuarioDto usuario) {
		return usuarioService.update(usuario);
	}
	
	//http://endereco/usuario/3
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id){
		usuarioService.delete(id);
		return ResponseEntity.ok().build();
	}

}
