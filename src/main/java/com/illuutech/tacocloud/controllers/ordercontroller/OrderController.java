package com.illuutech.tacocloud.controllers.ordercontroller;

import com.illuutech.tacocloud.domains.entities.TacoOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/orders")
@Slf4j
@SessionAttributes("tacoOrder")
public class OrderController {
    @GetMapping("/current")
    public String orderForm() {
        return "orderForm";
    }
    @PostMapping
    public String processOrder(TacoOrder tacoOrder, Errors errors, SessionStatus sessionStatus){
        if (errors.hasErrors()) {
            return "orderForm";
        }
        log.info("order submitted {}",tacoOrder);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
