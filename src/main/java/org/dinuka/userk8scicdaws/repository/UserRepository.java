package org.dinuka.userk8scicdaws.repository;

import org.dinuka.userk8scicdaws.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
