package com.hexaware.ecommerceapi.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.hexaware.ecommerceapi.entities.Admin;
import com.hexaware.ecommerceapi.repository.AdminRepository;
import com.hexaware.ecommerceapi.repository.CustomerRepository;
import com.hexaware.ecommerceapi.repository.SellerRepository;

@Component
public class AdminInfoAdminDetailsService implements UserDetailsService{

	@Autowired
	private AdminRepository adminRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private SellerRepository sellerRepository;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Admin> adminInfo = adminRepository.findByadminUserName(username);
		if (adminInfo.isPresent()) {
            return adminInfo.map(AdminInfoAdminDetails::new)
                    .orElseThrow(() -> new UsernameNotFoundException("Admin not found: " + username));
        }
		throw new UsernameNotFoundException("Customer, Admin, or Seller not found for username: " + username);
	}

}
