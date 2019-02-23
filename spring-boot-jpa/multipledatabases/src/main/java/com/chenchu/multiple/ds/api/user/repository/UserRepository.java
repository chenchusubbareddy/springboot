package com.chenchu.multiple.ds.api.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chenchu.multiple.ds.api.model.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
