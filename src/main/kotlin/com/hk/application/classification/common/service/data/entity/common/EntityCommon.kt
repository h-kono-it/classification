package com.hk.application.classification.common.service.data.entity.common

import java.time.LocalDateTime

open class EntityCommon(var createdUser: String?, var createdDate: LocalDateTime?, var updatedUser: String?, var updatedDate: LocalDateTime?) {
    fun setCreateParam(createUser: String, createDate: LocalDateTime = LocalDateTime.now()) {
        this.createdUser = createUser
        this.createdDate = createDate
        this.setUpdateParam(createUser, createDate)
    }

    fun setUpdateParam(updateUser: String, updateDate: LocalDateTime = LocalDateTime.now()) {
        this.updatedUser = updateUser
        this.updatedDate = updateDate
    }
}