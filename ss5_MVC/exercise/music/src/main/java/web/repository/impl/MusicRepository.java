package web.repository.impl;
import org.springframework.stereotype.Repository;
import web.model.Music;
import web.repository.BaseRepository;
import web.repository.IMusicRepository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class MusicRepository implements IMusicRepository {
    @Override
    public List<Music> findAll() {
        TypedQuery<Music> typedQuery = BaseRepository.entityManager.createQuery("select m from Music  m",Music.class);
        return typedQuery.getResultList() ;
    }

    @Override
    public void save(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(music);
        entityTransaction.commit();
    }

    @Override
    public Music findByID(int id) {

        return BaseRepository.entityManager.find(Music.class,id);
    }

    @Override
    public void update(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
       BaseRepository.entityManager.merge(music);
       entityTransaction.commit();
    }

    @Override
    public void delete(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(music);
        entityTransaction.commit();
    }


}
