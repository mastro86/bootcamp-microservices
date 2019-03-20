package it.reply.bootcamp.collettore;

import org.springframework.stereotype.Component;

@Component
public class WordsFallback implements WordClient {
 
    

	@Override
	public String getWordRandom(Integer number) {

		return "Servizio con il numero : "+number+" non disponibile";
	}
}
 