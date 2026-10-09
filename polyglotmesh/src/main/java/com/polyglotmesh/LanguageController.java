
package com.polyglotmesh;

import com.polyglotmesh.entity.Language;
import com.polyglotmesh.repository.LanguageRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

    private final LanguageRepository languageRepository;

    public LanguageController(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @GetMapping
    public List<Language> getAllLanguages() {
        return languageRepository.findAll();
    }

    @PostMapping
    public Language addLanguage(@RequestBody Language language) {
        return languageRepository.save(language);
    }
}
