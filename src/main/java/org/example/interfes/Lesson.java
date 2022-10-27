package org.example.interfes;

public interface Lesson {
    void saveLesson();
    void updateLesson();
    void getLessonById();
    void getLessonsByCourseId(Lesson id);
}
