package music.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Music implements Cloneable{

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String singer;
    private String style;
    private String link;

    public Music() {
    }

    public Music(Long id, String name, String singer, String style, String link) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.style = style;
        this.link = link;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public Music clone() {
        Music music = new Music();
        music.setId(id);
        music.setName(name);
        music.setSinger(singer);
        music.setStyle(style);
        music.setLink(link);
        return music;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                ", style='" + style + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
