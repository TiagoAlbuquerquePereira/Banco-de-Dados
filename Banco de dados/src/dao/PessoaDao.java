package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import conexao.ConexaoMysql;
import objetos.Pessoa;

public class PessoaDao {

	public static boolean salvar(Pessoa P) {

		Session session = ConexaoMysql.getInstance();
		Transaction tx = null;

		try {

			tx = session.beginTransaction();
			session.save(P);
			tx.commit();
			return true;

		} catch (Exception e) {

			tx.rollback();
			e.printStackTrace();

		}
		return false;
	};

	public static ArrayList<Pessoa> buscarTodos() {

		Session session = ConexaoMysql.getInstance();
		Transaction tx = null;

		try {

			Query q;
			tx = session.beginTransaction();
			q = session.createQuery("from Pessoa ");
			return (ArrayList<Pessoa>) q.list();

		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Pessoa>();
		}

	}

}
