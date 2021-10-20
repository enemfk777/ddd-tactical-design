package kitchenpos.eatinorders.tobe.eatinorder.domain;

import kitchenpos.eatinorders.tobe.ordertable.domain.OrderTable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {
    EatInOrder save(EatInOrder order);

    Optional<EatInOrder> findById(UUID id);

    List<EatInOrder> findAll();

    boolean existsByOrderTableAndStatusNot(OrderTable orderTable, OrderStatus status);
}
