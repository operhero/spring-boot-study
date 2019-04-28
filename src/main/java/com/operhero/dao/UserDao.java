package com.operhero.dao;

import com.operhero.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper
public interface UserDao extends JpaRepository<User, Long> {
    User findByName(String Name);
}
