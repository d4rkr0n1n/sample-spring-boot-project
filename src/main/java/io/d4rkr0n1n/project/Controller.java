package io.d4rkr0n1n.project;

import org.springframework.web.bind.annotation.RestController;

import io.d4rkr0n1n.project.services.NetworkService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {

  private NetworkService networkService;

  Controller(NetworkService networkService) {
    this.networkService = networkService;
  }

  @GetMapping("/ip")
  public String getIp() {
    return networkService.getIp();
  }

}
