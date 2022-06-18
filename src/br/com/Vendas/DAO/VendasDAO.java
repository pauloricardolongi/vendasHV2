package br.com.Vendas.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import br.com.Vendas.domain.Venda;
import br.com.Vendas.util.HibernateUtil;

public class VendasDAO {

	public void salvar(Venda venda) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transacao = null;// inicia a transação como nulo
		try{
			transacao = sessao.beginTransaction(); //abrindo a transação
			
			sessao.save(venda);
			transacao.commit(); //confirmando a transação
			
		}catch(RuntimeException ex){
			if(transacao != null){
				transacao.rollback(); //desfazer a transação 
				
			}
			
		}
			
			finally{
				sessao.close();
			}
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Venda> listar(){
Session sessao = HibernateUtil.getSessionFactory().openSession();
		
		List<Venda> venda = null;
		try{
			
			Query consulta = sessao.getNamedQuery("Venda.listar");
			venda = consulta.list();
			
			
		}catch(RuntimeException ex){
			throw ex;
				
			
		}
			
			finally{
				sessao.close();
			}
		return venda;
	}
	
	public Venda buscarPorCodigo(Long codigo){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
				
				Venda venda = null;
				try{
					
					Query consulta = sessao.getNamedQuery("Venda.buscarPorCodigo");
					consulta.setLong("codigo",codigo);
					venda = (Venda) consulta.uniqueResult();
					
					
				}catch(RuntimeException ex){
					throw ex;
						
					
				}
					
					finally{
						sessao.close();
					}
				return venda;
			}
	
	public void excluir(Venda venda) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transacao = null;// inicia a transação como nulo
		try{
			transacao = sessao.beginTransaction(); //abrindo a transação
			
			sessao.delete(venda);
			transacao.commit(); //confirmando a transação
			
		}catch(RuntimeException ex){
			if(transacao != null){
				transacao.rollback(); //desfazer a transação 
				
			}
			
		}
			
			finally{
				sessao.close();
			}
		
	}
	
	public void editar(Venda venda) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transacao = null;// inicia a transação como nulo
		try{
			transacao = sessao.beginTransaction(); //abrindo a transação
			
			
			sessao.update(venda);
			transacao.commit(); //confirmando a transação
			
		}catch(RuntimeException ex){
			if(transacao != null){
				transacao.rollback(); //desfazer a transação 
				
			}
			
		}
			
			finally{
				sessao.close();
			}
		
	}
	
	
}
