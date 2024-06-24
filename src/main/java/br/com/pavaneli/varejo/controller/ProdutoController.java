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

import br.com.pavaneli.varejo.dto.ProdutoDto;
import br.com.pavaneli.varejo.service.ProdutoService;

@RestController
@RequestMapping(value = "/produto")
@CrossOrigin
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;
	@GetMapping
	public List<ProdutoDto> findAll(){
		return produtoService.findAll();
	}
	@PostMapping
	public void inserir(@RequestBody ProdutoDto produto) {
		produtoService.insert (produto);
	}
	
	@PutMapping
	public ProdutoDto update(@RequestBody ProdutoDto produto) {
		return produtoService.update(produto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		produtoService.delete(id);
		return ResponseEntity.ok().build();
	}
	

}
