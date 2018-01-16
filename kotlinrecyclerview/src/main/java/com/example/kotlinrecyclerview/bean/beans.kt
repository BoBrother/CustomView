package com.example.kotlinrecyclerview.bean


/**
 * Created by 小社会 on 2018/1/10,0010.
 */

data class beans(
		val result: Result
)

data class Result(
		val res: Int, //1
		val category: List<Category>,
		val advs: List<Adv>,
		val nations: List<Nation>,
		val topics: List<Topic>,
		val brands: List<Brand>,
		val indexProducts: List<IndexProduct>
) {

}

data class Topic(
		val tid: Int, //4
		val title: String, //奶粉
		val titleTag: Any, //null
		val pic: String, //http://www.babybuy100.com/Storage/master/topic/201608251250215658490.jpg
		val url: String
)

data class Brand(
		val tid: Int, //15
		val title: String, //花王品牌专场
		val titleTag: Any, //null
		val pic: String, //http://www.babybuy100.com/Storage/master/topic/201701071815494603200.jpg
		val url: String,
		val products: List<Product>
)

data class Product(
		val pid: Int, //4274
		val name: String, //花王 Merries 纸尿裤 XL44片*2
		val pic: String, //http://www.babybuy100.com/Storage/master/product/thumbs310/310_201608222159381954870.jpg
		val price: String, //218.00
		val saleCounts: String, //1
		val url: String, //http://www.babybuy100.com/AppShop/ProductDetails.aspx?productId=4274
		val stock: Int //1000
)

data class Adv(
		val code: String, //index
		val pic: String, //http://www.babybuy100.com/Storage/master/banner/201701091457553775150.png
		val descriptions: String, //首页
		val url: String //class_3
)

data class Nation(
		val nid: Int, //2
		val name: String, //澳大利亚馆
		val flagPic: String, //http://www.babybuy100.com/Storage/master/nation/201701111355346620660.png
		val fqPic: String //http://www.babybuy100.com/Storage/master/nation/201701111355385846660.png
)

data class IndexProduct(
		val id: Int, //4465
		val name: String, //德国喜宝Hipp有机免敏苹果泥(4个月以上)125g
		val pic: String, //http://www.babybuy100.com/Storage/master/product/thumbs310/310_201609161323026451150.jpg
		val price: Double, //28.00
		val marketPrice: Double, //40.00
		val stock: Int //1000
)

data class Category(
		val cid: Int, //1
		val name: String //奶粉
)