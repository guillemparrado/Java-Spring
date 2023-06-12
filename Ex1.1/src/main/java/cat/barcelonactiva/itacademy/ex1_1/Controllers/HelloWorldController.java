package cat.barcelonactiva.itacademy.ex1_1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(required = false) String nom) {
        if (nom == null)
            nom = "UNKNOWN";
        return "Hola, " + nom + ". Estàs executant un projecte Maven.";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(required = false, value = "nom") String nom) {
        if (nom == null)
            nom = "UNKNOWN";
        return "Hola, " + nom + ". Estàs executant un projecte Maven.";
    }
}
