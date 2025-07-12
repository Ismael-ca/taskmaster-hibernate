package com.example.taskmaster.entity;

import jakarta.persistence.*;


@Entity
@Table(name="comments")
public class Comment {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    private String message;

    @ManyToOne
    @JoinColumn(name="task_id")
    private Task task;

    public Comment(){

    }

    public Comment(String message, Task task) {
        this.message = message;
        this.task = task;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", task=" + task +
                '}';
    }
}
