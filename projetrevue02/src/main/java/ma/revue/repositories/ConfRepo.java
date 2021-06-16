package ma.revue.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ma.revue.entities.Conference;
import ma.revue.entities.ConferenceEvent;


//@Repository
public interface ConfRepo extends JpaRepository<Conference, Long>{
	
	Conference save(Conference conference);
	List<Conference> findAll();
	Conference findByIdConference(Long idConference);
	void delete(Conference conference);
	@Query("select ev from ConferenceEvent ev where ev.conference.idConference =:idConference")
	List<ConferenceEvent> findEventsById(@Param("idConference")Long idConference);
	

}
