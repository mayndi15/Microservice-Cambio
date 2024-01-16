package com.micro.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.Transient
import java.math.BigDecimal

@Entity
@Table(name = "cambio")
data class Cambio(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(name = "from_currency", nullable = false, length = 3)
    var from: String = "",

    @Column(name = "to_currency", nullable = false, length = 3)
    var to: String = "",

    @Column(name = "conversion_factor", nullable = false)
    var conversionFactor: BigDecimal = BigDecimal.ZERO,

    @Transient
    var convertedValue: BigDecimal = BigDecimal.ZERO,

    @Transient
    var environment: String? = ""
)