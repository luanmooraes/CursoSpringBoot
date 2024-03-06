package academy.devdojo.springboot3.controller;

import academy.devdojo.springboot3.domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("animes")
public class AnimeController {
    @GetMapping("list")
    public List<Anime> list(){
        return List.of(new Anime("DBZ"), new Anime("Pokemon"));
    }
}

