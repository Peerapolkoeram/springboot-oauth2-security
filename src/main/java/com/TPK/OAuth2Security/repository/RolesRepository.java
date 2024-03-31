package com.TPK.OAuth2Security.repository;

import com.TPK.OAuth2Security.dao.RolesDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<RolesDao, Long> {
}
