package ma.projet.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/logout")
    public String logout() {
        // Clear the authentication context
        SecurityContextHolder.clearContext();
        return "redirect:/login?logout"; // Redirect to the login page with a logout parameter
    }
}

