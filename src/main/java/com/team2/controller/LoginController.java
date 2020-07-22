package com.team2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * LoginController
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */
@RestController
public class LoginController {

    @GetMapping(value = "/")
    public ModelAndView firstView()
    {
        ModelAndView mav = new ModelAndView("login");
        // must match the jsp page name which is being requested.
        mav.addObject("login", "GeeksForGeeks Welcomes you to Spring!");
        return mav;
    }

}
