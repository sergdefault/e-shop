package tsymbaliuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import tsymbaliuk.service.CategoryService;

@Controller
public class IndexController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("categories",categoryService.getAllCategories());
		return "index";
	}
	@RequestMapping("/index/{category_id}")
	public String products(@PathVariable int category_id) {
		System.out.println(category_id);
		return "index";
	}
}
