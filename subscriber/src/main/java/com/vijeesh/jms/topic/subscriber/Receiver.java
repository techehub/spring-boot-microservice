package com.vijeesh.jms.topic.subscriber;

import java.util.concurrent.CountDownLatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(Receiver.class);


  @JmsListener(destination = "${destination.topic}", subscription = "sub1")
  public void receive1(String message) {
    LOGGER.info("'subscriber1' received message='{}'", message);

  }

}