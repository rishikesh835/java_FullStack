package com.learning.question_service.dao;



import com.learning.question_service.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {


    @Query(
            value = "SELECT q.id FROM question q " +
                    "WHERE q.category = ?1 " +
                    "ORDER BY RAND() " +
                    "LIMIT ?2",
            nativeQuery = true
    )
    List<Integer> findRandomQuestionsByCategory(String category, int numQ);

     List<Question> findByQuestionTitle(String questionTitle);


    List<Question> findByCategory(String category);
}
