package com.m.roman.oreh.service.serviceImp;

import com.m.roman.oreh.entity.TitleText;
import com.m.roman.oreh.repository.TitleTextRepository;
import com.m.roman.oreh.service.TitleTextService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TitleTextServiceImp implements TitleTextService {

    private final TitleTextRepository titleTextRepository;

    public TitleTextServiceImp(TitleTextRepository titleTextRepository) {
        this.titleTextRepository = titleTextRepository;
    }


    @Override
    public void saveTitleText(TitleText titleText) {
        titleTextRepository.save(titleText);
    }

    @Override
    public void deleteTitleText(long id) {
        titleTextRepository.deleteById(id);
    }

    @Override
    public void updateTitleText(TitleText titleText) {
        titleTextRepository.save(titleText);
    }

    @Override
    public List<TitleText> getAllTitleText() {
        return titleTextRepository.findAll();
    }

    @Override
    public TitleText getTitleText(long id) {
        Optional<TitleText> titleText = titleTextRepository.findById(id);
        return titleText.orElse(null);
    }
}
