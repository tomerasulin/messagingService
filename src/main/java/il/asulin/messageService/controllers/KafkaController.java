package il.asulin.messageService.controllers;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import il.asulin.messageService.services.KafkaService;

@RestController
@RequestMapping(value = "/messageService")
public class KafkaController {

	@Autowired
	private KafkaService service;
	
	@PostMapping("send")
	public void getJsonObject(@RequestBody String jsonString){
		JSONObject json = new JSONObject(jsonString);
		service.convertJsonToXML(json);
	}
	
	
}
