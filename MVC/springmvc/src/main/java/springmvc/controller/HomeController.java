package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("HOME FIRED !! ");
		model.addAttribute("name", "Pratyush Vatsal") ;
		model.addAttribute("id", 1962374) ;
		return "index" ;
	}
	
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("WE ARE INSIDE HELP CONTROLLER !!");
		ModelAndView modelandview = new ModelAndView() ;
		List<String> friends = new ArrayList<String>() ;
		
		friends.add("Pratyush") ;
		friends.add("Neeraj") ;
		friends.add("Vatsal") ;
		
		modelandview.addObject("friends", friends) ;
		
		modelandview.addObject("name", "Pratyush") ;
		modelandview.addObject("rollnumber", 1) ;
		//Setting view Name
		modelandview.setViewName("help");
	
		return modelandview ;
	}
	
}
