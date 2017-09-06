package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.Gif;

import java.util.List;

public interface GifDao {
    List<Gif> findAll();
    List<Gif> findFavorite();
    Gif findOne(String name);
    List<Gif> findId(Integer id);


}
