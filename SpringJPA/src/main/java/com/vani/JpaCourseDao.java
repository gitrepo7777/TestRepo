package com.vani;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("courseDao")
public class JpaCourseDao implements CourseDao {
	
	@PersistenceUnit(name="course")
	private EntityManagerFactory entityManagerFactory;
	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void store(Course course) {
		entityManager.merge(course);
	}

	@Transactional
	public void delete(Long courseId) {
		Course course = entityManager.find(Course.class, courseId);
		entityManager.remove(course);
	}

	@Transactional(readOnly = true)
	public Course findById(Long courseId) {
		return entityManager.find(Course.class, courseId);
	}

	@Transactional(readOnly = true)
	public List<Course> findAll() {
		Query query = (Query) entityManager.createQuery("select c from Course c");

		return query.getResultList();
	}
}
