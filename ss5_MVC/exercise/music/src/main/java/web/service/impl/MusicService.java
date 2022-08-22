package web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import web.model.Music;
import web.repository.IMusicRepository;
import web.service.IMusicService;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class MusicService implements IMusicService {
    @Value("${file-upload}")
    private String fileUpload;

    @Autowired
    private IMusicRepository iMusicRepository;

    @Override
    public List<Music> findAll() {
        return this.iMusicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        String file = "";
        try {
            file = music.getLinkHeard().getOriginalFilename();
            FileCopyUtils.copy(music.getLinkHeard().getBytes(),
                    new File("D:/CODEGYM/C0422G01_lehongphu_modul4/ss5_MVC/exercise/upfile/" + file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        music.setLink(file);
        this.iMusicRepository.save(music);
    }

    @Override
    public Music findByID(int id) {
        return this.iMusicRepository.findByID(id);
    }

    @Override
    public void update(Music music) {
        String file;
        file = music.getLinkHeard().getOriginalFilename();
        if (file!= ""){
            try {
                FileCopyUtils.copy(music.getLinkHeard().getBytes(),
                        new File("D:/CODEGYM/C0422G01_lehongphu_modul4/ss5_MVC/exercise/upfile/" + file));
            } catch (IOException e) {
                e.printStackTrace();
            }

            music.setLink(file);
        }

        this.iMusicRepository.update(music);
    }

    @Override
    public void delete(Music music) {
        this.iMusicRepository.delete(music);
    }
}
