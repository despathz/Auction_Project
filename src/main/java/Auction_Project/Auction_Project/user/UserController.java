/**
 * 
 */
package Auction_Project.Auction_Project.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DimJo
 *
 */
@RestController
public class UserController {
	
	@RequestMapping("/user")
	public User getUser() {
		User user = new User();
		user.setUsername("dimtiris");
		return user;
	}

}
