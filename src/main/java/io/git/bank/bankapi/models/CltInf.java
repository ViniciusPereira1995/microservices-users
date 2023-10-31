package io.git.bank.bankapi.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "clt_inf")
public class CltInf {
    @Id
    @Column(name = "id_clt_inf", nullable = false)
    private UUID id;

    @Column(name = "nm_clt", nullable = false, length = 100)
    private String nmClt;

    @Column(name = "cpf_cpnj_clt", nullable = false, length = 17)
    private String cpfCpnjClt;

    @Column(name = "age_clt", nullable = false)
    private Integer ageClt;

    @Column(name = "rg_clt", nullable = false, length = 50)
    private String rgClt;

    @Column(name = "dt_nsc_clt")
    private LocalDate dtNscClt;

    @Column(name = "email_clt", nullable = false, length = 150)
    private String emailClt;

    @ManyToMany
    @JoinTable(name = "ctt_clt_join",
            joinColumns = @JoinColumn(name = "clt_id"),
            inverseJoinColumns = @JoinColumn(name = "end_id"))
    private Set<CttCltInfo> cttCltInfos = new LinkedHashSet<>();
    @ManyToMany
    @JoinTable(name = "end_clt_join",
            joinColumns = @JoinColumn(name = "clt_id"),
            inverseJoinColumns = @JoinColumn(name = "end_id"))
    private Set<EndInfo> endInfos = new LinkedHashSet<>();

/*
    TODO [JPA Buddy] create field to map the 'sx_clt' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "sx_clt", columnDefinition = "sx_tp(0, 0) not null")
    private Object sxClt;
*/
}