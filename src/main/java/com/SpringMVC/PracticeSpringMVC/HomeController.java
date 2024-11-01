package com.SpringMVC.PracticeSpringMVC;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
   @RequestMapping("/")
    public String home(){
        System.out.println("home method is called");
        return "index";
    }

//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session){
//       int num1 = Integer.parseInt(req.getParameter("num1"));
//       int num2 = Integer.parseInt(req.getParameter("num2"));
//       int result = num1+num2;
//       session.setAttribute("result",result);
//        System.out.println(num1+num2);
//       return "result.jsp";
//    }

//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int num, int num2, HttpSession session){
//        int result = num+num2;
//        session.setAttribute("result",result);
//        System.out.println(num+num2);
//        return "result.jsp";
//    }

//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, Model model){
//        int result = num1+num2;
//        model.addAttribute("result",result);
//        System.out.println(num1+num2);
//        return "result";
//    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, ModelAndView mv){
        int result = num1+num2;
        mv.addObject("result",result);
        mv.setViewName("result");
        System.out.println(num1+num2);
        return mv;
    }

//@RequestMapping("/addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid,@RequestParam("aname")String aname, ModelAndView mv){
//       Alien alien = new Alien();
//       alien.setAid(aid);
//       alien.setAname(aname);
//
//       mv.addObject("alien",alien  );
//       mv.setViewName("result");
//       return mv;
//    }
//

//    @RequestMapping("/addAlien")
//    public String addAlien(Alien alien){
//       return "result";
//    }

    @RequestMapping("/addAlien")
    public String addAlien(@ModelAttribute("alienDetails") Alien alien){
        return "result";
    }
    @ModelAttribute("course")
    public String courseName(){
       return "JAVA";
    }
}
