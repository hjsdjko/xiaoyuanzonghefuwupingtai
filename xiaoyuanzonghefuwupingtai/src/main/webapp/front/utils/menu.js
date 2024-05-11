const menu = {
    list() {
        return [
    {
        "backMenu":[
        ],
        "frontMenu":[
        ],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"否",
        "hasFrontRegister":"否",
        "roleName":"管理员",
        "tableName":"users"
    },
    {
        "backMenu":[
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"收货地址",
                        "menuJump":"列表",
                        "tableName":"address"
                    }
                ],
                "menu":"收货地址"
            }
			,
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                        ],
                        "menu":"校园资讯",
                        "menuJump":"列表",
                        "tableName":"gongao"
                    }
                ],
                "menu":"校园资讯"
            }
            ,
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"校园资讯收藏管理",
                        "menuJump":"列表",
                        "tableName":"gongaoCollection"
                    }
                ],
                "menu":"我的校园资讯收藏"
            }
            ,
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"校园资讯评论信息",
                        "menuJump":"列表",
                        "tableName":"gongaoLiuyan"
                    }
                ],
                "menu":"我的校园资讯评论信息"
            }
			,
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"商品",
                        "menuJump":"列表",
                        "tableName":"goods"
                    }
                ],
                "menu":"商品"
            }
            // ,
            // {
            //     "child":[
            //         {
            //             "buttons":[
            //                 "查看",
            //                 "删除"
            //             ],
            //             "menu":"商品评价信息",
            //             "menuJump":"列表",
            //             "tableName":"goodsCommentback"
            //         }
            //     ],
            //     "menu":"我的商品评价信息"
            // }
            ,
            {
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"我的商品订单",
                        "menuJump":"列表",
                        "tableName":"goodsOrder"
                    }
                ],
                "menu":"我的商品订单"
            }
            ,
            {
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"公告信息管理",
                        "menuJump":"列表",
                        "tableName":"news"
                    }
                ],
                "menu":"公告信息"
            }
			,
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                        ],
                        "menu":"失物认领",
                        "menuJump":"列表",
                        "tableName":"shiwurenling"
                    }
                ],
                "menu":"失物认领"
            }
			,
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"失物招领",
                        "menuJump":"列表",
                        "tableName":"xiaoyuanshiwuzhaoling"
                    }
                ],
                "menu":"失物招领"
            }
            // ,
            // {
            //     "child":[
            //         {
            //             "buttons":[
            //                 "查看",
            //                 "删除"
            //             ],
            //             "menu":"失物招领评论信息",
            //             "menuJump":"列表",
            //             "tableName":"xiaoyuanshiwuzhaolingLiuyan"
            //         }
            //     ],
            //     "menu":"我的失物招领评论信息"
            // }
        ],
        "frontMenu":[
        ],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"是",
        "hasFrontRegister":"是",
        "roleName":"用户",
        "tableName":"yonghu"
    }
]

	}
}
export default menu;
