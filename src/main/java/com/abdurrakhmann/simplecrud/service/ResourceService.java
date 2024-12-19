package com.abdurrakhmann.simplecrud.service;

import com.abdurrakhmann.simplecrud.model.Resource;
import com.abdurrakhmann.simplecrud.repository.ResourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {

    private final ResourceRepository resourceRepository;

    public ResourceService(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }

    public Resource addResource(Resource resource) {
        return resourceRepository.save(resource);
    }
}