package tsymbaliuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
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

}
