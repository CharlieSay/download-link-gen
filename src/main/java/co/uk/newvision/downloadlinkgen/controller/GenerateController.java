package co.uk.newvision.downloadlinkgen.controller;

import co.uk.newvision.downloadlinkgen.service.GenerationService;
import co.uk.newvision.downloadlinkgen.service.VerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerateController {

    private final GenerationService generationService;
    private final VerifyService verifyService;

    @Autowired
    public GenerateController(GenerationService generationService, VerifyService verifyService) {
        this.generationService = generationService;
        this.verifyService = verifyService;
    }

    @GetMapping(path = "/")
    public ResponseEntity<>
}
