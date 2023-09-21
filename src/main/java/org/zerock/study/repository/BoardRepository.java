package org.zerock.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.zerock.study.domain.Board;

// JpaRepository 엔티티 타입 : Board, @Id 타입 : Long
public interface BoardRepository extends JpaRepository<Board, Long> {

    @Query(value = "SELECT now()", nativeQuery = true)
    String getTime();
}
