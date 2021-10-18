package tech.genesis.digitManager;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.genesis.digitManager.Service.ContactService;
import tech.genesis.digitManager.model.Contact;

@RestController
@RequestMapping("/contact")
public class ContactRessource {
  private final ContactService contactService;
  
  public ContactRessource(ContactService contactService) {
	  this.contactService = contactService;
  }
  
  @GetMapping("/all")
  public ResponseEntity<List<Contact>> getAllContact(){
	List<Contact> contact = contactService.findAllContact();
	return new ResponseEntity<>(contact, HttpStatus.OK );
  }
  
  @GetMapping("/find/{id}")
  public ResponseEntity<Contact> getContactById(@PathVariable("id") Long id){
	Contact contact = contactService.findContactById(id);
	return new ResponseEntity<>(contact, HttpStatus.OK );
  }
  
  @PostMapping("/add")
  public ResponseEntity<Contact> addContact(@RequestBody Contact contact){
	  Contact newContact = contactService.addContact(contact);
	  return new ResponseEntity<>(newContact, HttpStatus.CREATED);
  }
  
  @PutMapping("/update")
  public ResponseEntity<Contact> updateContact(@RequestBody Contact contact){
	  Contact updateContact = contactService.updateContact(contact);
	  return new ResponseEntity<>(updateContact, HttpStatus.OK);
  }
  
  @DeleteMapping("/delete/{id}")
  public ResponseEntity<?> deleteContact(@PathVariable("id") Long id){
	   contactService.deleteContact(id);
	  return new ResponseEntity<>(HttpStatus.OK);
  }
}
