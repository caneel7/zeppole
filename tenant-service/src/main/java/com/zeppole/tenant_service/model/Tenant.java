package com.zeppole.tenant_service.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "tenants")
@Getter
@Setter
@Builder
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "email",unique = true,nullable = false)
    private String email;

    @Column(name = "country")
    private String country;

    @Column(name = "verified")
    @Builder.Default
    private boolean Verified = false;

    @Column(name = "active")
    @Builder.Default
    private boolean active = true;

    @Column(name = "premium_user")
    @Builder.Default
    private boolean premiumUser = false;

    @Column(name = "createdAt")
    @Builder.Default
    private Date createdAt = new Date();

    @Column(name = "updatedAt")
    @Builder.Default
    private Date updatedAt = new Date();

}
