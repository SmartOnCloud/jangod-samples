package org.jangod.samples.helloworld;

import java.util.Arrays;
import java.util.HashMap;

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

    @RequestMapping("/index")
    public String index(ModelMap model,
	    @RequestParam(required = false) String name) {
	model.addAttribute("name", name);
	model.addAttribute("array", new String[] { "Item 1", "Item 2", "Item 3" });
	model.addAttribute("list", Arrays.asList(new String[] { "Item 1", "Item 2", "Item 3","Item 4" }));
	
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("key_1", "value_1");;
	map.put("key_2", "value_2");;
	map.put("key_3", "value_3");;
	model.addAttribute("map", map);
	return "index";
    }

    @RequestMapping("/form")
    public String form(ModelMap model, NameForm form) {
	model.addAttribute("form", form);
	model.addAttribute("name", form.getName());
	return "form";
    }

}