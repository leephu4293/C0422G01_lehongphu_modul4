package web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Music;
import web.repository.IMusicRepository;
import web.service.IMusicService;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepository iMusicRepository;

    @Override
    public List<Music> findAll() {
        return this.iMusicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        this.iMusicRepository.save(music);
    }

    @Override
    public Music findByID(int id) {
        return this.iMusicRepository.findByID(id);
    }

    @Override
    public void update(Music music) {
        this.iMusicRepository.update(music);
    }

    @Override
    public void delete(Music music) {
        this.iMusicRepository.delete(music);
    }
}
