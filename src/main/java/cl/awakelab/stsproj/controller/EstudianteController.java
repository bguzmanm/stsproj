package cl.awakelab.stsproj.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import cl.awakelab.stsproj.model.Estudiante;
import cl.awakelab.stsproj.model.DAO.EstudianteDAOImpl;

@Controller
@RequestMapping(value = "/estudiante")
public class EstudianteController {
	
	@Autowired
	private EstudianteDAOImpl eDAO;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public ModelAndView listar() {

		//EstudianteDAOImpl eDAO = new EstudianteDAOImpl();

		List<Estudiante> estudiantes = eDAO.readAll();
		
		ModelAndView mv = new ModelAndView("listar");
		
		
		mv.addObject("estudiantes", estudiantes);

		return mv;
		
	}

	@RequestMapping(value = "/editar/{id}", method = RequestMethod.GET)
	public ModelAndView editarVer(@PathVariable("id") int id) {
		
		Estudiante e = eDAO.readOne(id);
		return new ModelAndView("editar", "e", e);
		
	}

	@RequestMapping(value = "/editar/{id}", method = RequestMethod.POST)
	public ModelAndView editarGuardar(@PathVariable("id") int id, @RequestParam("rut") String rut, 
			@RequestParam("nombre") String nombre, @RequestParam("apellido") String apellido ) {
		
		Estudiante e = eDAO.readOne(id);
		e.setDni(rut);
		e.setNombre(nombre);
		e.setApellido(apellido);
		
		eDAO.update(e);
		return new ModelAndView("redirect:/estudiante/listar");
		
		
	}

	@RequestMapping(value = "/ver/{rut}", method = RequestMethod.GET)
	public String ver(Model model, @PathVariable("rut") String rut) {

		//EstudianteDAOImpl eDAO = new EstudianteDAOImpl();
		Estudiante e = eDAO.readOne(rut);

		model.addAttribute("e", e);

		return "ver";
	}

	@RequestMapping(value = "/crear", method = RequestMethod.GET)
	public String crearVer(Model model) {

		//EstudianteDAOImpl eDAO = new EstudianteDAOImpl();
		Estudiante e = eDAO.readOne("1-1");

		model.addAttribute("e", e);

		return "crear";
	}

	@RequestMapping(value = "/crear", method = RequestMethod.POST)
	public String crearGuardar(Model model, @RequestParam("rut") String rut, @RequestParam("nombre") String nombre,
			@RequestParam("apellido") String apellido) {

		
		System.out.println("Rut:" + rut );
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		return "redirect:/estudiante/listar";

	}
	@RequestMapping(value="/borrar/{id}", method = RequestMethod.GET)
	public ModelAndView borrar(@PathVariable("id") int id) {
		
		eDAO.delete(id);
		return new ModelAndView("redirect:/estudiante/listar");
	}

}
