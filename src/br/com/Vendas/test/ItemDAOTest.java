package br.com.Vendas.test;
import java.math.BigDecimal;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import br.com.Vendas.DAO.ItemDAO;
import br.com.Vendas.DAO.ProdutosDAO;
import br.com.Vendas.DAO.VendasDAO;

import br.com.Vendas.domain.Item;
import br.com.Vendas.domain.Produto;
import br.com.Vendas.domain.Venda;

public class ItemDAOTest {

	@Test
	@Ignore
	
	public void salvar() {

		ProdutosDAO pdao = new ProdutosDAO();
		Produto produto = pdao.buscarPorCodigo(1L);
		
		VendasDAO vdao = new VendasDAO();
		Venda venda = vdao.buscarPorCodigo(2L);	
				
		Item i1 = new Item();
		
		i1.setQuantidade(3);
		i1.setValor_parcial(new BigDecimal(120.00D));
		i1.setProduto(produto);
		i1.setVenda(venda);	

		ItemDAO itensdao = new ItemDAO();
		itensdao.salvar(i1);

	}

	@Test
	@Ignore
	
	public void listar() {
		ItemDAO dao = new ItemDAO();
		List<Item> lista = dao.listar();

		for (Item item : lista) {
			System.out.println(item);
		}
	}

	@Test
	@Ignore
	
	public void buscarPorCodigo() {
		ItemDAO dao = new ItemDAO();

		Item i1 = dao.buscarPorCodigo(1L);

		System.out.println(i1);

	}

	@Test
	@Ignore
	
	public void excluir() {
		ItemDAO dao = new ItemDAO();

		Item item = dao.buscarPorCodigo(2L);

		dao.excluir(item);

	}

	@Test
    
	public void editar() {

		VendasDAO vdao = new VendasDAO();
		Venda venda = vdao.buscarPorCodigo(2L);

		ProdutosDAO pdao = new ProdutosDAO();
		Produto produto  = pdao.buscarPorCodigo(4L);
		
		ItemDAO dao = new ItemDAO();
		Item i1 = dao.buscarPorCodigo(3L);
		
		i1.setQuantidade(10);
		i1.setValor_parcial(new BigDecimal(180.20));
		i1.setVenda(venda);
		i1.setProduto(produto);
		

		dao.editar(i1);

	}

}
