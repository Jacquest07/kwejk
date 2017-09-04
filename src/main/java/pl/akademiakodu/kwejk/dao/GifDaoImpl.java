package pl.akademiakodu.kwejk.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.Gif;

import java.util.ArrayList;
import java.util.List;
@Component
public class GifDaoImpl implements GifDao {

    public GifDaoImpl(){}

    private static List<String> names = new ArrayList<>();
    static {
        names.add("android-explosion");
        names.add("ben-and-mike");
        names.add("book-dominos");
        names.add("compiler-bot");
        names.add("cowboy-coder");
        names.add("infinite-andrew");
    }
        @Override
        public List<Gif> findall() {
        List<Gif> gifs = new ArrayList<>();
        int i=1;
                for(String name: names){
            gifs.add(new Gif(name,"username"+i++));

                }
            return gifs;
    }



}
