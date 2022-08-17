package com.cloudofgoods.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchedSubstring  implements Serializable {
    private static final long serialVersionUID = 7156526077883281623L;
    @JsonProperty("length")
    public int length;
    @JsonProperty("offset")
    public int offset;
}