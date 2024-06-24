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

import br.com.pavaneli.varejo.dto.ClienteDto;
import br.com.pavaneli.varejo.service.ClienteService;

@RestController
@RequestMapping(value = "/cliente")
@CrossOrigin
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	@GetMapping
	public List<ClienteDto> findAll(){
		return clienteService.findAll();
	}
	@PostMapping
	public void inserir(@RequestBody ClienteDto cliente) {
		clienteService.insert (cliente);
	}
	
	@PutMapping
	public ClienteDto update(@RequestBody ClienteDto cliente) {
		return clienteService.update(cliente);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		clienteService.delete(id);
		return ResponseEntity.ok().build();
	}
	

}
