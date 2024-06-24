package br.com.pavaneli.varejo.entity;

import org.springframework.beans.BeanUtils;

import br.com.pavaneli.varejo.dto.ProdutoDto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String descricao;
	@Column(nullable = false)
	private String unid;
	@Column(nullable = false)
	private String marca;
	private String foto;
	@Column(nullable = false)
	
	private Double estoque;
	@Column(nullable = false)
	private Double estoque_min;
	@Column(nullable = false)
	private Double preco;
	@Column(nullable = false)
	private Double custo;
	@Column(nullable = false)
	private String status;
	@OneToOne(cascade = CascadeType.ALL)
	private Grupo grupo;
	
	public Produto(ProdutoDto produto) {
		BeanUtils.copyProperties(produto, this);
	}
	
	

}
