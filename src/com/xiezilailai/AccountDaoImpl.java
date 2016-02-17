package com.xiezilailai;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by 蝎子莱莱123 on 2016/2/17.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void outMoney(String out, Double money) {
        String sql="update account set money = money - ? where name= ?";
        this.getJdbcTemplate().update(sql,money,out);
    }

    @Override
    public void inMoney(String in, Double money) {
        String sql="update account set money = money + ? where name= ?";
        this.getJdbcTemplate().update(sql,money,in);
    }
}
