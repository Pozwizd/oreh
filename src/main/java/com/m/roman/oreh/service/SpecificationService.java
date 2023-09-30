package com.m.roman.oreh.service;

import com.m.roman.oreh.entity.Specification;

import java.util.List;

public interface SpecificationService {

    public void saveSpecification(Specification specification);

    public void deleteSpecification(int id);

    public void updateSpecification(Specification specification);

    public Specification getSpecification(int id);

    public List<Specification> getAllSpecifications();



}
