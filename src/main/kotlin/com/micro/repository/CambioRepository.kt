package com.micro.repository

import com.micro.model.Cambio
import org.springframework.data.jpa.repository.JpaRepository

interface CambioRepository : JpaRepository<Cambio, Long?> {

    fun findByFromAndTo(from: String, to: String): Cambio?
}