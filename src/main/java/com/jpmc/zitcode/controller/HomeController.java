package com.jpmc.zitcode.controller;

import com.jpmc.zitcode.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/demo", method = RequestMethod.GET)
public class HomeController {

    @Autowired
    private EmployeeRepository employeeRepository;

/*
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String method1(@RequestParam(value = "name") String name) {
        System.out.println("call me()");
        return "Hello ..." + name + "..Iam here";

    }
   /*
    @RequestMapping("/")
    public String index(){
   return"index";
}
@RequestMapping(value="/save" ,method=RequestMethod.POST)
    public ModelAndView save(@ModelAttribute User user){
        ModelAndView modelandview=new ModelAndView();
        modelandview.setViewName("user-data");
         modelandview.addObject("user", user);
    return modelandview;
}

}
*/
}