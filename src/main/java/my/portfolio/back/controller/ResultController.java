package my.portfolio.back.controller;

import my.portfolio.back.dtos.ResponseDataDTO;
import my.portfolio.back.enums.AppLang;
import my.portfolio.back.enums.JobTypes;
import my.portfolio.back.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/results")
public class ResultController {

    @Autowired
    private ResultService resultService;

    @GetMapping("/type={type}")
    public ResponseEntity<ResponseDataDTO> getAllResultsByType(@RequestHeader(value = "Accept-Language", defaultValue = "uz") AppLang lang, @PathVariable(name = "type") JobTypes type) {
        ResponseDataDTO responseDataDTO = resultService.getAllResultsByJobType(lang, type);

        return ResponseEntity.ok(responseDataDTO);
    }
}
