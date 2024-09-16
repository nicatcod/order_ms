package az.atl.orderms.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PRIVATE;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = PRIVATE)
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;

    BigDecimal price;
    Integer count;
    Long custumerId;
    Long productId;
}
