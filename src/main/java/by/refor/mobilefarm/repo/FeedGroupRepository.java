package by.refor.mobilefarm.repo;

import by.refor.mobilefarm.model.entity.FeedGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface FeedGroupRepository extends JpaRepository<FeedGroupEntity, Long> {

    FeedGroupEntity findByTypeAndProductivityAndWeightAndGeneticWeightAndAgeTo(String type, BigDecimal productivity, BigDecimal weight, BigDecimal geneticWeight, Integer ageTo);

    @Query("SELECT o FROM FeedGroupEntity o\n" +
            "INNER JOIN AnimalPassportEntity a ON o.feedGroupId = a.feedGroup.feedGroupId\n" +
            "INNER JOIN FarmEntity f ON a.farm.farmId = f.farmId\n" +
            "WHERE f.organization.name = ?1")
    List<FeedGroupEntity> findByOrganizationName(String organization);
}
