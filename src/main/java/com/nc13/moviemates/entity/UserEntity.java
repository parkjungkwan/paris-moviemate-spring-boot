package com.nc13.moviemates.entity;

import com.nc13.moviemates.component.model.UserModel;
import com.nc13.moviemates.enums.Provider;
import com.nc13.moviemates.enums.Role;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Builder
@Entity
@Getter
@Setter
@AllArgsConstructor
@Table (name="users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String nickname;
    private Role role;
    private String tel;
    private String gender;
    private String profileImageUrl;
    private Provider provider; //


}
