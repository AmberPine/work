package com.ambersec.cloud.infrastructure.persistence.jdbc;

import com.ambersec.cloud.domain.model.user.User;
import com.ambersec.cloud.domain.model.user.UserRepository;
import com.ambersec.cloud.infrastructure.utils.SqlHandler;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Spring Jdbc implementation of {@link com.ambersec.cloud.domain.model.user.UserRepository}.
 * Created by pine on 2016/6/6.
 */
@Repository
public class UserRepositoryJdbc extends SpringJdbcRepository implements UserRepository {
    @Override
    public User findUserByAccount(String userAccount) {
        return this.jdbcTemplate.query(SqlHandler.getProperties("sys.user.selectByAccount"), new ResultSetExtractor<User>() {
            @Override
            public User extractData(ResultSet rs) throws SQLException, DataAccessException {
                User user = null;
                if (rs.next()) {
                    user = new User(rs.getString("id"), rs.getString("account"),rs.getString("name"), rs.getString("password"),
                            rs.getString("email"), rs.getString("phonenum"), rs.getString("mobilephone"));
                }
                return user;
            }
        }, userAccount);
    }
}
