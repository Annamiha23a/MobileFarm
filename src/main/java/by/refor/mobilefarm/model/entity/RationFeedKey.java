package by.refor.mobilefarm.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class RationFeedKey implements Serializable {
    @Column(name = "ration_id")
    Long rationId;

    @Column(name = "feed_id")
    Long feedId;
}
