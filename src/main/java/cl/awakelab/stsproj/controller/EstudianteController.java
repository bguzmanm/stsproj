package cl.awakelab.stsproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EstudianteController {

	
	@RequestMapping(value = "/estudiante/listar", method=RequestMethod.GET)
	public String listar(Model model) {
		return "listar";
		
	}
	
	@RequestMapping(value="/estudiante/crear", method=RequestMethod.GET)
	public String crear() {
		return "crear";
	}
	
}
