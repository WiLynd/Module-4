package music.service;

import music.model.Music;

import java.util.List;

public interface IMusicService {

    List<Music> findAll();

    Music findOne(Long id);

    Music save(Music music);

    List<Music> save(List<Music> musicList);

    boolean exists(Long id);

    List<Music> findAll(List<Long> longList);

    long count();

    void delete(Long id);

    void delete(Music music);

    void delete(List<Music> musicList);

    void deleteAll();
}
