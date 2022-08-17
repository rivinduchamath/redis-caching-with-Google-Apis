package com.cloudofgoods.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prediction  implements Serializable {
    private static final long serialVersionUID = 7156526077883281623L;

    @JsonProperty("description")
    public String description;
    @JsonProperty("matched_substrings")
    public ArrayList<MatchedSubstring> matchedSubstrings;
    @JsonProperty("place_id")
    public String place_id;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("structured_formatting")
    public StructuredFormatting structuredFormatting;
    @JsonProperty("terms")
    public ArrayList<Term> terms;
    @JsonProperty("types")
    public ArrayList<String> types;

}
