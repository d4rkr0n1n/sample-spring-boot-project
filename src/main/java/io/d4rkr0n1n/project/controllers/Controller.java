package io.d4rkr0n1n.project.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.d4rkr0n1n.project.services.NetworkService;

@RestController
public class Controller {

  private NetworkService networkService;

  @Value("${spring.profiles.active:}")
  private String activeProfile;

  Controller(NetworkService networkService) {
    this.networkService = networkService;
  }

  @GetMapping("/ip")
  public String getIp() {
    return networkService.getIp();
  }

  @GetMapping("/env")
  public String getEnv() {
    return activeProfile;
  }

}
