package com.tech_talent.group_spents.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech_talent.group_spents.entity.User;
import com.tech_talent.group_spents.utils.ConstsValues;

import java.util.Optional;

/**
 * This interface serves as a repository for managing {@link User} entities in
 * the database. It extends JpaRepository, providing CRUD operations for the
 * {@link User} entity with Integer as the type of its primary key.
 */
@Repository(value = ConstsValues.ConstsDAO.USER_DAO_KEY)
public interface IUserRepository extends JpaRepository<User, Integer> {
	Optional<User> findUserByEmail(String email);
}
