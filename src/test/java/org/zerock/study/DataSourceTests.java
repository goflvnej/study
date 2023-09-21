package org.zerock.study;

import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
@Log4j2
public class DataSourceTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testConnection() throws SQLException {

        @Cleanup
        Connection con = dataSource.getConnection();

        log.info(con);
        
        // 연결 객체의 리턴 값이 null인지 아닌지 확인
        Assertions.assertNotNull(con);
    }
}
