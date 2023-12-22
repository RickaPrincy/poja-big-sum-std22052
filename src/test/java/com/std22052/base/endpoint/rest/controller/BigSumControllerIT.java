package com.std22052.base.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.std22052.base.conf.FacadeIT;
import com.std22052.base.endpoint.rest.controller.health.BigSumController;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BigSumControllerIT extends FacadeIT {
  @Autowired BigSumController subject;

  @Test
  void can_do_sum_of_big_integer() {
    BigInteger a = BigInteger.valueOf(1000);
    BigInteger b = BigInteger.TWO;

    BigInteger actual = subject.add(a, b);
    BigInteger expected = BigInteger.valueOf(1002);

    assertEquals(expected, actual);
  }
}
