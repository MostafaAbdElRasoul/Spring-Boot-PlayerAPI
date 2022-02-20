package com.spring.player.dao;

import com.spring.player.model.Player;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PlayerDaoImpl implements PlayerDAO{

    private EntityManager entityManager;

    @Autowired
    public PlayerDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Player getPlayer(int id) {
        Session session = entityManager.unwrap(Session.class);
        Player player = session.get(Player.class, id);
        return player;
    }

    @Override
    public List<Player> getPlayers() {
        Session session = entityManager.unwrap(Session.class);
        Query<Player> query = session.createQuery("from Player", Player.class);
        return query.getResultList();
    }

    @Override
    public int removePlayer(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("delete from Player where id =?1");
        query.setInteger(1, id);
        return query.executeUpdate();
    }

    @Override
    public void addPlayer(Player player) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(player);
    }
}
