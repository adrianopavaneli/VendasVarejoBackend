package br.com.pavaneli.varejo.dto;

import org.springframework.beans.BeanUtils;

import br.com.pavaneli.varejo.entity.Fornecedor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class FornecedorDto {
	private Long id;		
	private String nome;	
	private String fantasia;
	private String contato;	
	private String cnpj;	
	private String ie;		
	private String endereco;	
	private String cidade;	
	private String estado;	
	private String bairro;	
	private String cep;	
	private String telefone;	
	private String celular;	
	private String email;
	
	
	public FornecedorDto(Fornecedor fornecedor) {
		BeanUtils.copyProperties(fornecedor, this);
	}


}
