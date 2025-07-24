package my.portfolio.back.utils;
import my.portfolio.back.dtos.LocalizedDto;
import my.portfolio.back.enums.AppLang;

import java.lang.reflect.Field;
import java.util.*;

public class LocalizationUtil {

    public static LocalizedDto localize(Object entity, AppLang lang, List<String> fieldPrefixes) {
        LocalizedDto dto = new LocalizedDto();
        String suffix = capitalize(lang.name());

        for (String prefix : fieldPrefixes) {
            String fieldName = prefix + suffix;

            try {
                Field field = entity.getClass().getDeclaredField(fieldName);
                field.setAccessible(true);
                Object value = field.get(entity);
                dto.put(prefix, value != null ? value.toString() : "");
            } catch (NoSuchFieldException | IllegalAccessException e) {
                dto.put(prefix, ""); // Or log warning
            }
        }

        return dto;
    }

    private static String capitalize(String input) {
        if (input == null || input.isEmpty()) return input;
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}
