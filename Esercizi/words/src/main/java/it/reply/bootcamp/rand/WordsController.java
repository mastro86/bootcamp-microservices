package it.reply.bootcamp.rand;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/words")
public class WordsController {
	
	
	
	String sepratore;
	
	String listaKeyword;
	
	
	String porta;

	@RequestMapping(value ="/{number}",method = RequestMethod.GET)
	public String getWordRandom(@PathVariable(value = "number", required = true) Integer number) {
	  
		return null;
		

	}

}
