package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.kwejk.dao.GifDao;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class GifController
{

    @Autowired
    private GifDao gifDao;

    @GetMapping("/")
    public String home(ModelMap modelMap){

        modelMap.addAttribute("gifs", gifDao.findall());
        return "home";
    }

    @GetMapping("/gif/{name}")
    public String searchResult(@PathVariable String name, ModelMap modelMap)
    {
        modelMap.addAttribute("gif", gifDao.findOne(name).getUrl());
        return "gif-details";
    }


}
