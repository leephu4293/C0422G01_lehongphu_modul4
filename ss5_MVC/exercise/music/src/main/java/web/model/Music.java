package web.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;


@Entity
@Table(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String singer;
    private String form;
    private String link;
    @Transient
    private  MultipartFile linkHeard;

    public Music() {
    }

    public Music(String name, String singer, String form, String link, MultipartFile linkHeard) {
        this.name = name;
        this.singer = singer;
        this.form = form;
        this.link = link;
        this.linkHeard = linkHeard;
    }

    public Music(int id, String name, String singer, String form, String link, MultipartFile linkHeard) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.form = form;
        this.link = link;
        this.linkHeard = linkHeard;
    }

    public Music(int id, String name, String singer, String form, String link) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.form = form;
        this.link = link;
    }

    public MultipartFile getLinkHeard() {
        return linkHeard;
    }

    public void setLinkHeard(MultipartFile linkHeard) {
        this.linkHeard = linkHeard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

//    public MultipartFile getLinkHeard() {
//        return linkHeard;
//    }
//
//    public void setLinkHeard(MultipartFile linkHeard) {
//        this.linkHeard = linkHeard;
//    }
}
