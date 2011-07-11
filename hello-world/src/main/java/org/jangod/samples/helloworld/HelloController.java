package org.jangod.samples.helloworld;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Main application controller
 * 
 * @author igor.mihalik
 */
@Controller
public class HelloController {
    @Autowired
    ApplicationContext ctx;

    @RequestMapping("/index")
    public String index(ModelMap model) {
	model.addAttribute("array",
		new String[] { "Item 1", "Item 2", "Item 3" });
	model.addAttribute("list", asList(new String[] { "Item 1", "Item 2",
		"Item 3", "Item 4" }));

	HashMap<String, String> map = new HashMap<String, String>();
	map.put("key_1", "value_1");
	map.put("key_2", "value_2");
	map.put("key_3", "value_3");
	model.addAttribute("map", map);
	model.addAttribute("properties", System.getProperties());
	model.addAttribute("ctx", ctx);
	return "index";
    }

    @RequestMapping("/form")
    public String form(ModelMap model, NameForm form) {
	model.addAttribute("form", form);
	model.addAttribute("name", form.getName());
	return "form";
    }

    @RequestMapping("/main")
    public String main(ModelMap model) {
	ArrayList<CoffeArticle> topics = new ArrayList<CoffeArticle>();
	topics.add(new CoffeArticle(
		"http://farm5.static.flickr.com/4106/4970728784_8a847ba99f.jpg",
		"All About Beans",
		"Coffee is a brewed beverage prepared from the roasted seeds of the coffee plant, colloquially called coffee beans. The beans are found in coffee cherries, which grow on trees cultivated in over 70 countries, primarily in equatorial Latin America."));
	topics.add(new CoffeArticle(
		"http://farm5.static.flickr.com/4106/4970728784_8a847ba99f.jpg",
		"Coffee 101",
		"Proin metus odio, ultricies eu pharetra dictum, laoreet id odio. Curabitur in odio augue. Morbi congue auctor interdum. Phasellus sit amet metus justo. "));
	model.addAttribute("topics", topics);
	model.addAttribute("tip", UUID.randomUUID().toString());
	return "main";
    }
}