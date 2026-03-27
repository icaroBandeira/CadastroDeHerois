package dev.java10x.CadastroDeHerois.Herois;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping ("/teste")
    public String teste () {
        return "AAAAAAAAAAAAAAAAAAAAALOOOOOOOOOOOOOOOOOOOOOUUUUUUUUUUUUUUUUUUUU";
    }

}
