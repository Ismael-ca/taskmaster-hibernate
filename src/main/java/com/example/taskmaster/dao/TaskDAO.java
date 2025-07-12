package com.example.taskmaster.dao;

import com.example.taskmaster.entity.Task;
import com.example.taskmaster.util.JPAUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class TaskDAO {
    private EntityManager em = JPAUtil.getEntityManager();

    public void create(Task task) {
        em.getTransaction().begin();
        em.persist(task);
        em.getTransaction().commit();
    }

    public List<Task> findAll() {
        return em.createQuery("FROM Task", Task.class).getResultList();
    }

    public Task findById(Long id) {
        return em.find(Task.class, id);
    }

    public void update(Task task) {
        em.getTransaction().begin();
        em.merge(task);
        em.getTransaction().commit();
    }

    public void delete(Long id) {
        em.getTransaction().begin();
        Task task = em.find(Task.class, id);
        if (task != null) {
            em.remove(task);
        }
        em.getTransaction().commit();
    }
}
