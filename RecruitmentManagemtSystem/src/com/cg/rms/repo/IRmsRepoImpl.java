package com.cg.rms.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.rms.bean.CandidatePersonal;


@Repository
public class IRmsRepoImpl implements IRmsRepo {
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public CandidatePersonal addCandidate(CandidatePersonal cpersonal) {
		
		manager.persist(cpersonal);
		manager.flush();
		return cpersonal;
	
	}

}
