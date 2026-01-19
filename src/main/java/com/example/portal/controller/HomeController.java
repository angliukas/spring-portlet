package com.example.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  private static final String DEFAULT_PORTLET = "sample-portlet";

  @GetMapping("/")
  public String home(@RequestParam(value = "portlet", required = false) String portletName,
                     Model model) {
    String resolvedPortlet = (portletName == null || portletName.trim().isEmpty())
        ? DEFAULT_PORTLET
        : portletName.trim();
    model.addAttribute("portletName", resolvedPortlet);
    return "home";
  }
}
