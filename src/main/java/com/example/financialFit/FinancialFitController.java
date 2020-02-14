package com.example.financialFit;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinancialFitController {

    @RequestMapping("hello")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        System.out.println("Hello");
        model.addAttribute("name", name);
        return "greeting";
    }

}