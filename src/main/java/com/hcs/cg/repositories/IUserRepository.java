package com.hcs.cg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcs.cg.entity.TestResult;
import com.hcs.cg.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer>{

}
