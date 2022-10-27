package com.faisal.walletapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Name can not be blank")
    @Size(min = 2, max = 30)
    private String name;

    @Size(min = 2, max = 30)
    private String accountnumber;

    @Size(max = 100)
    private String description;

    @Min(1)
    @Max(3)
    private String priority; //1=High; 2= Medium; 3=Low
    private  Double currentBalance;

    @PrePersist
    public void setBalance(){this.currentBalance=0.00;}

}












