package io.dev.deneb.listener;

import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PostListener {

  @SqsListener(value = "${sqs.queue.post}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
  public void listen(@Payload String in) {
    log.info("post queue - listen : {}", in);

  }

}
