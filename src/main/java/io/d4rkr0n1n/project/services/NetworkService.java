package io.d4rkr0n1n.project.services;

import org.springframework.stereotype.Service;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
public class NetworkService {
  public String getIp() {
    try {
      InetAddress localHost = InetAddress.getLocalHost();
      String ipAddress = localHost.getHostAddress();
      return ipAddress;
    } catch (UnknownHostException e) {
      return "IP Unknown due to UnknownHostException";
    }
  }
}
