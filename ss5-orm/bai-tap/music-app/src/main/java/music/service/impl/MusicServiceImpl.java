package music.service.impl;

import music.model.Music;
import music.service.IMusicService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

@Service
public class MusicServiceImpl implements IMusicService {
    private static List<Music> musicList;
    private static long autoIncreaseId = 0;

    @Override
    public List<Music> findAll() {
        return new ArrayList<>(musicList);
    }

    @Override
    public Music findOne(Long id) {
        return musicList.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Music save(Music music) {
        return music.getId() == null ? persist(music) : merge(music);
    }

    @Override
    public List<Music> save(List<Music> musicList) {
        return musicList.stream()
                .map(this::save)
                .collect(Collectors.toList());
    }

    @Override
    public boolean exists(Long id) {
        return musicList.stream().anyMatch(c -> c.getId().equals(id));
    }

    @Override
    public List<Music> findAll(List<Long> longList) {
        return longList.stream()
                .map(this::findOne)
                .collect(Collectors.toList());
    }

    @Override
    public long count() {
        return musicList.size();
    }

    @Override
    public void delete(Long id) {
        musicList.removeIf(c -> c.getId().equals(id));
    }

    @Override
    public void delete(Music music) {
        delete(music.getId());
    }

    @Override
    public void delete(List<Music> musicList) {

    }

    @Override
    public void deleteAll() {

    }


    private Music persist(Music music) {
        Music clone = music.clone();
        clone.setId(autoIncreaseId++);
        musicList.add(clone);
        return clone;
    }

    private Music merge(Music music) {
        Music origin = findOne(music.getId());
        origin.setName(music.getName());
        origin.setSinger(music.getSinger());
        origin.setStyle(music.getStyle());
        origin.setLink(music.getLink());
        return origin;
    }
}
