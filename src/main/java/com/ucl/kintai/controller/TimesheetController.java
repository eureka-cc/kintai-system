package com.ucl.kintai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.ucl.kintai.service.TimesheetService;

@Controller
public class TimesheetController {
    private final TimesheetService timesheetService;

    public TimesheetController(TimesheetService timesheetService) {
        this.timesheetService = timesheetService;
    }

    @GetMapping("/timesheets")
    public String index(Model model) {

        model.addAttribute("timesheets", timesheetService.findAll());
        return "timesheets/index";
    }
    
}    
