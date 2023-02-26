package com.sheltersolution.volunteers.controller;

import com.sheltersolution.volunteers.service.InterviewService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/interview")
public class InterviewWebController {
    private InterviewService interviewService;


}
