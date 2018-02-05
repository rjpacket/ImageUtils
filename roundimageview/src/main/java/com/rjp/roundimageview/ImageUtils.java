package com.rjp.roundimageview;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;

/**
 * author : Gimpo create on 2018/2/5 15:00
 * email  : jimbo922@163.com
 */

public class ImageUtils {

    /**
     * 简单加载
     * @param context 上下文
     * @param url 图片地址
     * @param imageView 图片
     */
    public static void load(Context context, String url, ImageView imageView){
        Glide.with(context).load(url).into(imageView);
    }

    /**
     * 简单加载 本地图片
     * @param context 上下文
     * @param file 图片地址
     * @param imageView 图片
     */
    public static void load(Context context, File file, ImageView imageView){
        Glide.with(context).load(file).into(imageView);
    }

    /**
     * 简单加载 资源文件
     * @param context 上下文
     * @param res 图片地址
     * @param imageView 图片
     */
    public static void load(Context context, int res, ImageView imageView){
        Glide.with(context).load(res).into(imageView);
    }

    /**
     * 简单加载
     * @param context 上下文
     * @param url 图片地址
     * @param loadingRes 占位图
     * @param imageView 图片
     */
    public static void load(Context context, String url, int loadingRes, ImageView imageView){
        Glide.with(context).load(url).placeholder(loadingRes).into(imageView);
    }

    /**
     * 简单加载
     * @param context 上下文
     * @param url 图片地址
     * @param loadingRes 占位图
     * @param errorRes 错误图
     * @param imageView 图片
     */
    public static void load(Context context, String url, int loadingRes, int errorRes, ImageView imageView){
        Glide.with(context).load(url).placeholder(loadingRes).error(errorRes).into(imageView);
    }

    /**
     * 简单加载
     * @param context 上下文
     * @param url 图片地址
     * @param loadingRes 占位图
     * @param errorRes 错误图
     * @param width 宽
     * @param height 高
     * @param imageView 图片
     */
    public static void load(Context context, String url, int loadingRes, int errorRes, int width, int height, ImageView imageView){
        Glide.with(context).load(url).placeholder(loadingRes).error(errorRes).override(width, height).into(imageView);
    }
}
