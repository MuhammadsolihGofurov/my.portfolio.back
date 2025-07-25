package my.portfolio.back.utils;

import my.portfolio.back.dtos.LocalizedDto;
import my.portfolio.back.enums.AppLang;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class LocalizationUtil {

    public static LocalizedDto localize(Object entity, AppLang lang, List<String> fields) {
        LocalizedDto dto = new LocalizedDto();

        for (String field : fields) {
            try {
                String langSuffix = lang.name().toLowerCase(); // en, uz, ru
                String methodName = "get" + capitalize(field) + capitalize(langSuffix);

                Method method = entity.getClass().getMethod(methodName);
                Object value = method.invoke(entity);

                dto.put(field, value);
            } catch (Exception e) {
                e.printStackTrace(); // Optionally log
            }
        }

        return dto;
    }

    public static List<LocalizedDto> localizeList(List<?> entities, AppLang lang, List<String> fields) {
        List<LocalizedDto> result = new ArrayList<>();
        for (Object entity : entities) {
            result.add(localize(entity, lang, fields));
        }
        return result;
    }

    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
