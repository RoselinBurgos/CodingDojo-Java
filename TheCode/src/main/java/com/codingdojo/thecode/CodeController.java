package com.codingdojo.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
    @PostMapping("/guessed")
    public String code(@RequestParam("wordguessed") String code, RedirectAttributes redirectAttributes){
        if(code.equals("bushido")){
            return "redirect:/code";
        }else{
            redirectAttributes.addFlashAttribute("error", "Train harder!");
            return"redirect:/";
        }
    }
	
	
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
	}

}
