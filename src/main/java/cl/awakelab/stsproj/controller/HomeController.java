package cl.awakelab.stsproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.stsproj.model.Facilitador;

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

		Facilitador f = new Facilitador("1-1", "Brian", "Guzmán");

		model.addAttribute("f", f);

		return "home";
	}

	/**
	 * Definimos una expresión regular donde
	 * @param nombre recibe letras desde a hasta la z, entre 1 y 20 caracteres.
	 * @param version recibe números entre 0 y 9, entre 1 y dos digitos, tres veces.
	 * @param extension recibe letras desde la a hasta la z, A hasta la Z, y números desde el 0 al 9, desde 1 a 10 veces.
	 * @return retorna "home", y muestra por consola lo que ingresaste.
	 */
	@RequestMapping(value = "/jome/{nombre:[a-z]{1,20}}.{version:[0-9]{1,2}.[0-9]{1,2}.[0-9]{1,2}}.{extension:[a-zA-Z0-9]{1,10}}", method = RequestMethod.GET)
	public String jome(@PathVariable("nombre") String nombre, @PathVariable("version") String version,
			@PathVariable("extension") String extension) {

		System.out.println(nombre + "." + version + "." + extension);
		return "home";

	}

}
