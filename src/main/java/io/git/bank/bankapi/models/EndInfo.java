package io.git.bank.bankapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "end_info")
public class EndInfo {
    @Id
    @Column(name = "id_end_info", nullable = false)
    private UUID id;

    @Column(name = "cep", nullable = false, length = 20)
    private String cep;

    @Column(name = "dsc_end", nullable = false, length = 150)
    private String dscEnd;

    @Column(name = "nrm_brr_end", length = 5)
    private String nrmBrrEnd;

    @Column(name = "nm_bair_end", nullable = false, length = 150)
    private String nmBairEnd;

    @Column(name = "nm_cd_end", nullable = false, length = 100)
    private String nmCdEnd;

    @Column(name = "nm_st_end", nullable = false, length = 100)
    private String nmStEnd;

    @Column(name = "nm_uf_end", nullable = false, length = 2)
    private String nmUfEnd;

    @Column(name = "nm_ps_end", length = 100)
    private String nmPsEnd;

}