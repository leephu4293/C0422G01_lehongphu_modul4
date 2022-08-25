package com.demo.service;

import com.demo.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IMusicService {
    Page<Music> findAll(Pageable pageable);
    Music findById(int id);
    void save(Music music);
}
