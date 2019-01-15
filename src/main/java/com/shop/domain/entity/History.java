package com.shop.domain.entity;

import com.shop.domain.entity.base.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "history_tbl")
@ToString(callSuper = true)
@Entity
public class History extends BaseEntity {

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Set<Product> products;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<User> users;
}
