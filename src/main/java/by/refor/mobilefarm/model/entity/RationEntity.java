package by.refor.mobilefarm.model.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "rations")
@Data
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class RationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rationId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "feed_group_id", nullable = false)
    private FeedGroupEntity feedGroup;

    @OneToMany(mappedBy = "ration")
    private List<RationFeeds> rationFeeds;

    @Override
    public String toString(){
        return  "rationId = " + rationId + ", " +
                "geneticGroup = " + feedGroup + ", " +
                "rationFeeds = " + rationFeeds;
    }
}
