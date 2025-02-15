package br.ufrn.imd.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
}
