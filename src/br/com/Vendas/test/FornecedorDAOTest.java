package br.com.Vendas.test;

import org.junit.Ignore;
import org.junit.Test;
import br.com.Vendas.DAO.FornecedoresDAO;
import br.com.Vendas.domain.Fornecedor;

public class FornecedorDAOTest {

	@Test
	
	public void salvar() {
		Fornecedor f1 = new Fornecedor();
		Fornecedor f2 = new Fornecedor();
		f1.setDescricao("Super Util");
		f2.setDescricao("Total");

		FornecedoresDAO dao = new FornecedoresDAO();
		dao.salvar(f1);
		dao.salvar(f2);

	}

//	@Test
//	@Ignore
//	public void listar() {
//		FornecedoresDAO dao = new FornecedoresDAO();
//		List<Fornecedor> fornecedores = dao.listar();
//
//		for (Fornecedor fornecedor : fornecedores) {
//			System.out.println(fornecedor);
//		}
//
//	}
//
//	@Test
//	@Ignore
//	public void buscarPorCodigo() {
//		FornecedoresDAO dao = new FornecedoresDAO();
//
//		Fornecedor f1 = dao.buscarPorCodigo(2L);
//		Fornecedor f2 = dao.buscarPorCodigo(10L);
//
//		System.out.println(f1);
//		System.out.println(f2);
//
//	}
//
//	@Test
//	@Ignore
//	public void excluir() {
//		FornecedoresDAO dao = new FornecedoresDAO();
//
//		Fornecedor fornecedor = dao.buscarPorCodigo(10L);
//
//		dao.excluir(fornecedor);
//
//	}
//
//	@Test
//	@Ignore
//	public void editar() {
//
//		FornecedoresDAO dao = new FornecedoresDAO();
//
//		Fornecedor fornecedor = dao.buscarPorCodigo(9L);
//		Fornecedor fornecedo = dao.buscarPorCodigo(11L);
//
//		fornecedor.setDescricao("Por Menos");
//		fornecedo.setDescricao("Zanon");
//		dao.editar(fornecedor);
//		dao.editar(fornecedo);
//
//	}
}
