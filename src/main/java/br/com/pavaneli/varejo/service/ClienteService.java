package br.com.pavaneli.varejo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pavaneli.varejo.dto.ClienteDto;
import br.com.pavaneli.varejo.entity.Cliente;
import br.com.pavaneli.varejo.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public List<ClienteDto> findAll(){
		List<Cliente> clientes = clienteRepository.findAll();
		return clientes.stream().map(ClienteDto::new).toList();
	}
	public void insert(ClienteDto clienteDto) {
		Cliente cliente = new Cliente(clienteDto);
		clienteRepository.save(cliente);
	}
	public ClienteDto update(ClienteDto clienteDto) {
		Cliente cliente = new Cliente(clienteDto);
		return new ClienteDto(clienteRepository.save(cliente));
	}
	public void delete(Long id) {
		Cliente cliente = clienteRepository.findById(id).get();
		clienteRepository.delete(cliente);
	}
	public ClienteDto findById(Long id) {
		return new ClienteDto(clienteRepository.findById(id).get());
	}
	

}
