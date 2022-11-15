package com.javatpoint.server.main.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	public static int userCount = 6;

	public static List<User> users = new ArrayList<>();

	static {
		// Adding users to the list
		users.add(new User(1, "Aswin", new Date()));
		users.add(new User(2, "Raza", new Date()));
		users.add(new User(3, "Sudhir", new Date()));
		users.add(new User(4, "Jolly", new Date()));
		users.add(new User(5, "Roop", new Date()));
	}

	// method that retrieve all users from the list
	public List<User> findAll() {
		return users;
	}

	// method that add the user in the list
	public User save(User user) {
		if (user.getId() == null) 
		{
			user.setId(++userCount);
		}

		users.add(user);
		return user;
	}

	// method that find a particular user from the list
	public User findOne(int id) {
		for (User user : users) {
			if (user.getId() == id)
				return user;
		}
		return null;
	}
	
	
}
