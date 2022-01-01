package com.ayhanunal.keywordsmobilebackend.models.repositories;

import com.ayhanunal.keywordsmobilebackend.models.entity.Word;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KeywordRepository extends CrudRepository<Word, Integer> {

    @Query(value = "SELECT * FROM words", nativeQuery = true)
    List<Word> getAllWords();

}
