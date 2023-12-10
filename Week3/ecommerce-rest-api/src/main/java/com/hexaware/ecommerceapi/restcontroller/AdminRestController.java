package com.hexaware.ecommerceapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;*/
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.ecommerceapi.dto.AdminDTO;
import com.hexaware.ecommerceapi.dto.AuthRequest;
import com.hexaware.ecommerceapi.entities.Admin;
import com.hexaware.ecommerceapi.service.IAdminService;
import com.hexaware.ecommerceapi.service.JwtService;

@RestController
@RequestMapping("/api/admin")
public class AdminRestController {


	@Autowired
	private IAdminService service;

	@Autowired
	private JwtService jwtService;

	@Autowired
	AuthenticationManager authenticationManager;

	@PostMapping("/add")
	public Admin createAdmin(@RequestBody AdminDTO adminDTO) {
		return service.createAdmin(adminDTO);
	}

	@PutMapping("/update")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
	public Admin updateAdmin(@RequestBody AdminDTO adminDTO) {
		return service.updateAdmin(adminDTO);
	}

	@DeleteMapping("/delete/{adminId}")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
	public void deleteById(@PathVariable int adminId)
	{
		service.deleteAdmin(adminId);
	}

	@GetMapping("/get/{adminId}")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
	public AdminDTO getAdminById(@PathVariable int adminId) {
		return service.getAdminById(adminId);
	}
	@GetMapping("/getall")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
	public List<Admin> getAllAdmins(){
		return service.getAllAdmins();
	}

	@PostMapping("/authenticate")
	public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {

		Authentication authenticate = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

		String token = null;

		if (authenticate.isAuthenticated()) {

			token = jwtService.generateToken(authRequest.getUsername());

		}

		else {

			throw  new UsernameNotFoundException("Invalid Username or Password / Invalid request");
		}

		return token;
}
}

