package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.Gif;

import java.util.List;

public interface GifDao {
    List<Gif> findall();
    Gif findOne(String name);
}
