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

import br.com.pavaneli.varejo.dto.GrupoDto;
import br.com.pavaneli.varejo.service.GrupoService;

@RestController
@RequestMapping(value = "/grupo")
@CrossOrigin
public class GrupoController {
	
	@Autowired
	private GrupoService grupoService;
	
	@GetMapping
	public List<GrupoDto> findAll(){
		return grupoService.findAll();
	}

	@PostMapping
	public void insert(@RequestBody GrupoDto grupo) {
		grupoService.insert(grupo);
	}
	
	@PutMapping
	public GrupoDto alterar(@RequestBody GrupoDto grupo) {
		return grupoService.update(grupo);
	}
	
	//http://endereco/grupo/3
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id){
		grupoService.delete(id);
		return ResponseEntity.ok().build();
	}

}
