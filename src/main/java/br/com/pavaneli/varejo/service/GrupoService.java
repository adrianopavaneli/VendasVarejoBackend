package br.com.pavaneli.varejo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pavaneli.varejo.dto.GrupoDto;
import br.com.pavaneli.varejo.entity.Grupo;
import br.com.pavaneli.varejo.repository.GrupoRepository;

@Service
public class GrupoService {
	@Autowired
	private GrupoRepository grupoRepository;
	
	public List<GrupoDto> findAll(){
		List<Grupo> grupos = grupoRepository.findAll();
		return grupos.stream().map(GrupoDto::new).toList();
	}
	public void insert(GrupoDto grupo) {
		Grupo grupoEntity = new Grupo(grupo);		
		grupoRepository.save(grupoEntity);
	}
	
	public GrupoDto update(GrupoDto grupo) {
		Grupo grupoEntity = new Grupo(grupo);		
		return new GrupoDto(grupoRepository.save(grupoEntity));
	}
	public void delete(Long id) {
		Grupo grupo = grupoRepository.findById(id).get();
		grupoRepository.delete(grupo);
	}
	public GrupoDto buscarPorId(Long id) {
		return new GrupoDto(grupoRepository.findById(id).get());
	}
}
