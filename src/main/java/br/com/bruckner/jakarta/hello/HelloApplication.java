package br.com.bruckner.jakarta.hello;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("rest")
public class HelloApplication extends Application {
  // Needed to enable Jakarta REST and specify path.    
}
