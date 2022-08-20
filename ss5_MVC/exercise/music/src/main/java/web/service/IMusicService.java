package web.service;

import web.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void save(Music music);

    Music findByID(int id);

    void update(Music music);

    void delete(Music music);
}
