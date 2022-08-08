package net.niksune.ResourceTrading.controllers;

import net.niksune.ResourceTrading.entities.TestCoffre;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tests")
public class TestsThymleafController {


    @Value("${welcome.message}")
    private String message;

    @GetMapping(value = { "/", "/index" })
    public String index(Model model) {

        model.addAttribute("message", message);

        return "indexTests";
    }

    @GetMapping(value = "/secondPage")
    public String secondPage(Model model) {

        return "secondHtml";
    }

    @GetMapping(value = "/coffre")
    public String monCoffre(Model model) {

        model.addAttribute("monCoffre", new TestCoffre());

        return "affichageCoffre";
    }

}

