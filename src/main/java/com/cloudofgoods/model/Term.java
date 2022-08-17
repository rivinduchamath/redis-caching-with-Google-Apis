package com.cloudofgoods.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Term  implements Serializable {

    private static final long serialVersionUID = 7156526077883281623L;
    @JsonProperty("offset")
    public int offset;
    @JsonProperty("value")
    public String value;
}
