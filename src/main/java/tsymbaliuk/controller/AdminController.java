package tsymbaliuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tsymbaliuk Serhii on 07.10.2016.
 */
@Controller
public class AdminController {

    @RequestMapping("/admin")
    public String showAdminPanel(){
        return "/admin/admin_panel";
    }
}
