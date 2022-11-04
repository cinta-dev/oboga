package com.oboga.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotEmpty
    private String userid;

    @Column
    @NotEmpty
    private String password;

    @Column
    @NotEmpty
    private String username;

    @Column
    @NotEmpty
    private String nickname;

    @Column
    @NotEmpty
    private String email;

    @Column
    @Enumerated(EnumType.STRING)
    private UserRole role;


}