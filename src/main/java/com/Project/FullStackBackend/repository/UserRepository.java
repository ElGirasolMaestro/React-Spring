package com.Project.FullStackBackend.repository;

import com.Project.FullStackBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
