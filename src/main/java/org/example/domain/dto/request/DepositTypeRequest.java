package org.example.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DepositTypeRequest {
    private String name;
    private Float minAmount;
    private Integer interest;
    private Integer duration;
    // test
//    private DepositType returnType;
}
