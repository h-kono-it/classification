package com.hk.application.classification.common.service.data.entity

import com.hk.application.classification.common.service.data.entity.common.EntityCommon
import com.hk.application.classification.common.service.data.entity.common.SurrogateId
import lombok.Data
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/** 分類条件Entity */
@Entity
@Data
class ClassificationCondition(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)  val id: SurrogateId, val classificationId: SurrogateId, val name: String, val displayOrder: Int, createdUser: String, createdDate: LocalDateTime, updatedUser: String, updatedDate: LocalDateTime) : EntityCommon(createdUser, createdDate, updatedUser, updatedDate) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ClassificationCondition

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}