package br.com.pavaneli.varejo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pavaneli.varejo.dto.VendedorDto;
import br.com.pavaneli.varejo.entity.Vendedor;
import br.com.pavaneli.varejo.repository.VendedorRepository;

@Service
public class VendedorService {
	@Autowired
	private VendedorRepository vendedorRepository;
	
	
	public List<VendedorDto> findAll(){
		List<Vendedor> vendedores = vendedorRepository.findAll();
		return vendedores.stream().map(VendedorDto::new).toList();
	}
	public void insert(VendedorDto vendedorDto) {
		Vendedor vendedor = new Vendedor(vendedorDto);
		vendedorRepository.save(vendedor);
	}
	public VendedorDto update(VendedorDto vendedorDto) {
		Vendedor vendedor = new Vendedor(vendedorDto);
		return new VendedorDto(vendedorRepository.save(vendedor));
	}
	public void delete(Long id) {
		Vendedor vendedor = vendedorRepository.findById(id).get();
		vendedorRepository.delete(vendedor);
	}
	public VendedorDto findById(Long id) {
		return new VendedorDto(vendedorRepository.findById(id).get());
	}
	

}
