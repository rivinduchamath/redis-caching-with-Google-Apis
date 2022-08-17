package com.cloudofgoods.service.impl;

import com.cloudofgoods.model.Root;
import com.cloudofgoods.service.LocationBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class LocationBOImpl implements LocationBO {

    @Override
    public ResponseEntity<Root> getLocationData(String location) {
        return new RestTemplate().getForEntity(
                "https://maps.googleapis.com/maps/api/place/autocomplete/json?key=AIzaSyBgJFHBsP4ZuLkpUHJhQJXqRjBAf3GN-qo&input="+location,
                Root.class );
    }
}
