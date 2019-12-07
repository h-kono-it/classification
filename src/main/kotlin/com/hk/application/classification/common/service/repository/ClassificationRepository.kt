package com.hk.application.classification.common.service.repository

import com.hk.application.classification.common.service.data.entity.Classification
import com.hk.application.classification.common.service.data.entity.common.SurrogateId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ClassificationRepository : JpaRepository<Classification,SurrogateId>{
    override fun findById(id: SurrogateId): Optional<Classification>
}