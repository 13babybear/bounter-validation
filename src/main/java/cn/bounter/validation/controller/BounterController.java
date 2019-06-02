package cn.bounter.validation.controller;

import cn.bounter.validation.common.ResponseData;
import cn.bounter.validation.entity.Bounter;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bounter")
public class BounterController {

    @PostMapping
    public ResponseData<?> post(@Validated Bounter bounter) {
        return ResponseData.ok(bounter);
    }

    @PostMapping("/json")
    public ResponseData<?> postJson(@Validated @RequestBody Bounter bounter) {
        return ResponseData.ok(bounter);
    }

    @GetMapping
    public ResponseData<?> get(@Validated Bounter bounter) {
        return ResponseData.ok(bounter);
    }

}
