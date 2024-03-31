package com.TPK.OAuth2Security.repository;

import com.TPK.OAuth2Security.dao.UsersDao;
import org.hibernate.Internal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UsersDao, Internal> {
}
