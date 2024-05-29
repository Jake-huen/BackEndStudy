package com.taeheon.controller;

import com.taeheon.service.ApplyService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouponController {

    private final ApplyService applyService;

    public CouponController(ApplyService applyService) {
        this.applyService = applyService;
    }

    @PostMapping()
    public void apply() {
        applyService.apply(1L);
    }
}
