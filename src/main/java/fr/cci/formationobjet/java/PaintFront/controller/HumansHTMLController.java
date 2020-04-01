package fr.cci.formationobjet.java.PaintFront.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.cci.formationobjet.java.PaintFront.beans.HumanBean;
import fr.cci.formationobjet.java.PaintFront.proxy.MicroservicePaintBackProxy;

@Controller
public class HumansHTMLController {

	@Autowired
	private MicroservicePaintBackProxy humanProxy;
	
	
	@GetMapping(value= "/humans")
	public void test() {
		List<HumanBean> humans = humanProxy.getHumans();
		
		for (HumanBean h : humans) {
			System.out.println(h);
		}
				
				
	}
	
	
	@GetMapping(value= "/humans/{id}")
	public void testUnique(@PathVariable int id) {
		HumanBean human = humanProxy.getOneHuman(id);
		
		System.out.println(human);
				
				
	}
	
}
