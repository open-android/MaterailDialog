# 最火Android开源项目MaterialDialog使用
---
开源地址：[https://github.com/open-android/MaterialDialog](https://github.com/open-android/MaterialDialog "开源项目地址")

# 运行效果
![](http://i.imgur.com/CPorLY3.gif)

* 爱生活,爱学习,更爱做代码的搬运工,分类查找更方便请下载黑马助手app


![黑马助手.png](http://upload-images.jianshu.io/upload_images/4037105-f777f1214328dcc4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 使用步骤

### 1. 在project的build.gradle添加如下代码(如下图)

	allprojects {
	    repositories {
	        ...
	        maven { url "https://jitpack.io" }
	    }
	}

![](http://oi5nqn6ce.bkt.clouddn.com/itheima/booster/code/jitpack.png)


### 2. 在Module的build.gradle添加依赖

     compile 'com.github.open-android:MaterialDialog:1.0.0'


### 3. 复制如下代码到xml

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:onClick="showDialog"
        android:text="点我弹出对话框"/>

###4 . 复制如下代码到Activity

	public void showDialog(View view){
		 new MaterialDialog.Builder(this)
			.title("这是标题")
			.content("这是描述的内容")
			.positiveText("确定")
			.negativeText("取消")
			.show();
	}

#### 细节注意:

1. 支持链式调用
2. 基本用法与官方的AlertDialog 基本相似
3. 取消对话框，可以使用 dismiss方法

		


* 详细的使用方法在DEMO里面都演示啦,如果你觉得这个库还不错,请赏我一颗star吧~~~

* 欢迎关注微信公众号

![](http://upload-images.jianshu.io/upload_images/4037105-8f737b5104dd0b5d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
