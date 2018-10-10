package guru.springframework.norris.chuck.controller;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    @RequestMapping("/")
    public String getJokes(Model model) {
        model.addAttribute("joke", ChuckNorrisQuotes.getRandomQuote());
        return "checknorris";
    }
}
