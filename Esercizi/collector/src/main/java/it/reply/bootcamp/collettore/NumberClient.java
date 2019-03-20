package it.reply.bootcamp.collettore;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@FeignClient(value = "", fallback = NumberFallback.class)
public interface NumberClient {
	
@RequestMapping(value="/random/", method=RequestMethod.GET)
public String getNumeberRandom();
}