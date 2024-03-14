package fr.domes.domes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import fr.domes.domes.entities.Employe;
import fr.domes.domes.services.EmployeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ThymeEmployeController {

    @Autowired
    private EmployeService employeService;

    @GetMapping("/listemploye")
    public String listEmployes(Model model) {
        List<Employe> employes = employeService.getAllEmployes();
        model.addAttribute("listEmployes", employes);
        return "employeList";
    }

    @GetMapping("/addemploye")
    public String showAddEmployeForm(Model model) {
        model.addAttribute("addeditemployes", new Employe());
        return "addEditEmploye";
    }

    @GetMapping("/editemploye/{id}")
    public String showEditEmployeForm(@PathVariable Long id, Model model) {
        Employe employe = employeService.getEmployeById(id);
        model.addAttribute("addeditemployes", employe);
        return "addEditEmploye";
    }

    
    @PostMapping("/saveemploye")
    public String saveEmploye(@ModelAttribute Employe employe) {
        employeService.addEmploye(employe);
        return "redirect:/listemploye";
    }

    @GetMapping("/deleteemploye/{id}")
    public String deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
        return "redirect:/listemploye";
    }

}
