package com.work.springboot;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@ComponentScan
public class KafkaTopicConfig {
    public NewTopic topic(){
        return TopicBuilder.name("wikimedia_recentchange")
                .build();
    }
}
