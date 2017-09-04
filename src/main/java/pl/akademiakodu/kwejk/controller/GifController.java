package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akademiakodu.kwejk.Gif;
import pl.akademiakodu.kwejk.dao.GifDao;

import java.util.List;

@Controller
public class GifController {


    @Autowired
    private GifDao gifDao;



    @GetMapping("/")
    public String home(@ModelAttribute List<Gif>, ModelMap modelMap){

        modelMap.addAttribute("gif",
        return "home";
    }


}
