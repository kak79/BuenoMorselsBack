package com.social.BuenoMorsels.Repository;

import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.social.BuenoMorsels.Beans.Role;


@Repository
@Table(name="user_role")
public interface RoleRepo extends JpaRepository<Role, Integer>{

}
