package org.bibaboba.repository;

import org.bibaboba.entity.Bet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface BetRepository extends JpaRepository<Bet, UUID> {
}
