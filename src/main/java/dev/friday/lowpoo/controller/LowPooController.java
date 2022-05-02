package dev.friday.lowpoo.controller;

import dev.friday.lowpoo.service.LowPooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LowPooController {
    @Autowired
    private LowPooService lowPooService;

    @GetMapping("/lowpoo/{itens}")
    public ResponseEntity<?> lowPoo(@PathVariable String[] itens) {
        return lowPooService.checkLowPoo(itens);
    }
}
