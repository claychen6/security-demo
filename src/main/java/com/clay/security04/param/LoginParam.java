package com.clay.security04.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lei
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginParam {
    
    private String username;

    private String password;
}
