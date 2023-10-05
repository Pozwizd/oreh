package com.m.roman.oreh.service.serviceImp;

import com.m.roman.oreh.entity.Media;
import com.m.roman.oreh.repository.MediaRepository;
import com.m.roman.oreh.service.MediaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaServiceImp implements MediaService {

    private final MediaRepository mediaRepository;


    public MediaServiceImp(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    @Override
    public List<Media> getAllMedia() {
        return mediaRepository.findAll();
    }

    @Override
    public Media getMedia(long id) {
        return mediaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveMedia(Media media) {
        mediaRepository.save(media);
    }

    @Override
    public void deleteMedia(long id) {
        mediaRepository.deleteById(id);
    }

    @Override
    public void updateMedia(Media media) {
        mediaRepository.save(media);
    }
}
