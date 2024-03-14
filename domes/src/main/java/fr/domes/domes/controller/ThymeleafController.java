package fr.domes.domes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.domes.domes.entities.Categorie;
import fr.domes.domes.services.CategorieService;

@Controller
public class ThymeleafController {
 @Autowired
 private CategorieService categorieService;
 @GetMapping("/api/categorie/list")
 public String showCategoriesList(Model model) {
 List<Categorie> categories = categorieService.getAllCategories();
 model.addAttribute("categories", categories);
 return "categoriesList";
 }
}
