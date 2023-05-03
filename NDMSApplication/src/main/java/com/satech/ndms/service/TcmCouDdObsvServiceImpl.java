package com.satech.ndms.service;

import com.satech.ndms.entity.TcmCouDdObsv;
import com.satech.ndms.repository.TcmCouDdObsvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import java.util.List;

@Service
public class TcmCouDdObsvServiceImpl implements TcmCouDdObsvService {
    @Autowired
    private TcmCouDdObsvRepository tcmCouDbObsvRepository;

    @Override
    public List<TcmCouDdObsv> select() throws NullPointerException, EntityNotFoundException, NoResultException  {
        tcmCouDbObsvRepository.test("5011000001");
        return tcmCouDbObsvRepository.findAll();
    }
}
