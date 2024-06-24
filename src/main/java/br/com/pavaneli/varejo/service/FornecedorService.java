package br.com.pavaneli.varejo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pavaneli.varejo.dto.FornecedorDto;
import br.com.pavaneli.varejo.entity.Fornecedor;
import br.com.pavaneli.varejo.repository.FornecedorRepository;

@Service
public class FornecedorService {
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	
	public List<FornecedorDto> findAll(){
		List<Fornecedor> fornecedores = fornecedorRepository.findAll();
		return fornecedores.stream().map(FornecedorDto::new).toList();
	}
	public void insert(FornecedorDto fornecedorDto) {
		Fornecedor fornecedor = new Fornecedor(fornecedorDto);
		fornecedorRepository.save(fornecedor);
	}
	public FornecedorDto update(FornecedorDto fornecedorDto) {
		Fornecedor fornecedor = new Fornecedor(fornecedorDto);
		return new FornecedorDto(fornecedorRepository.save(fornecedor));
	}
	public void delete(Long id) {
		Fornecedor fornecedor = fornecedorRepository.findById(id).get();
		fornecedorRepository.delete(fornecedor);
	}
	public FornecedorDto findById(Long id) {
		return new FornecedorDto(fornecedorRepository.findById(id).get());
	}
	

}
