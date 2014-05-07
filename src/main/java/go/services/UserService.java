package go.services;

import go.actions.entitys.User;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

	public boolean loginCheck(User user){
		return true;
	}
	
}
