package com.app.chapin.controllers;

import com.app.chapin.services.StorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/app")
public class StorageController {

    private final StorageService service;

    @PostMapping
    public String upload(@RequestParam("file") MultipartFile multipartFile) {
        return service.upload(multipartFile);
    }

    @PostMapping("/eliminar")
    public void eliminarCarpetas() throws IOException {
        service.eliminarCarpetas();
    }
}