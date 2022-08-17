package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.repository.IDictionaryRepository;
@Service
public class DictionaryService implements IDictonaryService{

     @Autowired
     private  IDictionaryRepository iDictionaryRepository;
     public String findWord(String word) {
        return this.iDictionaryRepository.findWord(word);
    }
}
