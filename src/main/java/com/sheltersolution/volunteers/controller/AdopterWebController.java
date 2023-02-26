package com.sheltersolution.volunteers.controller;

import com.sheltersolution.volunteers.service.AdopterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/adopter")
public class AdopterWebController {
    private AdopterService adopterService;


}
