package com.cloudofgoods.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Root  implements Serializable {

    private static final long serialVersionUID = 7156526077883281623L;

    @JsonProperty("predictions")
    public ArrayList<Prediction> predictions;
    @JsonProperty("status")
    public String status;
}