package springdemo;

import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")

    public String allUppercaseMessage(HttpServletRequest request, Model model) {

        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();

        String result = "Yo! " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName,
                                          Model model) {

        theName = theName.toUpperCase();

        String result = "Hey My Friend from v3! " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

}
