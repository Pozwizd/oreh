package com.m.roman.oreh.service;

import com.m.roman.oreh.entity.Media;

import java.util.List;

public interface MediaService {


    public List<Media> getAllMedia();

    public Media getMedia(long id);

    public void saveMedia(Media media);

    public void deleteMedia(long id);

    public void updateMedia(Media media);

}
