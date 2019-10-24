package model.dao;

import model.Skill;
import org.hibernate.SessionFactory;

import java.util.List;

public class SkillDao extends BaseDao {

    public SkillDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public Skill get(Long id) {
        return super.produceInTransaction(session -> session.get(Skill.class, id));
    }

    public void save(Skill skill) {
        super.executeInTransaction(session -> session.save(skill));
    }

    public void update(Skill skill) {
        super.executeInTransaction(session -> session.update(skill));
    }

    public void delete(Skill skill) {
        super.executeInTransaction(session -> session.delete(skill));
    }

    public Boolean isSkillNameAvailable(String name) {
        return super.produceInTransaction(
                session -> session.createQuery("SELECT count(k) FROM Skill k WHERE k.name = :name", Long.class)
                        .setParameter("name", name)
                        .getSingleResult() <= 0
        );
    }

    public List<Skill> getAll() {
        return super.produceInTransaction(
                session -> session.createQuery("SELECT k FROM Skill k", Skill.class)
                        .getResultList());
    }

    public List<Skill> getAllByName(String name) {
        return super.produceInTransaction(
                session -> session.createQuery("SELECT k FROM Skill k WHERE k.name = :name", Skill.class)
                        .setParameter("name", name)
                        .getResultList());
    }

}
