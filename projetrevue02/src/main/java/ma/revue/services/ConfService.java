package ma.revue.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.revue.entities.Conference;
import ma.revue.entities.ConferenceEvent;
import ma.revue.repositories.ConfRepo;

@Service
public class ConfService implements IconfService{
	
	Logger logger = Logger.getLogger("ma");
	
	@Autowired
	ConfRepo confrepo;

	@Override
	public Conference save(Conference conference) {
		// TODO Auto-generated method stub
		logger.info("entité enregistrer");
		return confrepo.save(conference);
	}

	@Override
	public List<Conference> findAll() {
		// TODO Auto-generated method stub
		return confrepo.findAll();
	}

	@Override
	public Conference findByIdConference(Long idConference) {
		// TODO Auto-generated method stub
		return confrepo.findByIdConference(idConference);
	}

	@Override
	public void delete(Conference conference) {
		confrepo.delete(conference);		
	}

	@Override
	public List<ConferenceEvent> findEventsById(Long idConference) {
		// TODO Auto-generated method stub
		return confrepo.findEventsById(idConference);
	}



}
