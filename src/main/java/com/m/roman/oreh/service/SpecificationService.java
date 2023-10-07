package com.m.roman.oreh.service;

import com.m.roman.oreh.model.Specification;

import java.util.List;

public interface SpecificationService {

    public void saveSpecification(Specification specification);

    public void deleteSpecification(long id);

    public void updateSpecification(Specification specification);

    public Specification getSpecification(long id);

    public List<Specification> getAllSpecifications();



}
