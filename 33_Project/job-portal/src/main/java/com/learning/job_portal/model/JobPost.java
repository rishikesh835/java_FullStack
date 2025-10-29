package com.learning.job_portal.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Getter
@Data
@Component
public class JobPost {

    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

    public JobPost() {
    }

    public JobPost(int postId, String postProfile,String postDesc,int reqExperience , List<String> postTechStack) {
        this.postDesc = postDesc;
        this.postId = postId;
        this.postProfile = postProfile;
        this.postTechStack = postTechStack;
        this.reqExperience = reqExperience;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    public void setPostTechStack(List<String> postTechStack) {
        this.postTechStack = postTechStack;
    }

    public void setReqExperience(int reqExperience) {
        this.reqExperience = reqExperience;
    }
}
