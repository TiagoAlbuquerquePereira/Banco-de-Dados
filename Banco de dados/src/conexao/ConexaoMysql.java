/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.io.File;

import org.apache.commons.collections4.MapUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author lck.admin
 */
public class ConexaoMysql {

	private static final SessionFactory sessionFactory;
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<>();

	static {
		try {
			File f = new File("/config/hibernate.cfg.xml");
			Configuration config = new AnnotationConfiguration().configure(f);

			sessionFactory = config.buildSessionFactory();

		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
			// Logger.getLogger(ConexaoHibernate.class.getName()).log(Level.SEVERE, null,
			// e);
		}
	}
	// retorna uma sessao de comunicacao com o BD

	public static Session getInstance() {
		// Session session = (Session) threadLocal.get();
		Session session = sessionFactory.openSession();
		threadLocal.set(session);
		return session;
	}
}