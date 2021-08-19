package cl.awakelab.stsproj.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.stsproj.model.Estudiante;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		
		Estudiante e = new Estudiante("1-1", "Brian", "Guzmán");
		
		model.addAttribute("serverTime", " una cuarto para el piñen" );
		model.addAttribute("e", e);
		
		return "home";
	}
	
}
