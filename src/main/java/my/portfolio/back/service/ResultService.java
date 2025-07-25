package my.portfolio.back.service;


import my.portfolio.back.dtos.LocalizedDto;
import my.portfolio.back.dtos.ResponseDataDTO;
import my.portfolio.back.entity.ResultEntity;
import my.portfolio.back.enums.AppLang;
import my.portfolio.back.enums.JobTypes;
import my.portfolio.back.repository.ResultRepository;
import my.portfolio.back.utils.LocalizationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    @Autowired
    private ResourceBundleService getMessageService;


    public ResponseDataDTO getAllResultsByJobType(AppLang lang, JobTypes joyType) {
        List<ResultEntity> list = resultRepository.findByJobType(joyType);
        if (!list.isEmpty()) {
            List<LocalizedDto> dtos = new ArrayList<>();

            for (ResultEntity entity : list) {
                LocalizedDto dto = LocalizationUtil.localize(
                        entity,
                        lang,
                        List.of("body")  // til bo‘yicha ajratilgan maydonlar
                );

                dto.put("id", entity.getId());
                dto.put("title", entity.getTitle());
                dto.put("icon", entity.getIcon());
                dto.put("job_type", entity.getJobType());
                dto.put("created_at", entity.getCreatedAt());

                dtos.add(dto);
            }

            //  create a new response dto
            ResponseDataDTO newDto = new ResponseDataDTO();
            newDto.setData(dtos);
            newDto.setMessage(getMessageService.getMessage("result.success", lang));
            newDto.setStatus(200);


            return newDto;

        }

        ResponseDataDTO response = new ResponseDataDTO();
        response.setData(List.of());
        response.setMessage(getMessageService.getMessage("result.not_found", lang));
        response.setStatus(404);

        return response;
    }

}
