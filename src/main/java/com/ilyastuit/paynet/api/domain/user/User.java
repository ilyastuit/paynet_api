package com.ilyastuit.paynet.api.domain.user;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    public User() {}

    public User(
            Long id,
            String email,
            String password,
            UserStatus status,
            String initToken) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.status = status;
        this.initToken = initToken;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    private String passwordResetToken;

    private String initToken;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String getPasswordResetToken() {
        return passwordResetToken;
    }

    public void setPasswordResetToken(String passwordResetToken) {
        this.passwordResetToken = passwordResetToken;
    }

    public String getInitToken() {
        return initToken;
    }

    public void setInitToken(String initToken) {
        this.initToken = initToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!Objects.equals(id, user.id)) return false;
        if (!Objects.equals(email, user.email)) return false;
        if (!Objects.equals(password, user.password)) return false;
        if (user.status != status) return false;
        if (!Objects.equals(passwordResetToken, user.passwordResetToken))
            return false;
        return Objects.equals(initToken, user.initToken);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (passwordResetToken != null ? passwordResetToken.hashCode() : 0);
        result = 31 * result + (initToken != null ? initToken.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", passwordResetToken='" + passwordResetToken + '\'' +
                ", initToken='" + initToken + '\'' +
                '}';
    }
}
