package com.xiezilailai;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by 蝎子莱莱123 on 2016/2/17.
 */
@Transactional
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;
//    private TransactionTemplate transactionTemplate;
//
//
//    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
//        this.transactionTemplate = transactionTemplate;
//    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        int i=1/0;
        accountDao.inMoney(in, money);
    }

//    注入事务管理模板
//    @Override
//    public void transfer(String out, String in, Double money) {
//       transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//           @Override
//           protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
//               accountDao.outMoney(out,money);
//               int i=1/0;
//               accountDao.inMoney(in,money);
//           }
//       });
//    }
}
