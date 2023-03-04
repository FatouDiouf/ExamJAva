package com.isi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CvUserEntity implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, nullable = false, length = 100)
    private String nom;

    @Column(unique = true, nullable = false, length = 100)
    private String prenom;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false, length = 100)
    private String adresse;

    @Column(unique = true, nullable = false, length = 100)
    private String email;

    @Column(unique = true)
    private String password;

    @Column(nullable = false, length = 100)
    private String telephone;

    @Column(nullable = false, length = 300)
    private String niveauEetude;

    @Column(nullable=false, length = 2500)
    private String experienceProfessionnelle;

    @Enumerated(EnumType.STRING)
    private  Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
