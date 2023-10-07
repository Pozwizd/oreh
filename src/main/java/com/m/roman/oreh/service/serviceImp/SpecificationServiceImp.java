package com.m.roman.oreh.service.serviceImp;

import com.m.roman.oreh.model.Specification;
import com.m.roman.oreh.repository.SpecificationRepository;
import com.m.roman.oreh.service.SpecificationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecificationServiceImp implements SpecificationService {

    private final SpecificationRepository specificationRepository;

    public SpecificationServiceImp(SpecificationRepository specificationRepository) {
        this.specificationRepository = specificationRepository;
    }


    @Override
    public void saveSpecification(Specification specification) {
        specificationRepository.save(specification);
    }

    @Override
    public void deleteSpecification(long id) {
        specificationRepository.deleteById(id);
    }

    @Override
    public void updateSpecification(Specification specification) {
        specificationRepository.save(specification);
    }

    @Override
    public Specification getSpecification(long id) {
        return specificationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Specification> getAllSpecifications() {
        return specificationRepository.findAll();
    }
}
