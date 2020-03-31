package fr.cci.formationobjet.java.PaintFront.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import fr.cci.formationobjet.java.PaintFront.bean.HumanBean;


@FeignClient(name = "microservice-paint-back", url="localhost:9090")
public interface MicroserviceBackProxy {

	
	@GetMapping(value= "/humans")
	public List<HumanBean> getHumans();
	
	
	@GetMapping(value= "/humans/{id}")
	public HumanBean humanByID(@PathVariable("id") int id);
	/*
	@PostMapping(value= "/humans")
	public HumanBean postHumans(@RequestBody HumanBean h);

	
	@DeleteMapping(value= "/humans/{id}")
	public HumanBean delHuman(@PathVariable int id);
	*/
}
