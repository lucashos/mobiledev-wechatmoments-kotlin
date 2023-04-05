package com.tws.moments.api.entry

data class TweetBean(
    var content: String? = null,
    var sender: UserBean,
    var images: List<ImagesBean>? = null,
    var comments: List<CommentsBean>? = null
)