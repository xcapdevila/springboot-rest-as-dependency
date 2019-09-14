package io.capdevila.poc.springboot.rest.as.dependency.controller;

import io.capdevila.poc.springboot.rest.as.dependency.service.DemoService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xavier Capdevila Estevez on 2019-09-14.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

  private final DemoService demoService;

  public DemoController(
      DemoService demoService) {
    this.demoService = demoService;
  }

  @GetMapping(value = "/welcome", produces = MediaType.APPLICATION_JSON_VALUE)
  public @ResponseBody String welcome(@RequestParam("name") String name) {
    return demoService.welcome(name);
  }

  @GetMapping(value = "/goodbye", produces = MediaType.APPLICATION_JSON_VALUE)
  public @ResponseBody String goodbye(@RequestParam("name") String name) {
    return demoService.goodbye(name);
  }

}
