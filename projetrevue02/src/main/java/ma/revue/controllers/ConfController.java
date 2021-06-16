package ma.revue.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.revue.entities.Conference;
import ma.revue.services.ConfService;

@RestController
public class ConfController {
	
	@Autowired
	ConfService confservice;
	
	
	public ConfController() {
		System.out.println("true0");
	}

	@RequestMapping("/")
	public String homepage() {
		return "home";
	}
	
	@GetMapping("/conferences")
    public List<Conference> getallConfs() {
		System.out.println("true");
		return confservice.findAll();
	}
	
	@GetMapping("/conferences/{id}")
	public Conference getConfId(@PathVariable("id") Long id) {
		return confservice.findByIdConference(id);
		
	}
	
	@PostMapping(value="/addconf")
	public Conference addConf(@RequestBody Conference conference)
	{
		return confservice.save(conference);
	}
	
	@PutMapping("/conferences/{id}")
	public String update(@PathVariable("id") Long id,@RequestBody Conference conference) {
		Conference confrest= confservice.findByIdConference(id);
		confrest.setSubject(conference.getSubject());
		confrest.setTitle(conference.getTitle());
		confservice.save(confrest);
		return confrest.getTitle();
	}
	
	@DeleteMapping("/conferences/{id}")
	public String delete(@PathVariable("id") Long id)
	{
		Conference confrest= confservice.findByIdConference(id);
		confservice.delete(confrest);
		return "delete";
	}
	
}
