package ggingmin.springsecurity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter @ToString
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private String role;

}
