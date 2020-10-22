
package com.starBazzar.rest.logging;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.starBazzar.rest.model.Dto.Users;
import com.starBazzar.rest.repository.UserRepository;

@Service
public class CustomAuthenticationService implements AuthenticationProvider {

	@Autowired
	private UserRepository userRepository;

	private Collection<GrantedAuthority> getgrantedAuthorities(Users user) {
		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
		if (user.getUsername().equals("admin")) {
			grantedAuthorities.add(new SimpleGrantedAuthority("Role_ADMIN"));
		}
		grantedAuthorities.add(new SimpleGrantedAuthority("Role_USER"));
		return grantedAuthorities;
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		UsernamePasswordAuthenticationToken authenticationToken = null;

		String username = authentication.getName();
		String password = authentication.getCredentials().toString();

		Users user = userRepository.findByUsername(username);

		if (user != null) {
			if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
				Collection<GrantedAuthority> grantedAuthorities = getgrantedAuthorities(user);

				authenticationToken = new UsernamePasswordAuthenticationToken(
						new org.springframework.security.core.userdetails.User
						(username, password, true, true, true,
								true, grantedAuthorities), grantedAuthorities);
			}
		} else {
			throw new UsernameNotFoundException("User name" + username + "not Found");

		}

		return authenticationToken;
	}

	@Override
	public boolean supports(Class<?> authentication) {

		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
