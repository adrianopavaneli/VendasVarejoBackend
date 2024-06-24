package br.com.pavaneli.varejo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pavaneli.varejo.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
