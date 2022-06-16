package br.com.Vendas.util;

import org.hibernate.SessionFactory;


import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static final SessionFactory sessionFactory =  buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Criar uma conex�o a partir do hibernate.cfg.xml
        	
        	Configuration configuracao = new Configuration();
        	configuracao.configure();
        	
        	ServiceRegistry servicoRegistro = new StandardServiceRegistryBuilder().
        			applySettings(configuracao.getProperties()).build();
        	
        	SessionFactory sessionFactory = configuracao.buildSessionFactory(servicoRegistro);
        	return sessionFactory;
        	


           // return new Configuration().configure().buildSessionFactory(
			//    new StandardServiceRegistryBuilder().build() );
        }
        catch (Throwable ex) {
            // Mensagem de erro ao conectar
            System.err.println("Erro na conex�o." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}