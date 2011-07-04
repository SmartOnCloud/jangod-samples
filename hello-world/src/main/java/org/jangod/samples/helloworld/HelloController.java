package org.jangod.samples.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Main application controller
 * 
 * @author igor.mihalik
 */
@Controller
public class HelloController {
    
    @RequestMapping(value = { "/index", "" })
    public String index(ModelMap model,
	    @RequestParam(required = false) String name) {
	model.addAttribute("name", name);
	return "index";
    }

    @RequestMapping("/form")
    public String form(ModelMap model, NameForm form) {
	model.addAttribute("form", form);
	model.addAttribute("name", form.getName());
	return "form";
    }

}