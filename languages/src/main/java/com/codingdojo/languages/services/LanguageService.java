package com.codingdojo.languages.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.language;
import com.codingdojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
    private LanguageRepository languageRepository;
    public LanguageService(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }

    
    private List<language> languages = new ArrayList<>(Arrays.asList(
            new language("Java", "James Gosling", "1.8"),
            new language("Python", "Guido van Rossum", "3.6")
    ));
    
    public Iterable<language> allLanguages(){
        return languageRepository.findAll();
    }
    public void addLanguage(language language){
        languageRepository.save(language);
    }
    public void deleteLanguage(Long index){
        languageRepository.deleteById(index);

    }
    public language getLanguageByID(Long id){
    	Optional<language> check = languageRepository.findById(id);
    	if(check.isPresent()) {
    		return check.get();
    	}
    	else {
    		return null;
    	}
       
    }
    
    public void editLanguage(language language){
        languageRepository.save(language);

}
	public List<language> getLanguages() {
		return languages;
	}
	public void setLanguages(List<language> languages) {
		this.languages = languages;
	}

}