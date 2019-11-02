package com.hk.application.classification.front.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

const val FRONT_BASE_REQUEST_MAPPING = "/front"
const val FRONT_SEARCH_REQUEST_MAPPING = "/search"
const val FRONT_FIND_BASE_REQUEST_MAPPING = "/find"

@Controller(FRONT_BASE_REQUEST_MAPPING)
class FrontController {

    //分類を検索する
    @GetMapping(FRONT_SEARCH_REQUEST_MAPPING)
    fun search() {
    }


    //分類の詳細を取得する
    @GetMapping(FRONT_FIND_BASE_REQUEST_MAPPING)
    fun find() {
    }
}