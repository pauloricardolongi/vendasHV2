package br.com.Vendas.test;

import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import br.com.Vendas.DAO.FuncionariosDAO;
import br.com.Vendas.domain.Funcionario;
public class FuncionarioDAOTest {
	

	@Test
	@Ignore
	public void salvar() {
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Fabricio dos Santos");
		f1.setCpf("888222333-55");
		f1.setSenha("223115768");
		f1.setFuncao("balconista");

		FuncionariosDAO dao = new FuncionariosDAO();
		dao.salvar(f1);
		

	}

	@Test
	@Ignore
	public void listar() {
		FuncionariosDAO dao = new FuncionariosDAO();
		List<Funcionario> lista = dao.listar();

		for (Funcionario funcionario : lista) {
			System.out.println(funcionario);
		}

	}

	@Test
	@Ignore
	public void buscarPorCodigo() {
		FuncionariosDAO dao = new FuncionariosDAO();

		Funcionario f1 = dao.buscarPorCodigo(2L);
		Funcionario f2 = dao.buscarPorCodigo(1L);

		System.out.println(f1);
		System.out.println(f2);

	}

	@Test
	@Ignore
	public void excluir() {
		FuncionariosDAO dao = new FuncionariosDAO();

		Funcionario funcionario = dao.buscarPorCodigo(2L);
		
		dao.excluir(funcionario);

	}

	@Test
	@Ignore
	public void editar() {

		FuncionariosDAO dao = new FuncionariosDAO();

		Funcionario funcionario = dao.buscarPorCodigo(3L);

		funcionario.setNome("Jaco da Silva");
		funcionario.setSenha("1111111111");
		funcionario.setCpf("2222222222222");
		
		funcionario.setFuncao("administrativo");
		
		dao.editar(funcionario);

	}

}
