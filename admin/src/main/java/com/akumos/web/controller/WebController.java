package com.akumos.web.controller;

import com.akumos.model.ConfigServerModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin
@Controller
public class WebController {

    //@Value("${spring.application.name}")
    String appName;

    @GetMapping("/hystrix")
    public String hystrixPage(Model model) {
        model.addAttribute("appName", appName);
        return "hystrix";
    }

    @GetMapping("/config")
    public String configDashboard(Model model) {
        var config = new ConfigServerModel();
        config.setName("testeConfigServer");
        model.addAttribute("configServerModel", config);
        return "configDashboard";
    }

    @GetMapping("/hystrixThreadPool")
    public String hystrixThreadPoolPage(Model model) {
        model.addAttribute("appName", appName);
        return "hystrixThreadPool.html";
    }

    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("appName", appName);
        return "index.html";
    }


    @GetMapping("/hystrixThreadPoolContainer")
    public String hystrixThreadPoolContainerPage(Model model) {
        model.addAttribute("appName", appName);
        return "hystrixThreadPoolContainer.html";
    }

    @GetMapping("/monitor")
    public String monitorPage(Model model) {
        return "monitor";
    }
}
