package pl.akademiakodu.kwejk.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.Gif;

import java.util.ArrayList;
import java.util.List;

@Component
public class GifDaoImpl implements GifDao {


    public GifDaoImpl() {}

    private static List<Gif> gifs = new ArrayList<>();

    public static List<Gif> getGifs() {
        return gifs;
    }

    static
    {
        gifs.add(new Gif("android-explosion", "username1"));
        gifs.add(new Gif("ben-and-mike", "username2"));
        gifs.add(new Gif("book-dominos", "username3", true));
        gifs.add(new Gif("compiler-bot", "username4"));
        gifs.add(new Gif("cowboy-coder", "username5", true));
        gifs.add(new Gif("infinite-andrew", "username6"));
    }

    @Override
    public List<Gif> findAll()
    {
        return gifs;
    }

    @Override
    public List<Gif> findFavorite()
    {
        List<Gif> list = new ArrayList<>();
        for (Gif gif : gifs)
        {
            if(gif.isFavorite())list.add(gif);
        }
        return list;
    }

    @Override
    public Gif findOne(String name)
    {
        for (Gif gif : gifs)
        {
            if (gif.getName().equals(name))
            {
                return gif;
            }
        }
        return null;
    }


}
