package br.com.pavaneli.varejo.dto;

import org.springframework.beans.BeanUtils;

import br.com.pavaneli.varejo.entity.Produto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProdutoDto {
	private Long id;	
	private String descricao;
	private String unid;
	private String marca;
	private String foto;
	private Integer grupo;
	private Double estoque;
	private Double estoque_min;
	private Double preco;
	private Double custo;
	private String status;
	
	public ProdutoDto(Produto produto) {
		BeanUtils.copyProperties(produto, this);
	}

	

}
