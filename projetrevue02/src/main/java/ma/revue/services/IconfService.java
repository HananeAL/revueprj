package ma.revue.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ma.revue.entities.Conference;
import ma.revue.entities.ConferenceEvent;

public interface IconfService {
	
	Conference save(Conference conference);
	List<Conference> findAll();
	Conference findByIdConference(Long idConference);
	void delete(Conference conference);
	List<ConferenceEvent> findEventsById(Long idConference);
//	void update(Conference conference);


}
