package org.zerock.study.repository.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.zerock.study.domain.Board;

// Querydsl을 사용할 인터페이스 선언
public interface BoardSearch {

    // 페이지 처리
    Page<Board> search1(Pageable pageable);

}
