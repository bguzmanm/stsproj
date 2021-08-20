package cl.awakelab.stsproj.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.stsproj.model.Estudiante;
import cl.awakelab.stsproj.model.DAO.EstudianteDAOImpl;

@Controller
public class EstudianteController {

	
	@RequestMapping(value = "/estudiante/listar", method=RequestMethod.GET)
	public String listar(Model model) {
		
		EstudianteDAOImpl eDAO = new EstudianteDAOImpl();
		
		List<Estudiante> lista = eDAO.readAll();
		
		model.addAttribute("lista", lista);
		
		return "listar";
		
	}
	
	@RequestMapping(value="/estudiante/ver/{rut}", method=RequestMethod.GET)
	public String ver(Model model, @PathVariable("rut") String rut) {
		
		EstudianteDAOImpl eDAO = new EstudianteDAOImpl();
		Estudiante e = eDAO.readOne(rut);
		
		model.addAttribute("e", e);
		
		return "ver";
	}
	
	
	@RequestMapping(value="/estudiante/crear", method=RequestMethod.GET)
	public String crearVer(Model model) {
		
		EstudianteDAOImpl eDAO = new EstudianteDAOImpl();
		Estudiante e = eDAO.readOne("4-4");
		
		model.addAttribute("e", e);
		
		return "crear";
	}
	
	@RequestMapping(value="/estudiante/crear", method=RequestMethod.POST)
	public String crearGuardar(Model model) {
		
		System.out.println("Entre a crear ... ");
		
		return "redirect:/estudiante/listar";
		
	}
	
	
}
