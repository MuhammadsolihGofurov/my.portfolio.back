package my.portfolio.back.service;


import my.portfolio.back.dtos.LocalizedDto;
import my.portfolio.back.entity.AboutEntity;
import my.portfolio.back.enums.AppLang;
import my.portfolio.back.repository.AboutRepository;
import my.portfolio.back.utils.LocalizationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AboutService {

    @Autowired
    private AboutRepository aboutRepository;


    public LocalizedDto getFirstAboutEntity(AppLang lang) {
        try {
            AboutEntity entity = aboutRepository.findById(1).orElse(null);
            if (entity == null) return null;

            LocalizedDto dto = LocalizationUtil.localize(
                    entity,
                    lang,
                    List.of("bannerTitle", "bannerContent", "aboutContent",  "footerText")
            );

            dto.put("aboutPicture", entity.getAboutPicture());
            dto.put("email", entity.getEmail());
            dto.put("phone", entity.getPhone());
            dto.put("address", entity.getAddress());
            dto.put("resumeLink", entity.getResumeLink());

            return dto;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
