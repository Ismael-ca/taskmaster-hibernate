package com.example.taskmaster;


import com.example.taskmaster.dao.TaskDAO;
import com.example.taskmaster.entity.Status;
import com.example.taskmaster.entity.Task;
import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        TaskDAO dao = new TaskDAO();

        // Crear una nueva tarea
        Task t1 = new Task("Actualizar CV", "Agregar proyecto Hibernate",
                Status.PENDING, LocalDate.now().plusDays(2));
        dao.create(t1);

        Task t2 = new Task("Preparar entrevista", "Estudiar preguntas frecuentes",
                Status.IN_PROGRESS, LocalDate.now().plusDays(5));
        dao.create(t2);

        // Mostrar todas las tareas
        List<Task> tasks = dao.findAll();
        System.out.println("📋 Lista de tareas:");
        tasks.forEach(System.out::println);

        // Buscar una tarea por ID
        Task buscada = dao.findById(1L);
        System.out.println("\n🔍 Tarea con ID 1: " + buscada);

        // Actualizar una tarea
        buscada.setStatus(Status.COMPLETED);
        dao.update(buscada);
        System.out.println("\n✅ Tarea actualizada: " + dao.findById(1L));

        // Borrar una tarea
        dao.delete(2L);
        System.out.println("\n🗑️ Lista tras borrar ID 2:");
        dao.findAll().forEach(System.out::println);
    }
}
