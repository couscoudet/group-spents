package com.tech_talent.group_spents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tech_talent.group_spents.dao.IUserRepository;
import com.tech_talent.group_spents.entity.User;
import com.tech_talent.group_spents.utils.ConstsValues;

import jakarta.annotation.Resource;

@SpringBootApplication
public class GroupSpentsApplication {


	public static void main(String[] args) {
		SpringApplication.run(GroupSpentsApplication.class, args);
	}

}
