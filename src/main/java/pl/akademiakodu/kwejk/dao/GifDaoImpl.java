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
        gifs.add(new Gif("android-explosion", "username1",2, false));
        gifs.add(new Gif("ben-and-mike", "username2",0, false));
        gifs.add(new Gif("book-dominos", "username3",2, true));
        gifs.add(new Gif("compiler-bot", "username4",2, false));
        gifs.add(new Gif("cowboy-coder", "username5",1, true));
        gifs.add(new Gif("infinite-andrew", "username6",1, false));
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

    @Override
    public List<Gif> findId(Integer id)
    {
        List<Gif> list = new ArrayList<>();
        for (Gif gif : gifs)
        {
            if (gif.getId()==(id))
            list.add(gif);
        }
        return list;
    }


}
