# LemonVideoDemo
柠檬影视sdk包及调用demo
============
##简介
本项目的sdk包功能涵盖了大部分影视方面的视频资源，包括电影、电视剧、综艺、动漫、电视直播等，接入app后就可以直接观看了。
LemonVideoDemo已经包含了sdk包，对应目录下的lemonvideolib。
两个目录分别是demo工程的app调用示例module和lemonvideolib被依赖库。
##系统环境
Android 4.0及以上版本
建议Android Studio开发环境，支持eclipse
##接入和配置
###1.在调用工程module里（demo当中是app）的 build.gradle添加依赖库
```java
    compile project(':lemonvideolib')
```
###2.配置lemonvideolib的清单文件AndroidManifest.xml，填入申请到的应用key和渠道key
```xml
  <meta-data android:name="LEMON_APPKEY" android:value="应用key" />
  <meta-data android:name="UMENG_CHANNEL" android:value="渠道key" />
```
###3.调用入口函数
####-游客身份进入
```java
 Intent intent = new Intent(StartActivity.this, com.lemon95.lemonvideolib.MainActivity.class);
 startActivity(intent);
```
####-用户身份进入
```java
 Intent intent = new Intent(StartActivity.this, com.lemon95.lemonvideolib.MainActivity.class);
 intent.putExtra("Mobile", user);  //手机号码 [用户名]
 intent.putExtra("Password",password); //登录密码
 startActivity(intent);
```java
##用到的第三方包
butterknife-7.0.1、国广手机电视starschina_player_sdk、友盟数据统计umeng-analytics-v6.0.1、video++、xutils3.3.32，如有冲突请自行取舍
             
