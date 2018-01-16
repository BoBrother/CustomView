package com.example.shiping.Bean

/**
 * Created by 小社会 on 2017/12/15,0015.
 */

data class beans(
		val msg: String, //成功
		val ret: Ret,
		val code: String //200
)

data class Ret(
		val hotSearchList: List<HotSearch>,
		val list: List<Item6>
)

data class HotSearch(
		val refCounter: Int, //1
		val cnname: String, //xingjichuanyue
		val siteId: String, //1
		val simplename: String, //xjcy
		val id: String, //ff8080815a5f91db015a68a763b750d5
		val tagName: String, //星际穿越
		val createdtime: String, //2017-02-23 09:48:04
		val enname: String
)

data class Item6(
		val showStyle: String,
		val loadType: String, //videoList
		val changeOpenFlag: String, //false
		val line: Int, //1
		val showType: String, //banner
		val childList: List<Child>,
		val moreURL: String,
		val title: String, //Banner
		val bigPicShowFlag: String
)

data class Child(
		val airTime: Int, //2012
		val duration: String, //01:46:16
		val loadType: String, //video
		val score: Int, //0
		val angleIcon: String, //http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296614609066838.png
		val dataId: String, //840ddae38ed346a197a76b46b448067e
		val description: String, //影片来自于真实的故事，小镇上的记者亚当（约翰·卡拉辛斯基 John Krasinski 饰）和绿色和平组织的一位志愿者瑞秋（德鲁·巴里摩尔 Drew Barrymore 饰）加入到了拯救北极圈灰鲸的行动中去。 两人必须联合阿拉斯加的因纽特人，对抗石油公司以及苏联和美国的军队的反对——在当时的冷战背景下，他们终于得到了世界的关注，冷战的阴影也因拯救这种濒临灭绝的动物行动而得到缓解。
		val loadURL: String, //http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=840ddae38ed346a197a76b46b448067e
		val shareURL: String, //http://m.svipmovie.com/#/moviedetails/840ddae38ed346a197a76b46b448067e
		val pic: String, //http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/11/13/1510554001280066272.jpg
		val title: String, //群星拯救临灭绝灰鲸
		val roomId: String
)
