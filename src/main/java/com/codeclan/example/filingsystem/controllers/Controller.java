package com.codeclan.example.filingsystem.controllers;

import com.codeclan.example.filingsystem.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/files")
public class Controller {
    @Autowired
    FileRepository fileRepository;
}


