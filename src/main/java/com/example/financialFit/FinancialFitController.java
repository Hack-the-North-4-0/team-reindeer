package com.example.financialFit;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

@Controller
public class FinancialFitController {

    @RequestMapping("/app")
    public String app() {
       // model.addAttribute("name", name);
        return "app";
    }

    @RequestMapping("/aspiration")
    public String aspiration() {
        // model.addAttribute("name", name);
        return "aspiration";
    }

    @RequestMapping("/you-decide-game")
    public String youDecideGame() {
        // model.addAttribute("name", name);
        return "youDecideGame";
    }

    @RequestMapping("/you-decide-game1")
    public String youDecideGame1() {
        // model.addAttribute("name", name);
        return "youDecideGame1";
    }

    @RequestMapping("/you-decide-game2")
    public String youDecideGame2() {
        // model.addAttribute("name", name);
        return "youDecideGame2";
    }

    @RequestMapping("/you-decide-game3")
    public String youDecideGame3() {
        // model.addAttribute("name", name);
        return "youDecideGame3";
    }

    @RequestMapping("/you-decide-game4")
    public String youDecideGame4() {
        // model.addAttribute("name", name);
        return "youDecideGame4";
    }

    @RequestMapping("/you-decide-game5")
    public String youDecideGame5() {
        // model.addAttribute("name", name);
        return "youDecideGame5";
    }

}