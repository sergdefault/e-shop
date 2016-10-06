package tsymbaliuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tsymbaliuk.service.CategoryService;
import tsymbaliuk.service.ProductService;

/**
 * Created by Tsymbaliuk Serhii on 06.10.2016.
 */
@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "category/{category_id}" , method= RequestMethod.GET )
    public String products(@PathVariable(value="category_id") int id, Model model) {
        model.addAttribute("categories",categoryService.getAllCategories());
        model.addAttribute("products",productService.getAllproductByCategoryId(id));
        return "products";
    }
}
