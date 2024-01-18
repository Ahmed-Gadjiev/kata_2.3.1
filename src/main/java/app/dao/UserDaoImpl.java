package app.dao;

import app.model.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao {
//    @PersistenceContext
//    EntityManager em;

    private final SessionFactory em;

    public UserDaoImpl(SessionFactory sessionFactory) {
        this.em = sessionFactory;
    }

    @Override
    public void add(User user) {
//        em.persist(user);
    }

    @Override
    public User getById(long id) {
//        return em.find(User.class, id);
        return new User();
    }

    @Override
    public void update(Long id, User newUser) {
//        User user = getById(id);
//        user.setName(newUser.getName());
//        user.setEmail(newUser.getEmail());
//        em.persist(user);
    }

    @Override
    public void delete(long id) {
//        em.remove(getById(id));
    }

    @Override
    public List<User> listUsers() {
//        return em.createQuery("SELECT * FROM users", User.class).getResultList();
        return new ArrayList<>();
    }
}
