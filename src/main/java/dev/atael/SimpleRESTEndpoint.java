package dev.atael;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRESTEndpoint {
 
    private final RegionsRepository regionRepository;

    public SimpleRESTEndpoint(RegionsRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @GetMapping("listregions")
    @ResponseStatus(HttpStatus.OK)
    public List<Regions> findAll() {
        return regionRepository.findAll();
    }

}
