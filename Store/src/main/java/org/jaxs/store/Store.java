package org.jaxs.store;

import javax.websocket.server.PathParam;

import org.jaxs.model.Devices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Store {
	private Devices result;
	private ModelAndView modelAndView;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/{brandName}")
	public ModelAndView samsung(@PathVariable("brandName") String brandName) {
		modelAndView = new ModelAndView("viewDevices");
		
		switch (brandName.toLowerCase()) {
		case "samsung":
			result = restTemplate.getForObject("http://SAMSUNG/samsung/devices", Devices.class);
			System.out.println(result);
//			modelAndView.addObject("devices",result);
			modelAndView.addObject("devices", result);
			return modelAndView;
		
		case "apple":	
			result = restTemplate.getForObject("http://Apple/apple/devices", Devices.class);
			System.out.println(result);
			modelAndView = new ModelAndView("viewDevices", "devices", result);
			return modelAndView;
			
		default:
			return new ModelAndView("redirect: /error");
		}
	}
		
//		RestTemplate restTemplate = new RestTemplate();
//		Devices result = restTemplate.getForObject("http://localhost:8082/samsung/devices", Devices.class);
////		modelAndView.addObject("devices",result);
//		ModelAndView modelAndView = new ModelAndView("samsung", "devices", result);
//		return modelAndView;
//	}
//	
//	@RequestMapping("/apple")
//	public ModelAndView apple() {
//		RestTemplate restTemplate = new RestTemplate();
//		Devices result = restTemplate.getForObject("http://localhost:8083/apple/devices", Devices.class);
//		ModelAndView modelAndView = new ModelAndView("apple", "devices", result);
//		return modelAndView;
//	}
	

}
