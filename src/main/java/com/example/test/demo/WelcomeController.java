package com.example.test.demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    @ResponseBody
    public String Welcome(){
        return "Welcome to First Controller";

    }

//    @RequestMapping("/home")
//    public String Home(HttpServletRequest request, HttpServletResponse response)
//    {
////        response.setStatus(201); // to set the status of page
//        String names = request.getParameter("name");
//        System.out.println(names);
//        //one way to set the value and pass along in jsp pages (Front-end)
////        request.setAttribute("name",name);
//        HttpSession session = request.getSession();
//        session.setAttribute("name",names);
//        return "home";
//    }

    //This is just to show different between path(suffix0 in app.properties file
    @RequestMapping("/homes")
    public String Homes()
    {
        return "homes";
    }

//    @RequestMapping("home")
//    public ModelAndView home(@RequestParam("name") String myName, @RequestParam("name1") String myName1)
//    {
//        System.out.println(myName);
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("name",myName);
////        mv.addObject("name1",myName1);
//        mv.setViewName("home");
//        return mv;
//    }

    @RequestMapping("home")
      public ModelAndView home(Alien alien)
      {
          ModelAndView mv = new ModelAndView();
          mv.addObject("obj",alien);
          mv.setViewName("home");
          return mv;
      }
}
