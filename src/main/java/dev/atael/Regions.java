package dev.atael;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "REGIONS")
public class Regions {

    @Id
    @Column(name = "REGION_ID")
    Integer regionId;

    @Column(name = "REGION_NAME")
    String regionName;

}
// public record Regions (@Id Integer regionId, String regionName) {
// }