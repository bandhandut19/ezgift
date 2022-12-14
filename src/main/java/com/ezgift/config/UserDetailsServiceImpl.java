package com.ezgift.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ezgift.model.Customer;
import com.ezgift.model.User;
import com.ezgift.overallrepo.CustomerRepository;
import com.ezgift.overallrepo.UserRepository;


public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user =userRepository.getUserByEmail(email);
		if(user==null) {
			user = userRepository.findByEmail(email);
			if(user==null)
				throw new UsernameNotFoundException("could not find user");
		}
		CustomUserDetails customUserDetails = new CustomUserDetails(user);
		return customUserDetails;
	}


}