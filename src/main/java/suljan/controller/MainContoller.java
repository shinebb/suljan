package suljan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/*")
public class MainContoller {

    @GetMapping("/")
    public ModelAndView main (HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/main/index");
        return mav;
    }

}
