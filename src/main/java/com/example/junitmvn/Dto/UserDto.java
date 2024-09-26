package com.example.junitmvn.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserDto {
	
	private String userId;
	private String password;
	private String userName;
	private String age;
	
}
