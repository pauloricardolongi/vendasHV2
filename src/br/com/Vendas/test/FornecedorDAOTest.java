package br.com.Vendas.test;

import java.util.List;


import org.junit.Ignore;
import org.junit.Test;
import br.com.Vendas.DAO.FornecedoresDAO;
import br.com.Vendas.domain.Fornecedor;

public class FornecedorDAOTest {

	@Test
	@Ignore
	public void salvar() {
		Fornecedor f1 = new Fornecedor();
		
		f1.setDescricao("Matriz");
		

		FornecedoresDAO dao = new FornecedoresDAO();
		dao.salvar(f1);
		

	}

	@Test
	@Ignore
	public void listar() {
		FornecedoresDAO dao = new FornecedoresDAO();
		List<Fornecedor> fornecedores = dao.listar();

		for (Fornecedor fornecedor : fornecedores) {
			System.out.println(fornecedor);
		}

	}

	@Test
    @Ignore
	public void buscarPorCodigo() {
		FornecedoresDAO dao = new FornecedoresDAO();

		Fornecedor f1 = dao.buscarPorCodigo(1L);
		Fornecedor f2 = dao.buscarPorCodigo(2L);
		Fornecedor f3 = dao.buscarPorCodigo(3L);
		Fornecedor f4 = dao.buscarPorCodigo(4L);
		Fornecedor f5 = dao.buscarPorCodigo(5L);

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);

	}
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
