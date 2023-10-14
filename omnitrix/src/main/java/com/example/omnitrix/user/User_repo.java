package com.example.omnitrix.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface User_repo extends JpaRepository<User_data, Long> {
	 User_data findByEmail(String email);
	    
	    
	    @Query(value="select * from user where email=?1 and password=?2",nativeQuery=true)
	    public User_data loginvalidation(String email,String password);

}
