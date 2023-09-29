package com.m.roman.oreh.service;

import com.m.roman.oreh.entity.Media;

import java.util.List;

public interface MediaService {


    public List<Media> getAllMedia();

    public Media getMedia(int id);

    public void saveMedia(Media media);

    public void deleteMedia(int id);

    public void updateMedia(Media media);

}
