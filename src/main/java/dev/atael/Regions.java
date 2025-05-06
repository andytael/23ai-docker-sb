package dev.atael;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "REGIONS")
public class Regions {

    @Id
    @Column(name = "REGION_ID")
    Integer regionId;

    @Column(name = "REGION_NAME")
    String regionName;

}