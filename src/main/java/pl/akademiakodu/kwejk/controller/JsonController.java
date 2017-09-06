package pl.akademiakodu.kwejk.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiakodu.kwejk.Gif;
import pl.akademiakodu.kwejk.dao.GifDao;
import pl.akademiakodu.kwejk.dao.GifDaoImpl;

import java.util.List;

@RestController
public class JsonController {

    @Autowired
    private GifDao gifDao;

@RequestMapping ("api/gifs")
    public Gif gifJason(@RequestParam String q)
{
    return gifDao.findOne(q);
}



    }