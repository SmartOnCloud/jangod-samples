package org.jangod.samples.forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Main application controller
 * 
 * @author igor.mihalik
 */
@Controller
public class FormsController {

    @RequestMapping("/index")
    public String form(ModelMap model, PersonForm form, Errors errors) {
	model.addAttribute("form", form);
	model.addAttribute("errors", errors);
	return "index";
    }
}