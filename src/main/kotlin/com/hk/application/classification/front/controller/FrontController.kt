package com.hk.application.classification.front.controller

import com.hk.application.classification.front.Constant
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller(Constant.FrontRouting.FRONT_BASE_REQUEST_MAPPING)
class FrontController {

    //分類を検索する
    @GetMapping(Constant.FrontRouting.FRONT_SEARCH_REQUEST_MAPPING)
    fun search(model: Model): String {
        return Constant.StaticContent.FRONT_TOP_HTML
    }


    //分類の詳細を取得する
    @GetMapping(Constant.FrontRouting.FRONT_FIND_BASE_REQUEST_MAPPING)
    fun find(model: Model): String {
        return Constant.StaticContent.FRONT_CLASSIFICATION_HTML
    }
}