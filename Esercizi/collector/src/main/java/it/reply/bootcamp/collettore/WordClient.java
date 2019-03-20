package it.reply.bootcamp.collettore;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "", fallback = WordsFallback.class)
public interface WordClient {
@RequestMapping(value="/words/{number}", method=RequestMethod.GET)
public String getWordRandom(@PathVariable(value = "number", required = true) Integer number);
}