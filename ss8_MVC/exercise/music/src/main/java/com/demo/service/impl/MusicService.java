package com.demo.service.impl;

import com.demo.model.Music;
import com.demo.repository.IMusicRepository;
import com.demo.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MusicService implements IMusicService {
    @Autowired
    IMusicRepository iMusicRepository;


    @Override
    public Page<Music> findAll(Pageable pageable) {
        return this.iMusicRepository.findAll(pageable);
    }

    @Override
    public Music findById(int id) {
        return this.iMusicRepository.getById(id);
    }

    @Override
    public void save(Music music) {
      this.iMusicRepository.save(music);
    }
}
