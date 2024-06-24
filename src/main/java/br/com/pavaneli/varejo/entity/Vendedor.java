package br.com.pavaneli.varejo.entity;

import org.springframework.beans.BeanUtils;

import br.com.pavaneli.varejo.dto.VendedorDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Vendedor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cpf;
	@Column(nullable = false)
	private String rg;	
	private String endereco;
	@Column(nullable = false)
	private String cidade;
	@Column(nullable = false)
	private String estado;
	private String bairro;
	private String cep;
	private String celular;
	private String email;
	
	public Vendedor(VendedorDto vendedor) {
		BeanUtils.copyProperties(vendedor, this);
	}
	

}
