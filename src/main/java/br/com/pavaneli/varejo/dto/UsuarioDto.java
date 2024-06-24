package br.com.pavaneli.varejo.dto;

import org.springframework.beans.BeanUtils;

import br.com.pavaneli.varejo.entity.Usuario;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class UsuarioDto {
	private Long id;	
	private String nome;	
	private String login;	
	private String senha;
	private String email;
	private String status;
	
	public UsuarioDto(Usuario usuario) {
		BeanUtils.copyProperties(usuario, this);
	}

}
