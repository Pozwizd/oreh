package com.m.roman.oreh.service.serviceImp;

import com.m.roman.oreh.entity.TitleText;
import com.m.roman.oreh.repository.TitleTextRepository;
import com.m.roman.oreh.service.TitleTextService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TitleTextServiceImp implements TitleTextService {

    private final TitleTextRepository titleTextRepository;

    public TitleTextServiceImp(TitleTextRepository titleTextRepository) {
        this.titleTextRepository = titleTextRepository;
    }


    @Override
    public TitleText getTitleText(int id) {
        Optional<TitleText> titleText = titleTextRepository.findById(id);
        return titleText.orElse(null);
    }
}
