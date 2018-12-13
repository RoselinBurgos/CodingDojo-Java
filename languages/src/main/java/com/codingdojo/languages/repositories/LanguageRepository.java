package com.codingdojo.languages.repositories;

import org.springframework.data.repository.CrudRepository;
import com.codingdojo.languages.models.language;

public interface LanguageRepository extends CrudRepository<language, Long> {
}