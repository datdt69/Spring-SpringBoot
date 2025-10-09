package com.datdt.superapp.entity.unimany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
//@Table(name = "Major")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Major {
    @Id
    @Column(name = "Id", columnDefinition = "CHAR(2)")
    private String id;
    @Column(name = "Name", columnDefinition = "NVARCHAR(100)",nullable = false)
    private String name;

}
