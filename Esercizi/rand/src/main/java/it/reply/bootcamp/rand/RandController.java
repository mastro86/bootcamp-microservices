package it.reply.bootcamp.rand;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/random")
public class RandController {
	
	
	
	int min;
	int max;
	
	
	
	@RequestMapping("/")
	public Integer getNumberRandom() {
	  
		return null;

	}
	
	
	
	@RequestMapping("/{number}")
	public Integer getNumebrRandomFromValue(@PathVariable("number") Integer number) {
	  
		return null;
	}

}
