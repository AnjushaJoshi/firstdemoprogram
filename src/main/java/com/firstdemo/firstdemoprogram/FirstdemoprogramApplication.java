package com.firstdemo.firstdemoprogram;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstdemoprogramApplication
{
	@RequestMapping("/sum/{a},{b}")
	public String sumoftwonumbers(@PathVariable int a,@PathVariable int b)
	{
		int c;
		c=a+b;
		return "Sum of the numbers is:" +c;
	}
}


