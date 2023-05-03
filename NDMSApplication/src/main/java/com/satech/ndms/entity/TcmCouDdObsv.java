package com.satech.ndms.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
//@Table(name = "TCM_COU_DD_OBSV")
public class TcmCouDdObsv {
    @Id
    @Column(name="dscode")
    private String dsCode;

    private String cdDistObsv;
    private String gbObsv;
    private String bdongCd;
    private String mntnAdresAt;
    private String mlnm;
    private String aulnm;
    private String dtlAdres;
    private String rdnmadrCd;
    private String spoNoCd;
    private String orgnCd;
    private String lat;
    private String lon;
    private String rm;
    private String useYn;
    private LocalDateTime rgsde;
    private LocalDateTime updde;
}
