package il.asulin.messageService.producers;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	private static final Logger logger = LoggerFactory.getLogger(Producer.class.getName());
    private static final String TOPIC = "first_topic";
    
    @Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

    
    public void sendMessage(String msg) {
    	logger.info("Produce: " + msg);
    	kafkaTemplate.send(TOPIC,msg);
    }
}
