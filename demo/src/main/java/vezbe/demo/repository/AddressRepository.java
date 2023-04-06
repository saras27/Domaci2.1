package vezbe.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vezbe.demo.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
