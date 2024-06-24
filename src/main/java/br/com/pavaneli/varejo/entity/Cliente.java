package br.com.pavaneli.varejo.entity;

import org.springframework.beans.BeanUtils;

import br.com.pavaneli.varejo.dto.ClienteDto;
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
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String tipo;	
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String fantasia;
	private String contato;
	@Column(nullable = false)
	private String cpfcnpj;
	@Column(nullable = false)
	private String rgie;	
	@Column(nullable = false)
	private String endereco;
	@Column(nullable = false)
	private String cidade;
	@Column(nullable = false)
	private String estado;
	@Column(nullable = false)
	private String bairro;
	@Column(nullable = false)
	private String cep;
	@Column(nullable = false)
	private String telefone;
	@Column(nullable = false)
	private String celular;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String status;
	
	public Cliente(ClienteDto cliente) {
		BeanUtils.copyProperties(cliente, this);
	}
	

}
