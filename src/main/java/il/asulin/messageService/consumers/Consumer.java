package il.asulin.messageService.consumers;

import org.json.JSONObject;
import org.json.XML;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import il.asulin.messageService.producers.Producer;

@Service
public class Consumer {
	
	private static final Logger logger = LoggerFactory.getLogger(Producer.class.getName());
	
	@KafkaListener(topics = "first_topic", groupId = "my-springboot-app")
	public void consume(String xml) {
		logger.info("Consume: " + xml);
		JSONObject json = XML.toJSONObject(xml);
		System.out.println("Json: " + json);
	}
	
}
