package com.hk.application.classification.common.service.repository

import com.hk.application.classification.common.service.data.entity.ClassificationCondition
import com.hk.application.classification.common.service.data.entity.common.SurrogateId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ClassificationConditionRepository : JpaRepository<ClassificationCondition,SurrogateId>{
    override fun findById(id: SurrogateId): Optional<ClassificationCondition>
    fun findByClassificationId(classificationId : SurrogateId) : MutableList<ClassificationCondition>
}