package com.gsroot.zgwz.model;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class User implements Serializable {
    private String id;
    private String name;
    private String mobile;
    private String password;
    private String createTime;
}
