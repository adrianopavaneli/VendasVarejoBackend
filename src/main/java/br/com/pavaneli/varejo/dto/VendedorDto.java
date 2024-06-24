package br.com.pavaneli.varejo.dto;

import org.springframework.beans.BeanUtils;

import br.com.pavaneli.varejo.entity.Vendedor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class VendedorDto {
	private Long id;	
	private String nome;	
	private String cpf;
	private String rg;	
	private String endereco;	
	private String cidade;	
	private String estado;
	private String bairro;
	private String cep;
	private String celular;
	private String email;
	private String status;
	
	
	public VendedorDto(Vendedor vendedor) {
		BeanUtils.copyProperties(vendedor, this);
	}

}
