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

import br.com.pavaneli.varejo.dto.FornecedorDto;
import br.com.pavaneli.varejo.service.FornecedorService;

@RestController
@RequestMapping(value = "/fornecedor")
@CrossOrigin
public class FornecedorController {
	@Autowired
	private FornecedorService fornecedorService;
	@GetMapping
	public List<FornecedorDto> findAll(){
		return fornecedorService.findAll();
	}
	@PostMapping
	public void inserir(@RequestBody FornecedorDto fornecedor) {
		fornecedorService.insert (fornecedor);
	}
	
	@PutMapping
	public FornecedorDto update(@RequestBody FornecedorDto fornecedor) {
		return fornecedorService.update(fornecedor);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		fornecedorService.delete(id);
		return ResponseEntity.ok().build();
	}
	

}
