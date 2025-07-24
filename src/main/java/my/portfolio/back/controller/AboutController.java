package my.portfolio.back.controller;


import my.portfolio.back.dtos.LocalizedDto;
import my.portfolio.back.entity.AboutEntity;
import my.portfolio.back.enums.AppLang;
import my.portfolio.back.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
public class AboutController {

    @Autowired
    private AboutService aboutService;

    @GetMapping("")
    public ResponseEntity<LocalizedDto> getAllAboutContents(@RequestHeader(value = "Accept-Language", defaultValue = "uz") AppLang lang) {
        LocalizedDto entity = aboutService.getFirstAboutEntity(lang);
        return ResponseEntity.ok(entity);
    }

}
