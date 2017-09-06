package pl.akademiakodu.kwejk;

public class Gif {
    private String name;
    private String username;
    private Integer id;
    private boolean isFavorite;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Gif(String name, String username, Integer id, boolean isFavorite) {
        this.name = name;
        this.username = username;
        this.id = id;
        this.isFavorite = isFavorite;
    }

    public Gif(String name, String username, boolean isFavorite) {
        this.name = name;
        this.username = username;
        this.isFavorite = isFavorite;
    }

    public Gif(String name, String username) {
        this.name = name;
        this.username = username;
        this.isFavorite = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getUrl() {
        return getName() + ".gif";
    }

    }