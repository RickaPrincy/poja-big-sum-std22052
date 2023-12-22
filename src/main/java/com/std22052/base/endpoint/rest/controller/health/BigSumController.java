package com.std22052.base.endpoint.rest.controller.health;

import java.math.BigInteger;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BigSumController {

  @GetMapping("/big-sum")
  public BigInteger add(@RequestParam BigInteger a, @RequestParam BigInteger b) {
    return a.add(b);
  }
}
