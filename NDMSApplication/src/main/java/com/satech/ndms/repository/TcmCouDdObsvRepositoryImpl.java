package com.satech.ndms.repository;

import com.satech.ndms.entity.TcmCouDdObsv;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

@Slf4j
public class TcmCouDdObsvRepositoryImpl implements TcmCouDdObsvRepositoryCustom {
    @Autowired
    EntityManager em;

    @Autowired
    SqlSession sqlSession;

    @Override
    public List<TcmCouDdObsv> test(String dcCode) {
        log.info(sqlSession.selectOne("DdObsvMapper.selectTcmCouDdObsvById", dcCode));
        return null;
    }
}
