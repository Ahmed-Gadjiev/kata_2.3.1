package app.dao;

import app.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    EntityManager em;

    @Override
    public void add(User user) {
        em.persist(user);
    }

    @Override
    public User get(Long id) {
        if (id == null) {
            return null;
        }
        return em.find(User.class, id);
    }

    @Override
    public void update(Long id, User newUser) {
        User user = get(id);
        user.setName(newUser.getName());
        user.setEmail(newUser.getEmail());
        em.persist(user);
    }

    @Override
    public void delete(long id) {
        em.remove(get(id));
    }

    @Override
    public List<User> getAll() {
        return em.createQuery("SELECT u FROM User u", User.class).getResultList();
    }
}
