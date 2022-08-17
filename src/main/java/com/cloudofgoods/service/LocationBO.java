package com.cloudofgoods.service;

import com.cloudofgoods.model.Root;
import org.springframework.http.ResponseEntity;

public interface LocationBO {

    ResponseEntity<Root> getLocationData(String location);
}
