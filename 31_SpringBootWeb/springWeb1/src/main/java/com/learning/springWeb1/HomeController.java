package com.learning.springWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }
    @RequestMapping("/")
    public String home(){
        System.out.println("Home Page");
        return "index";
    }

    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
    public String add(@RequestParam("num1") int num, int num2, HttpSession session){ //annotation is need when we want a different name for parameters
        int result = num + num2;

        session.setAttribute("result",result);
        return "result";
    }
    @RequestMapping("add2")
    public String add2(@RequestParam("num1") int num, int num2, Model model){ //annotation is need when we want a different name for parameters
        int result = num + num2;
//        System.out.println(result);
        model.addAttribute("result",result);
        return "result";
    }

    @RequestMapping("add3")
    public ModelAndView add3(@RequestParam("num1") int num1, @RequestParam("num2") int
            num2, ModelAndView mv) {
        int result = num1 + num2;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }


    @RequestMapping("addAlien")
    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname")
    String aname, ModelAndView mv) {
        Alien alien = new Alien();
        alien.setAid(aid);
        alien.setAname(aname);
        System.out.println(alien);
        mv.addObject("alien", alien);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("addAlien2")
    public String addAlien2(@ModelAttribute Alien alien) {
//        System.out.println(alien);
        return "result";
    }
}
