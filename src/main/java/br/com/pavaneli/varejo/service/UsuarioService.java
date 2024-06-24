package br.com.pavaneli.varejo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pavaneli.varejo.dto.UsuarioDto;
import br.com.pavaneli.varejo.entity.Usuario;
import br.com.pavaneli.varejo.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<UsuarioDto> findAll(){
		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios.stream().map(UsuarioDto::new).toList();
	}
	public void insert(UsuarioDto usuario) {
		Usuario usuarioEntity = new Usuario(usuario);		
		usuarioRepository.save(usuarioEntity);
	}
	
	public UsuarioDto update(UsuarioDto usuario) {
		Usuario usuarioEntity = new Usuario(usuario);		
		return new UsuarioDto(usuarioRepository.save(usuarioEntity));
	}
	public void delete(Long id) {
		Usuario usuario = usuarioRepository.findById(id).get();
		usuarioRepository.delete(usuario);
	}
	public UsuarioDto buscarPorId(Long id) {
		return new UsuarioDto(usuarioRepository.findById(id).get());
	}
}
