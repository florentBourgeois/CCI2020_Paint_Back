package fr.cci.formationobjet.java.PaintFront.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.cci.formationobjet.java.PaintFront.bean.HumanBean;
import fr.cci.formationobjet.java.PaintFront.proxy.MicroserviceBackProxy;



@Controller
public class VueHTMLHumansController {

	
	// on utilise un MicroserviceBackProxy pour se connecter au microservice du projet back
	@Autowired
	private MicroserviceBackProxy humanProxy;

	
	// lorsque l'utilisateur demande la page accueil on veut afficher la liste des humains
	@GetMapping(value= "/humans")
	public String pageList(Model model) { // Model est l'objet qui sera passé en paramettre dans la page html.
		List<HumanBean> humans = humanProxy.getHumans(); // utiliser le proxy pour demander au microservice d'humains la liste des humains.
		System.err.println(humans);
		for (HumanBean h : humans) {
			System.err.println("Humain" + h);
		}
		
		humans.stream().filter(h -> h.getAge() > 18)
			.forEach(System.out::println);
		
		model.addAttribute("humans", humans); // on ajout les humains dans le modèle pour que la page html puisse y acceder
		return "humansHTML"; // faire le rendu de la page html
	}
	
	
	//détail d'un utilisateur 
		@GetMapping(value= "/humans/{id}")
		public String pageDetail(@PathVariable int id, Model model) { 
			HumanBean human = humanProxy.humanByID(id);
			System.err.println(human);
			
			model.addAttribute("h", human);
			return "humanDetailHTML"; 
		}
	
	
	
}

