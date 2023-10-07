package com.harsav360.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private Integer id;
	
	@NotEmpty
	@Size(min = 4,message = "Username must be min of 4 characters")
	private String name;
	
	@NotEmpty
	@Size(min = 4,max=10,message = "Password must be minimum of 3 chars and maximum of 10 chars")
	@Pattern(regexp = "^[a-zA-Z0-9]{6,12}$",
            message = "username must be of 6 to 12 length with no special characters")
	private String password;
	
	@Email(message = "Email address is not valid")
	private String email;
	
	@NotEmpty
	private String about;
}
