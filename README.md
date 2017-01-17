# 最火Android开源项目MaterialDialog使用
---
开源地址：[https://github.com/open-android/MaterialDialog](https://github.com/open-android/MaterialDialog "开源项目地址")

# 运行效果
![](http://i.imgur.com/CPorLY3.gif)


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

     compile 'com.github.open-android:MaterialDialog:v1.0.0'


### 3. 复制如下代码到xml

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:onClick="showDialog"
        android:text="点我弹出对话框"/>

###4 . 复制如下代码到Activity

		 new MaterialDialog.Builder(this)
                .title("这是标题")
                .content("这是描述的内容")
                .positiveText("确定")
                .negativeText("取消")
                .show();

#### 细节注意:

1. 支持链式调用
2. 基本用法与官方的AlertDialog 基本相似
3. 取消对话框，可以使用 dismiss方法

		


欢迎关注微信公众号

![](http://oi5nqn6ce.bkt.clouddn.com/itheima/booster/code/qrcode.png)
