package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() { // Handler Method after "/Contact"
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String receivedEmail, 
			@RequestParam("username") String receivedUserName, 
			@RequestParam("password") String receivedPassword, Model model)
	{
		System.out.println("Form Received !!");
		// System.out.println("User email id : " + request.getParameter("email"));
		System.out.println("User Email : "+ receivedEmail + " User Name : "+ receivedUserName + " User Password : "+ receivedPassword);
		
		model.addAttribute("name", receivedUserName) ;
		model.addAttribute("email", receivedEmail) ;
		model.addAttribute("password", receivedPassword) ;
		return "success";
	}

}
