package com.tp4.tp4.repository;

import com.tp4.tp4.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("Select so, COUNT(so) as c FROM User GROUP BY(so) ORDER BY c DESC")
    List<?> soMostUsed();

    @Query("Select browser, COUNT(browser) as c FROM User GROUP BY(browser) ORDER BY c DESC")
    List<?> browserMostUsed();

    @Query("SELECT so,browser, COUNT(id) as cantidad FROM User GROUP BY browser,so ORDER BY cantidad DESC")
    List<?> groupMostUsed();

}
