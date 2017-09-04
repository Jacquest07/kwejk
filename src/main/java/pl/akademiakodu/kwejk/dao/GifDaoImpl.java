package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifDaoImpl implements GifDao {
    @Override
    public List<Gif> findall() {
        return null;
    }
    public GifDaoImpl(){}
    private static List<Gif> gif = new ArrayList<>();
    static {
        gif.add(new Gif("Android Explosion", "Wacek"));
        gif.add(new Gif("Ben and Mike", "Zdzisiek"));
        gif.add(new Gif("Book Dominos", "Krzyś"));
        gif.add(new Gif("Compiler Bot", "Ruda Grażyna"));
        gif.add(new Gif("Cowboy Coder", "Miś Kobiś"));
        gif.add(new Gif("Infinite Andrew", "Pan Tadeusz"));



    }



}
