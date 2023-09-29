package com.m.roman.oreh.service;

import com.m.roman.oreh.entity.TitleText;

import java.util.List;

public interface TitleTextService {

    public void saveTitleText(TitleText titleText);

    public void deleteTitleText(int id);

    public void updateTitleText(TitleText titleText);

    public List<TitleText> getAllTitleText();

    public TitleText getTitleText(int id);
}
