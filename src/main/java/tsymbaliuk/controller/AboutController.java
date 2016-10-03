package tsymbaliuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tsymbaliuk.service.ProductService;

/**
 * Created by Tsymbaliuk Serhii on 30.09.2016.
 */
@Controller
public class AboutController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/about")
    public String index(Model model) {
        //productService.SayHello();
        return "about";
    }
}
