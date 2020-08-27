package com.fxj.mygradleplugin;
import org.gradle.api.Plugin
import org.gradle.api.Project

/*
参考文章:
https://blog.csdn.net/Notzuonotdied/article/details/105740915
https://blog.csdn.net/weixin_38883338/article/details/90727880
*/
public class MyGradlePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println "This is MyGradlePlugin"
    }
}