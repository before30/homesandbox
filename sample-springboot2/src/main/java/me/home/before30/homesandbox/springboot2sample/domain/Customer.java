package me.home.before30.homesandbox.springboot2sample.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Customer {
    @PrimaryKey
    private UUID id;

    private String firstName;

    private String lastName;


}
