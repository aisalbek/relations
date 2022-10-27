package org.example.interfes;

public interface Instructor {
    void saveInstructor();
    void getInstructorsByCourseId(Instructor id);
    void getInstructorById(Instructor id);
    void updateInstructor();
    void deleteInstructorById(Instructor id);
    void assignInstructorToCourse();
}
