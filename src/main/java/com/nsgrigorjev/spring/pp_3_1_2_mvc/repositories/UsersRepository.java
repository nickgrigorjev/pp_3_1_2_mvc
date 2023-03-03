package com.nsgrigorjev.spring.pp_3_1_2_mvc.repositories;

import com.nsgrigorjev.spring.pp_3_1_2_mvc.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}
