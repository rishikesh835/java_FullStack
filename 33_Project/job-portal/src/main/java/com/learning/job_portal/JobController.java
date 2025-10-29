package com.learning.job_portal;


import com.learning.job_portal.model.JobPost;
import com.learning.job_portal.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    public jobService service;

    @GetMapping({"/","/home"})
    public String home(){
        return "home";
    }

//    @GetMapping("/addjob")
//    public String addJob(){
//        return "addjob";
//    }



    @GetMapping("/addjob")
    public String showAddJobForm(Model model) {
        model.addAttribute("jobPost", new JobPost());
        return "addjob"; // JSP form page
    }

    @PostMapping("/handleForm")
    public String handleAddJobForm(JobPost jobPost, Model model) {
        model.addAttribute("jobPost", jobPost);
        service.addJob(jobPost);
        //System.out.println(jobPost);
        return "success";

    }
    @GetMapping("/viewalljobs")
    public String viewJobs(Model model) {

        List<JobPost> jobPosts = service.returnAllJobPosts();
        model.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }
}
