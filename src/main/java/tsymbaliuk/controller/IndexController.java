package tsymbaliuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import tsymbaliuk.dao.daoImpl.CategoryDaoImpl;
import tsymbaliuk.model.Category;

import java.util.ArrayList;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("categories",new CategoryDaoImpl().getAllCategories());
		return "index";
	}
	@RequestMapping("/index/{category_id}")
	public String products(@PathVariable int category_id) {
		System.out.println(category_id);
		return "index";
	}
}
