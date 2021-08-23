package cl.awakelab.stsproj.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.awakelab.stsproj.model.Estudiante;
import cl.awakelab.stsproj.model.DAO.EstudianteDAOImpl;

@Controller
@RequestMapping(value = "/estudiante")
public class EstudianteController {

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model) {

		EstudianteDAOImpl eDAO = new EstudianteDAOImpl();

		List<Estudiante> lista = eDAO.readAll();

		model.addAttribute("lista", lista);

		return "listar";

	}

	@RequestMapping(value = "/editar/{rut}", method = RequestMethod.GET)
	public String editarVer(Model model, @PathVariable("rut") String rut) {
		return "editar";
	}

	@RequestMapping(value = "/editar/{rut}", method = RequestMethod.POST)
	public String editarGuardar(Model model, @PathVariable("rut") String rut) {
		return "editar";
	}

	@RequestMapping(value = "/ver/{rut}", method = RequestMethod.GET)
	public String ver(Model model, @PathVariable("rut") String rut) {

		EstudianteDAOImpl eDAO = new EstudianteDAOImpl();
		Estudiante e = eDAO.readOne(rut);

		model.addAttribute("e", e);

		return "ver";
	}

	@RequestMapping(value = "/crear", method = RequestMethod.GET)
	public String crearVer(Model model) {

		EstudianteDAOImpl eDAO = new EstudianteDAOImpl();
		Estudiante e = eDAO.readOne("4-4");

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

}
