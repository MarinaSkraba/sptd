package br.edu.ifpr.irati.dao;
import br.edu.ifpr.irati.util.HibernateUtil;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


public class GenericDAO<T> implements Dao<T> {

    private final Class classePersistente;

    public GenericDAO(Class classePersistente) {
        this.classePersistente = classePersistente;
    }

    @Override
    public T buscarPorId(Serializable id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        T t = (T) session.load(classePersistente, id);
        session.clear();
        session.close();
        return t;
    }
      @Override
    public void salvar(T t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.save(t);

        session.getTransaction().commit();
        session.clear();
        session.close();
    }

    @Override
    public void alterar(T t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.update(t);

        session.getTransaction().commit();
        session.clear();
        session.close();
    }

    @Override
    public void excluir(T t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.delete(t);

        session.getTransaction().commit();
        session.clear();
        session.close();
    }
    
    @Override
    public List<T> buscarTodos(Class<T> clazz) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from "+clazz.getCanonicalName();
        Query query = session.createQuery(hql);
        List results = query.list();
        session.clear();
        session.close();
        return results;
    }

    @Override
    public T verificarUsuario(String user, String senha) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        T t = (T) session.load(user, senha);
        session.clear();
        session.close();
        return t;
    }

            
}
