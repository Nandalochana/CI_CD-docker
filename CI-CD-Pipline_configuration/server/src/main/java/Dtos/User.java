package Dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
public class User {

    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int userStatus;


}
