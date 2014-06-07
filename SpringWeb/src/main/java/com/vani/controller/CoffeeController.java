package com.vani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vani.model.Coffee;

@Controller
@RequestMapping("/coffee")
public class CoffeeController {

	
	@RequestMapping(value="{name}", method=RequestMethod.GET)
	public @ResponseBody Coffee getCoffee(@PathVariable String name)
	{
		return new Coffee(name, 25);
	}
	
}
