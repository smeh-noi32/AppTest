package org.bibaboba.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.management.relation.Role;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;
import java.util.Set;

@Entity
@Table(name = "user")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String username;

    private String password;

    @Transient
    private String confirmPassword;

    private Double wallet;

    private Set<Role> roles;

    private Date registrationData;

    private Date lastVisit;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return (Collection<? extends GrantedAuthority>) getRoles();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getConfirmPassword(){
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword = confirmPassword;
    }

    public void setWallet(Double wallet){
        this.wallet = wallet;
    }

    public Double getWallet(){
        return wallet;
    }

    public Date getRegistrationData() {
        return registrationData;
    }

    public void setRegistrationData(Date registrationData) {
        this.registrationData = registrationData;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public Set<Role> getRoles(){
        return roles;
    }

    public void setRoles(Set<Role> roles){
        this.roles = roles;
    }
}
