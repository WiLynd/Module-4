package music.model;

public class Music {
    private int id;
    private String name;
    private String singer;
    private String style;
    private String link;

    public Music() {
    }

    public Music(String name, String singer, String style, String link) {
        this.name = name;
        this.singer = singer;
        this.style = style;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
