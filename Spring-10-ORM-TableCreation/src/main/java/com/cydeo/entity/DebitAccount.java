package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
//@Table(name = )
public class DebitAccount extends Account{

    private BigDecimal overDraftFee;


}
