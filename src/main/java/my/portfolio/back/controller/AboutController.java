package my.portfolio.back.controller;


import my.portfolio.back.dtos.LocalizedDto;
import my.portfolio.back.entity.AboutEntity;
import my.portfolio.back.enums.AppLang;
import my.portfolio.back.enums.JobTypes;
import my.portfolio.back.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/about")
public class AboutController {

    @Autowired
    private AboutService aboutService;

    @GetMapping("/type={type}")
    public ResponseEntity<LocalizedDto> getAllAboutContents(@RequestHeader(value = "Accept-Language", defaultValue = "uz") AppLang lang, @PathVariable(name = "type") JobTypes type) {
        LocalizedDto entity = aboutService.getFirstAboutEntity(lang, type);
        return ResponseEntity.ok(entity);
    }

}
