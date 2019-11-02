package com.hk.application.classification.front.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

// 定数定義
const val SEARCH_BASE_REQUEST_MAPPING = "/front/{classificationId}/detail"
const val SEARCH_REQUEST_MAPPING = "/search"
const val SEARCH_WORD_REQUEST_MAPPING = "/search/word"
const val FIND_REQUEST_MAPPING = "/find/{itemId}"

@RestController(SEARCH_BASE_REQUEST_MAPPING)
class SearchController {
    //見分け方を設定する
    @GetMapping(SEARCH_REQUEST_MAPPING)
    fun conditionSearch() {

    }

    //文字列で検索する
    @GetMapping(SEARCH_WORD_REQUEST_MAPPING)
    fun wordSearch() {

    }

    //特定の情報を取得する
    @GetMapping(FIND_REQUEST_MAPPING)
    fun find() {

    }

}

