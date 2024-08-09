package org.bibaboba.entity;

import javax.persistence.*;
import java.util.UUID;
import org.springframework.data.annotation.Transient;
import java.util.Set;

@Entity
public class Role{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID uuid;
    private String name;
    @Transient
    @ManyToMany(mappedBy = "roles")
    private Set<Profile> profiles;

    public Role() {};

    public UUID getId() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Profile> getUsers() {
        return profiles;
    }

    public void setUsers(Set<Profile> profiles) {
        this.profiles = profiles;
    }

    public Role(UUID uuid){
        this.uuid = uuid;
    }
    public Role(UUID uuid, String name){
        this.uuid = uuid;
        this.name = name;
    }
}
