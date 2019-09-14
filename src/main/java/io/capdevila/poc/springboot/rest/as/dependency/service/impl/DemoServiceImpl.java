package io.capdevila.poc.springboot.rest.as.dependency.service.impl;

import io.capdevila.poc.springboot.rest.as.dependency.service.DemoService;
import io.capdevila.poc.springboot.rest.as.dependency.service.DemoUserService;
import org.springframework.stereotype.Service;

/**
 * @author Xavier Capdevila Estevez on 2019-09-14.
 */
@Service
public class DemoServiceImpl implements DemoService {

  private final DemoUserService demoUserService;

  public DemoServiceImpl(DemoUserService demoUserService) {
    this.demoUserService = demoUserService;
  }

  @Override
  public String welcome(String name) {
    return demoUserService.sayHi(name);
  }

  @Override
  public String goodbye(String name) {
    return demoUserService.sayBye(name);
  }
}
