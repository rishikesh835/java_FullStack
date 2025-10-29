package com.learning.job_portal.service;

import com.learning.job_portal.model.JobPost;
import com.learning.job_portal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class jobService {
    @Autowired
    public JobRepo repo;
    public void addJob( JobPost jobPost) {
        System.out.println("herein Service");
        repo.addJobPost(jobPost);
    }
    List<JobPost> getAllJobs(){
        return repo.returnAllJobPosts();
    }

    public List<JobPost> returnAllJobPosts() {
        return repo.returnAllJobPosts();


    }

}
