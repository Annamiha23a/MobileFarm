package by.refor.mobilefarm.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "animal_passports")
@Data
@Accessors(chain = true)
public class AnimalPassportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long animalPassportId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "farm_id", nullable = false)
    private FarmEntity farm;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "farm_original_owner_id")
    private FarmEntity originalOwnerFarm;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "father_id")
    private AnimalPassportEntity father;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mother_id")
    private AnimalPassportEntity mother;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "feed_group_id")
    private FeedGroupEntity feedGroup;

    @Column(name = "created_date", nullable = false)
    private OffsetDateTime createdDate;

    @Column(name = "external_id", unique = true)
    private String externalId;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "sex")
    private String sex;

    @Column(name = "breed")
    private String breed;

    @Column(name = "death_date")
    private OffsetDateTime deathDate;

    @Column(name = "breeding_animal")
    private Boolean breedingAnimal;

    @Column(name = "weight")
    private BigDecimal weight;

    @Column(name = "production_type")
    private String productionType;

    @Column(name = "average_productivity")
    private BigDecimal averageProductivity;

    @Column(name = "genetic_productivity", nullable = false)
    private BigDecimal geneticProductivity;

    @Column(name = "treatment_start_date")
    private OffsetDateTime treatmentStartDate;

    @Column(name = "treatment_end_date")
    private OffsetDateTime treatmentEndDate;

    @Column(name = "insemination_date")
    private OffsetDateTime inseminationDate;

    @Column(name = "lactation_start_date")
    private OffsetDateTime lactationStartDate;

    @Column(name = "lactation_end_date")
    private OffsetDateTime lactationEndDate;

    @Column(name = "dry_period_start_date")
    private OffsetDateTime dryPeriodStartDate;

    @Column(name = "birth_date", nullable = false)
    private OffsetDateTime birthDate;

    @Column(name = "weight_growth")
    private BigDecimal weightGrowth;

    @Column(name = "type")
    private String type;

    @Column(name = "originCountry")
    private String originCountry;

    @Column(name = "externalIdInOriginCountry")
    private String externalIdInOriginCountry;

    @Column(name = "formed")
    private Boolean formed;

    @Column(name = "formingDate")
    private OffsetDateTime formingDate;

    @Column(name = "formerName")
    private String formerName;
    @Override
    public String toString(){
        return "animalPassportId = " + animalPassportId + ", " +
                "farm = " + farm.getName() + ", " +
                "originalOwnerFarm = " + originalOwnerFarm.getName() + ", " +
                "father = " + father.getNickname() + ", " +
                "mother = " + mother.getNickname() + ", " +
                "geneticGroup = " + feedGroup.getType() + ", " +
                "createdDate = " + createdDate + ", " +
                "externalId = " + externalId + ", " +
                "nickname = " + nickname + ", " +
                "sex = " + sex + ", " +
                "breed = " + breed + ", " +
                "deathDate = " + deathDate + ", " +
                "breedingAnimal = " + breedingAnimal + ", " +
                "weight = " + weight + ", " +
                "productionType = " + productionType + ", " +
                "averageProductivity = " + averageProductivity + ", " +
                "geneticProductivity = " + geneticProductivity + ", " +
                "treatmentStartDate = " + treatmentStartDate + ", " +
                "treatmentEndDate = " + treatmentEndDate + ", " +
                "inseminationDate = " + inseminationDate + ", " +
                "lactationStartDate = " + lactationStartDate + ", " +
                "dryPeriodStartDate = " + dryPeriodStartDate + ", " +
                "birthDate = " + birthDate + ", " +
                "weightGrowth = " + weightGrowth + ", " +
                "type = " + type +
                "originCountry = " + originCountry + ", " +
                "externalIdInOriginCountry = " + externalIdInOriginCountry + ", " +
                "formingDate = " +formingDate + ", " +
                "formerName = " +formerName  ;

    }
}
