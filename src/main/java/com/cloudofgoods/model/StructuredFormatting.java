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
public class StructuredFormatting  implements Serializable {

    private static final long serialVersionUID = 7156526077883281623L;
    @JsonProperty("main_text")
    public String mainText;
    @JsonProperty("main_text_matched_substrings")
    public ArrayList<MainTextMatchedSubstring> mainTextMatchedSubstrings;
    @JsonProperty("secondary_text")
    public String secondaryText;
}
