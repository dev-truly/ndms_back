package com.satech.ndms.controller;

import com.satech.ndms.dto.HeaderDto;
import com.satech.ndms.entity.TcmCouDdObsv;
import com.satech.ndms.service.TcmCouDdObsvService;
import com.satech.ndms.common.ErrorCode;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.NoResultException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/dsMng")
public class TcmCouDbObsvControllerImpl implements TcmCouDbObsvController {

    @Autowired
    private TcmCouDdObsvService tcmCouDdObsvService;

    @ApiOperation(value = "계측센서 기본정보 조회(재해위험개선지구)", notes = "표준화가이드_1.8_p.38~p.39")
    @GetMapping(value = "/getObsvDD")
    public Map<String, Object> getObsvDDList() {
        Map<String, Object> result = new HashMap<>();
        ErrorCode errorCode = null;

        try {
            errorCode = ErrorCode.NomalService;
            List<TcmCouDdObsv> obsvList = tcmCouDdObsvService.select();
            result.put("body", obsvList);
        } catch (NoResultException e) {
            log.error("[getObsvDDList] NoResultException: {}", e.getMessage());
            errorCode = ErrorCode.UnknownError;
        } catch (NullPointerException e) {
            log.error("[getObsvDDList] NullPointerException: {}", e.getMessage());
            errorCode = ErrorCode.ApplicationError;
        } catch (Exception e) {
            log.error("[getObsvDDList] Exception: {}", e.getMessage());
            errorCode = ErrorCode.ApplicationError;
        }

        result.put("header", HeaderDto.fromErrorCode(errorCode));

        return result;
    }
}
