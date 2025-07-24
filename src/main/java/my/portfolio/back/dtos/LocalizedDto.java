package my.portfolio.back.dtos;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonValue;

public class LocalizedDto {
    private final Map<String, Object> localized = new HashMap<>();

    public void put(String key, Object value) {
        localized.put(key, value);
    }

    @JsonValue
    public Map<String, Object> getAll() {
        return localized;
    }
}

