package it.reply.bootcamp.collettore;

import org.springframework.stereotype.Component;

@Component
public class NumberFallback implements NumberClient {

	@Override
	public String getNumeberRandom() {

		
		return "0";
	}
 
    

	
}
 