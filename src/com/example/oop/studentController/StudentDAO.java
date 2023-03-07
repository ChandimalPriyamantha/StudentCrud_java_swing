/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.oop.studentController;

import com.examole.oop.model.Student;
import java.util.List;

/**
 *
 * @author Vivobook
 */
public interface StudentDAO {
    
    public void save(Student students);
    public void update(Student students);
    public void delete(Student students);
    public Student get(int id);
    public List<Student> list();
    
}
