package com.TPK.OAuth2Security.repository;

import com.TPK.OAuth2Security.dao.UserRole;
import org.hibernate.Internal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Internal> {
}
