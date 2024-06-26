package br.com.pavaneli.varejo.dto;

import org.springframework.beans.BeanUtils;

import br.com.pavaneli.varejo.entity.Cliente;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClienteDto {
	private Long id;	
	private String tipo;	
	private String nome;	
	private String fantasia;
	private String contato;	
	private String cpfcnpj;	
	private String rgie;		
	private String endereco;	
	private String cidade;	
	private String estado;	
	private String bairro;	
	private String cep;	
	private String telefone;	
	private String celular;	
	private String email;	
	private String status;
	
	
	public ClienteDto(Cliente cliente) {
		BeanUtils.copyProperties(cliente, this);
	}


}
