package com.hk.application.classification.front.controller

import com.hk.application.classification.front.Constant
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

// 定数定義
@RestController(Constant.FrontRouting.SEARCH_BASE_REQUEST_MAPPING)
class SearchController {
    //見分け方を設定する
    @GetMapping(Constant.FrontRouting.SEARCH_REQUEST_MAPPING)
    fun conditionSearch() {

    }

    //文字列で検索する
    @GetMapping(Constant.FrontRouting.SEARCH_WORD_REQUEST_MAPPING)
    fun wordSearch() {

    }

    //特定の情報を取得する
    @GetMapping(Constant.FrontRouting.FIND_REQUEST_MAPPING)
    fun find() {

    }

}

