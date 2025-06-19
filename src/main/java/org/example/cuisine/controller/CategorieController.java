package org.example.cuisine.controller;


import ch.qos.logback.core.model.Model;
import org.example.cuisine.service.CategorieService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategorieController {


private final CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }


    @GetMapping("/categories")
    public String listCategories() {

        return "categories";
    }


}
