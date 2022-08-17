package com.cloudofgoods.controller;

import com.cloudofgoods.model.Root;
import com.cloudofgoods.service.LocationBO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Slf4j
public class LocationController {
    private final LocationBO locationBO;

    @GetMapping("/getLocation/{location}")
    @Cacheable(key = "#location", value = "root")
    public Root getLocation(@PathVariable(name = "location") String location) {
        ResponseEntity<Root> responseResponseEntity = null;
        try {
            responseResponseEntity = locationBO.getLocationData(location);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Location Not Found Or Error");
        }
        assert responseResponseEntity != null;
        return responseResponseEntity.getBody();
    }
}
