package tsymbaliuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tsymbaliuk.service.CategoryService;
import tsymbaliuk.service.ProductService;

/**
 * Created by Tsymbaliuk Serhii on 07.10.2016.
 */
@Controller
public class AdminController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @RequestMapping("/admin")
    public String showAdminPanel(){
        return "admin_panel";
    }

    @RequestMapping("/admin/category")
    public String showCategoryPanel(Model model){
        model.addAttribute("categories", categoryService.getAllCategories());
        return "admin_category";
    }

    @RequestMapping("/admin/category/{id}")
    public String showProductByCategory(@PathVariable("id") int id, Model model){
        model.addAttribute("products", productService.getAllproductByCategoryId(id));
        return "admin_products";
    }
}
