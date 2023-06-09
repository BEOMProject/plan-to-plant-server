package beom.plantoplantserver.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "plant_reward")
public class PlantReward {
    @Id
    @Column(nullable = false, name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false, name = "get_plant_date")
    LocalDate date;

    @ManyToOne  // 한 명의 User 는 여러 개의 Plant 를 가질 수 있음!
    @JoinColumn(name = "user_id")   // FK 지정
    User user;

    @ManyToOne
    @JoinColumn(name = "plant_id")
    Plant plant;

    @Column(name = "count", columnDefinition = "integer default 0")
    Integer count;

    @Column(name = "is_got", columnDefinition = "boolean default false")
    Boolean isGot;
}
