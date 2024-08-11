package com.example.entity.user;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

@Data
@JsonDeserialize
@JsonAutoDetect
public class AccountUser {
    int id;
    String username;
    String email;
}