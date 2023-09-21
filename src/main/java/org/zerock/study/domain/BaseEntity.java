package org.zerock.study.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

// @EntityListeners 활성화를 위해 Application 메인 클래스에 @EnableJpaAuditing 추가
// 데이터 등록 시간 및 수정 시간을 칼럼으로 처리하는 클래스
@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
@Getter
abstract public class BaseEntity {

    @CreatedDate
    @Column(name = "regdate", updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate
    @Column(name = "moddate")
    private LocalDateTime modDate;
}
