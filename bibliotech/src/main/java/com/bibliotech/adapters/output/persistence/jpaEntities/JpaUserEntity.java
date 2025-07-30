package com.bibliotech.adapters.output.persistence.jpaEntities;

import com.bibliotech.domain.user.Status;
import com.bibliotech.domain.user.UserType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_user")
@SequenceGenerator(name= "seq_user", sequenceName = "seq_user", allocationSize = 1, initialValue = 1)
public class JpaUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")
    private Long UserId;

    @NotNull
    private String name;

    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    private String password;

    @NotNull
    private UserType userType;

    @NotNull
    private Status status;
}
