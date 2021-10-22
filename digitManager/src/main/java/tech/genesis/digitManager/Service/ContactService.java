package tech.genesis.digitManager.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.genesis.digitManager.exception.UserNotFoundException;
import tech.genesis.digitManager.model.Contact;
import tech.genesis.digitManager.ripo.ContactRipo;

@Service 
public class ContactService {
   private final ContactRipo contactRipo;
   
   @Autowired
   public ContactService(ContactRipo contactRipo) {
	   this.contactRipo = contactRipo;
   }
   
   public Contact addContact(Contact contact) {
	   contact.setId(contact.getId());
	   return contactRipo.save(contact);
   }
    public List<Contact>findAllContact(){
    	return contactRipo.findAll();
    }
    public Contact updateContact(Contact contact) {
    	return contactRipo.save(contact);
    }
    public Contact findContactById(Long id) {
    	return contactRipo.findContactById(id)
    			.orElseThrow(() -> new UserNotFoundException("User by id"+ id + "was not found"));
    }
    
    public void deleteContact(Long id) {
    	contactRipo.deleteContactById(id);
    }
}
