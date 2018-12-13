package com.codingdojo.languages.controllers;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.languages.models.language;
import com.codingdojo.languages.services.LanguageService;


@Controller
public class LanguagesApi {
	
    private final LanguageService languageService;

    public LanguagesApi(LanguageService languageService){
        this.languageService = languageService;
    }

    @RequestMapping("/languages")
    public String home(@ModelAttribute("language") language language, Model model){
        Iterable<language> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
        return "languages.jsp";
    }
    
    @PostMapping("/languages")
    public String newLanguage(@Valid @ModelAttribute("language") language language, BindingResult result){
        if(result.hasErrors()){
            return "languages.jsp";
        }else{
            languageService.addLanguage(language);
            return "redirect:/languages";
        }
    }
    @RequestMapping("/languages/delete/{id}")
    public String deleteLanguage(@PathVariable("id") Long id){
        languageService.deleteLanguage(id);
        return "redirect:/languages";
    }
    @RequestMapping("/languages/edit/{id}")
    public String editLanguage(@ModelAttribute("language")language lang,@PathVariable("id") Long id, Model model){
        language language = languageService.getLanguageByID(id);
        model.addAttribute("language", language);
        model.addAttribute("id", id);
        return "edit.jsp";
    }
    
    @PostMapping("/languages/edit/{id}")
    public String updateLanguage(@PathVariable("id") int id, @Valid @ModelAttribute("language") language language, BindingResult result){
        if(result.hasErrors()){
            return "edit.jsp";
        }else{
            languageService.editLanguage(language);
            return "redirect:/languages";
        }
    }
    @RequestMapping("/languages/{id}")
    public String getLanguge(@PathVariable("id") Long id, Model model){
        language language = languageService.getLanguageByID(id);
        model.addAttribute("language", language);
        return "lang.jsp";
    }


}
