package com.hk.application.classification.front

object Constant {
    object FrontRouting{
        const val FRONT_BASE_REQUEST_MAPPING = "/front"
        const val FRONT_SEARCH_REQUEST_MAPPING = "/search"
        const val FRONT_FIND_BASE_REQUEST_MAPPING = "/find"

        const val SEARCH_BASE_REQUEST_MAPPING = "/front/{classificationId}/detail"
        const val SEARCH_REQUEST_MAPPING = "/search"
        const val SEARCH_WORD_REQUEST_MAPPING = "/search/word"
        const val FIND_REQUEST_MAPPING = "/find/{itemId}"
    }

    object StaticContent{
        const val INDEX_HTML = "index"
        const val FRONT_TOP_HTML = "front/front"
        const val FRONT_CLASSIFICATION_HTML = "front/classification"
    }



}