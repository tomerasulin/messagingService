package il.asulin.messageService.services;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import il.asulin.messageService.producers.Producer;

@Service
public class KafkaService {

	@Autowired
	private Producer producer;
	
	public void convertJsonToXML(JSONObject json) {
		String xml = XML.toString(json);
		producer.sendMessage(xml);
	}
}
