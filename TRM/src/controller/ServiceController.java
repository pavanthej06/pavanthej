package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import SecurityLayer.Security;

@Controller
public class ServiceController {
	
	@RequestMapping(value = "/")
	public String Welcome()
	{
		return "login";
	}
	
		@RequestMapping(value="loginForm")	
		public String Login()
		{
			return "dashboard";
		}
		
		/*public String loginService(HttpServletRequest request,Model model)
		{
			System.out.println("---------ok");
			
			String username  = request.getParameter("username");
			String userpassword = request.getParameter("userpassword");
			
			System.out.println(username+" "+userpassword);
			
			boolean result = new Security().isUserValid(username, userpassword);
			
			if(result)
			{
				List<AtosEmpData> allrequest = new Security().getAllTrainingRequest();
				model.addAttribute("all",allrequest);
				
				return "dashboard";
			}
			else
			{
				model.addAttribute("errmsg", "Wrong user id or password.");
				return "login";
			}	
		}*/
		
}
