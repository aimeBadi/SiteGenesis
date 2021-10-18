package tech.genesis.digitManager.ripo;

import java.util.Optional;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import tech.genesis.digitManager.model.Contact;

public interface ContactRipo extends JpaRepositoryImplementation<Contact, Long>{

	void deleteContactById(Long id);

	Optional<Contact> findContactById(Long id);

}
