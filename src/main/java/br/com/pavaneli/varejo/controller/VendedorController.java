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

import br.com.pavaneli.varejo.dto.VendedorDto;
import br.com.pavaneli.varejo.service.VendedorService;

@RestController
@RequestMapping(value = "/vendedor")
@CrossOrigin
public class VendedorController {
	@Autowired
	private VendedorService vendedorService;
	@GetMapping
	public List<VendedorDto> findAll(){
		return vendedorService.findAll();
	}
	@PostMapping
	public void inserir(@RequestBody VendedorDto vendedor) {
		vendedorService.insert (vendedor);
	}
	
	@PutMapping
	public VendedorDto update(@RequestBody VendedorDto vendedor) {
		return vendedorService.update(vendedor);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		vendedorService.delete(id);
		return ResponseEntity.ok().build();
	}
	

}
