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
 * Created by Tsymbaliuk Serhii on 30.09.2016.
 */
@Controller
public class ProductController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;


    @RequestMapping(value = "product/{product_id}" , method= RequestMethod.GET)
    public String product(@PathVariable ("product_id") int productId, Model model) {
        model.addAttribute("product",productService.getProductByProductId(productId));
        model.addAttribute("categories",categoryService.getAllCategories());
        return "product_details";
    }
}
