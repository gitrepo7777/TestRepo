package com.vani;

import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-jpa.xml"); // or 'beans-hibernate.xml' 

        CourseDao courseDao = (CourseDao) context.getBean("courseDao");

        /*Course course = new Course();
        course.setTitle("Core Spring 7");
        course.setBeginDate(new GregorianCalendar(2007, 8, 1).getTime());
        course.setEndDate(new GregorianCalendar(2007, 9, 1).getTime());
        course.setFee(1000);
        courseDao.store(course);*/

        List<Course> courses = courseDao.findAll();
        for(Course c: courses)
        {
        	System.out.println("course name = " + c.getTitle());
        }
        Long courseId = courses.get(3).getId();

        Course course = courseDao.findById(courseId);
        System.out.println("Course Title: " + course.getTitle());
        System.out.println("Begin Date: " + course.getBeginDate());
        System.out.println("End Date: " + course.getEndDate());
        System.out.println("Fee: " + course.getFee());

        courseDao.delete(courseId);
    }
}
