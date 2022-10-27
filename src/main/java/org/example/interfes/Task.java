package org.example.interfes;

public interface Task {
    void  saveTask();
    void updateTask();
    void getAllTaskByLessoId(Lesson id);
    void deleteTaskById(Task id);
}
