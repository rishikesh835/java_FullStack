package com.learning.springRest.repo;


import com.learning.springRest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    //List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);


}
