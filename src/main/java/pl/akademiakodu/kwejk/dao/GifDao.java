package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.Gif;

import java.util.List;

public interface GifDao {
    List<Gif> findAll();
    Gif findOne(String name);

}
