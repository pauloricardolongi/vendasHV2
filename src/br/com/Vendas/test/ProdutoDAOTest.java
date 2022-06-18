package br.com.Vendas.test;

import java.math.BigDecimal;



import java.util.List;


import org.junit.Ignore;
import org.junit.Test;

import br.com.Vendas.DAO.FornecedoresDAO;

import br.com.Vendas.DAO.ProdutosDAO;
import br.com.Vendas.domain.Fornecedor;

import br.com.Vendas.domain.Produto;


public class ProdutoDAOTest {

	@Test
	@Ignore
	public void salvar() {
		
		FornecedoresDAO dao = new FornecedoresDAO();
		Fornecedor fornecedor = dao.buscarPorCodigo(7L);
		Produto p1 = new Produto();
		
		p1.setDescricao("Maça");
		p1.setPreco(new BigDecimal(8.99D));
		p1.setQuantidade(40);
		p1.setFornecedor(fornecedor);
		

		ProdutosDAO produtosdao = new ProdutosDAO();
		produtosdao.salvar(p1);
		

	}
	@Test
	@Ignore
	public void listar(){
	ProdutosDAO dao = new ProdutosDAO();
	List<Produto> lista = dao.listar();

	for (Produto produto : lista) {
		System.out.println(produto);
	}
}
	@Test
	@Ignore
	public void buscarPorCodigo() {
		ProdutosDAO dao = new ProdutosDAO();

		Produto p1 = dao.buscarPorCodigo(3L);
		

		System.out.println(p1);
		

	}

	@Test
	@Ignore
	public void excluir() {
		ProdutosDAO dao = new ProdutosDAO();

		Produto produto = dao.buscarPorCodigo(3L);
		
		dao.excluir(produto);

	}
	
	@Test
	@Ignore
	public void editar() {

		FornecedoresDAO fdao = new FornecedoresDAO();
		Fornecedor fornecedor = fdao.buscarPorCodigo(1L);
		
		ProdutosDAO produtodao = new ProdutosDAO();
		
		Produto produto = produtodao.buscarPorCodigo(2L);

		produto.setDescricao("farinha");
		produto.setPreco(new BigDecimal(19.99));
		produto.setQuantidade(5);
		produto.setFornecedor(fornecedor);
		
		
		
		produtodao.editar(produto);

	}
		
}
