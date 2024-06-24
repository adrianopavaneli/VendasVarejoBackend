package br.com.pavaneli.varejo.dto;

import org.springframework.beans.BeanUtils;

import br.com.pavaneli.varejo.entity.Grupo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class GrupoDto {
	private Long id;	
	private String nome;		
	
	public GrupoDto(Grupo grupo) {
		BeanUtils.copyProperties(grupo, this);
	}

}
