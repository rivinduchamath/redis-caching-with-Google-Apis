package com.cloudofgoods.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MainTextMatchedSubstring {
    @JsonProperty("length")
    public int length;
    @JsonProperty("offset")
    public int offset;
}

