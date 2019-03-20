package it.reply.bootcamp.collettore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ParoleController {
	

	@Autowired 
	private NumberClient numberClient;

	@Autowired 
	private WordClient wordClient;


	 
	@RequestMapping("/")
	public String getSentence() {

	return "";

	}

}
