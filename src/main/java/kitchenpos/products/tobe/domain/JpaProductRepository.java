package kitchenpos.products.tobe.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends ProductRepository, JpaRepository<Product, Long> {

}