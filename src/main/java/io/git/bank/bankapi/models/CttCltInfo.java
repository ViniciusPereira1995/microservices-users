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
@Table(name = "ctt_clt_info")
public class CttCltInfo {
    @Id
    @Column(name = "id_ctt_clt_info", nullable = false)
    private UUID id;

    @Column(name = "nr_tel", nullable = false, length = 28)
    private String nrTel;
    @Column(name = "is_princ_tel")
    private Boolean isPrincTel;

/*
    TODO [JPA Buddy] create field to map the 'typ_tel' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typ_tel", columnDefinition = "type_tel(0, 0)")
    private Object typTel;
*/
}