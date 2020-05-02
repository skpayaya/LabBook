package com.cg.iter.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.iter.entity.Trainee;



@Repository
public class TraineeDaoImpl implements TraineeDao {
	
	@PersistenceContext 
     EntityManager entityManager;

	
	public void insertTrainee1(Trainee trainee) {
		
		entityManager.persist(trainee);
		
	  }
	public Trainee getTrainee(int traineeId)
	     {
	    	 Trainee trainee = entityManager.find(Trainee.class, traineeId);
	    	 return trainee;
	     }
	
	 public void deleteTrainee(int traineeId)
     {
    	 Trainee trainee = entityManager.find(Trainee.class,traineeId);
    	 entityManager.remove(trainee);
     }
	  public List<Trainee> getTrainees()
	     {
	    	 TypedQuery<Trainee> tqry = entityManager.createQuery("from Trainee",Trainee.class);
	    	 return tqry.getResultList();
	     }
	
	  public void updateTrainee(Trainee trainee)
	     {
	    	 entityManager.merge(trainee);
	     }



}
