package org.hugodiaz;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "hugodiaz",
            groupId = "foo"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data.toString() + " 🎉");
    }
}
