package com.example.demo.Controller;

import com.example.demo.User.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @description: PageController
 * @author: xxx
 * @time: 2020/3/30 14:51
 */
@Controller
public class PageController {
    @GetMapping("/{pageName}")
    public String toPage(@PathVariable String pageName){
        return pageName;
    }

}
