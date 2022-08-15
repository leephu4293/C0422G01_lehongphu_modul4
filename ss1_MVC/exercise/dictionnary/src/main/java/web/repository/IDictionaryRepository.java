package web.repository;

import org.springframework.stereotype.Service;


public interface IDictionaryRepository {
    String findWord(String word);
}
