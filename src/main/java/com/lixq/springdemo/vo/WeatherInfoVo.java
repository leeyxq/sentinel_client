package com.lixq.springdemo.vo;

import lombok.Data;

import java.util.List;

/**
 * 天气信息vo
 *
 * @author lixiangqian
 * @date 2019-07-26 11:01
 **/
@Data
public class WeatherInfoVo {


    /**
     * cityid : 101010100
     * update_time : 2019-07-26 11:30:00
     * city : 北京
     * cityEn : beijing
     * country : 中国
     * countryEn : China
     * data : [{"day":"26日（今天）","date":"2019-07-26","week":"星期五","wea":"晴","wea_img":"qing","air":65,"humidity":46,"air_level":"良","air_tips":"空气好，可以外出活动，除极少数对污染物特别敏感的人群以外，对公众没有危害！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"tem1":"36℃","tem2":"26℃","tem":"32℃","win":["西南风","东北风"],"win_speed":"<3级","hours":[{"day":"26日08时","wea":"晴","tem":"28℃","win":"西南风","win_speed":"<3级"},{"day":"26日11时","wea":"晴","tem":"32℃","win":"西南风","win_speed":"<3级"},{"day":"26日14时","wea":"晴","tem":"35℃","win":"西南风","win_speed":"<3级"},{"day":"26日17时","wea":"晴","tem":"35℃","win":"西南风","win_speed":"<3级"},{"day":"26日20时","wea":"晴","tem":"31℃","win":"西南风","win_speed":"<3级"},{"day":"26日23时","wea":"晴","tem":"29℃","win":"东北风","win_speed":"<3级"},{"day":"27日02时","wea":"晴","tem":"27℃","win":"东北风","win_speed":"<3级"},{"day":"27日05时","wea":"晴","tem":"26℃","win":"东北风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"很强","desc":"涂擦SPF20以上，PA++护肤品，避强光。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气有点热，运动多补水。"},{"title":"健臻·血糖指数","level":"易波动","desc":"气温高，血糖易波动，注意防暑降温。"},{"title":"穿衣指数","level":"炎热","desc":"建议穿短衫、短裤等清凉夏季服装。"},{"title":"洗车指数","level":"适宜","desc":"天气较好，适合擦洗汽车。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]},{"day":"27日（明天）","date":"2019-07-27","week":"星期六","wea":"多云","wea_img":"yun","tem1":"36℃","tem2":"27℃","tem":"30℃","win":["南风","东南风"],"win_speed":"<3级","hours":[{"day":"27日08时","wea":"晴","tem":"30℃","win":"东北风","win_speed":"<3级"},{"day":"27日11时","wea":"晴","tem":"32℃","win":"南风","win_speed":"<3级"},{"day":"27日14时","wea":"晴","tem":"34℃","win":"南风","win_speed":"<3级"},{"day":"27日17时","wea":"多云","tem":"33℃","win":"南风","win_speed":"<3级"},{"day":"27日20时","wea":"多云","tem":"32℃","win":"南风","win_speed":"<3级"},{"day":"27日23时","wea":"晴","tem":"30℃","win":"东南风","win_speed":"<3级"},{"day":"28日02时","wea":"晴","tem":"28℃","win":"东南风","win_speed":"<3级"},{"day":"28日05时","wea":"晴","tem":"27℃","win":"东南风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"中等","desc":"涂擦SPF大于15、PA+防晒护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气有点热，运动多补水。"},{"title":"健臻·血糖指数","level":"易波动","desc":"气温高，血糖易波动，注意防暑降温。"},{"title":"穿衣指数","level":"炎热","desc":"建议穿短衫、短裤等清凉夏季服装。"},{"title":"洗车指数","level":"较适宜","desc":"无雨且风力较小，易保持清洁度。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]},{"day":"28日（后天）","date":"2019-07-28","week":"星期日","wea":"多云转雷阵雨","wea_img":"lei","tem1":"34℃","tem2":"25℃","tem":"29℃","win":["南风","南风"],"win_speed":"<3级","hours":[{"day":"28日08时","wea":"多云","tem":"29℃","win":"东南风","win_speed":"<3级"},{"day":"28日11时","wea":"多云","tem":"31℃","win":"南风","win_speed":"<3级"},{"day":"28日14时","wea":"多云","tem":"33℃","win":"南风","win_speed":"<3级"},{"day":"28日17时","wea":"多云","tem":"32℃","win":"南风","win_speed":"<3级"},{"day":"28日20时","wea":"多云","tem":"31℃","win":"南风","win_speed":"<3级"},{"day":"28日23时","wea":"雷阵雨","tem":"28℃","win":"南风","win_speed":"<3级"},{"day":"29日02时","wea":"雷阵雨","tem":"26℃","win":"南风","win_speed":"<3级"},{"day":"29日05时","wea":"雷阵雨","tem":"26℃","win":"南风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"中等","desc":"涂擦SPF大于15、PA+防晒护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气有点热，运动多补水。"},{"title":"健臻·血糖指数","level":"易波动","desc":"血糖易波动，注意监测。"},{"title":"穿衣指数","level":"炎热","desc":"建议穿短衫、短裤等清凉夏季服装。"},{"title":"洗车指数","level":"不宜","desc":"有雨，雨水和泥水会弄脏爱车。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]},{"day":"29日（周一）","date":"2019-07-29","week":"星期一","wea":"中雨转多云","wea_img":"yun","tem1":"30℃","tem2":"24℃","tem":"26℃","win":["西北风","西南风"],"win_speed":"<3级","hours":[{"day":"29日08时","wea":"阴","tem":"26℃","win":"南风","win_speed":"<3级"},{"day":"29日14时","wea":"中雨","tem":"26℃","win":"西北风","win_speed":"<3级"},{"day":"29日20时","wea":"中雨","tem":"27℃","win":"西北风","win_speed":"<3级"},{"day":"30日02时","wea":"晴","tem":"25℃","win":"西南风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"辐射弱，涂擦SPF8-12防晒护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气闷热，坚持室内低强度运动。"},{"title":"健臻·血糖指数","level":"易波动","desc":"气温多变，血糖易波动，请注意监测。"},{"title":"穿衣指数","level":"热","desc":"适合穿T恤、短薄外套等夏季服装。"},{"title":"洗车指数","level":"不宜","desc":"有雨，雨水和泥水会弄脏爱车。"},{"title":"空气污染扩散指数","level":"优","desc":"气象条件非常有利于空气污染物扩散。"}]},{"day":"30日（周二）","date":"2019-07-30","week":"星期二","wea":"多云转晴","wea_img":"yun","tem1":"34℃","tem2":"24℃","tem":"27℃","win":["西南风","北风"],"win_speed":"<3级","hours":[{"day":"30日08时","wea":"多云","tem":"27℃","win":"西南风","win_speed":"<3级"},{"day":"30日14时","wea":"多云","tem":"31℃","win":"西南风","win_speed":"<3级"},{"day":"30日20时","wea":"晴","tem":"29℃","win":"西南风","win_speed":"<3级"},{"day":"31日02时","wea":"晴","tem":"25℃","win":"北风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"中等","desc":"涂擦SPF大于15、PA+防晒护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气有点热，运动多补水。"},{"title":"健臻·血糖指数","level":"易波动","desc":"气温多变，血糖易波动，请注意监测。"},{"title":"穿衣指数","level":"炎热","desc":"建议穿短衫、短裤等清凉夏季服装。"},{"title":"洗车指数","level":"不宜","desc":"积水较多，车辆易溅上泥水。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]},{"day":"31日（周三）","date":"2019-07-31","week":"星期三","wea":"多云","wea_img":"yun","tem1":"34℃","tem2":"24℃","tem":"25℃","win":["北风","北风"],"win_speed":"<3级","hours":[{"day":"31日08时","wea":"晴","tem":"27℃","win":"北风","win_speed":"<3级"},{"day":"31日14时","wea":"晴","tem":"31℃","win":"北风","win_speed":"<3级"},{"day":"31日20时","wea":"多云","tem":"28℃","win":"北风","win_speed":"<3级"},{"day":"01日02时","wea":"多云","tem":"25℃","win":"北风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"中等","desc":"涂擦SPF大于15、PA+防晒护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气有点热，运动多补水。"},{"title":"健臻·血糖指数","level":"易波动","desc":"血糖易波动，注意监测。"},{"title":"穿衣指数","level":"炎热","desc":"建议穿短衫、短裤等清凉夏季服装。"},{"title":"洗车指数","level":"适宜","desc":"天气较好，适合擦洗汽车。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]},{"day":"1日（周四）","date":"2019-08-01","week":"星期四","wea":"晴","wea_img":"qing","tem1":"34℃","tem2":"25℃","tem":"26℃","win":["北风","东风"],"win_speed":"<3级","hours":[{"day":"01日08时","wea":"多云","tem":"27℃","win":"北风","win_speed":"<3级"},{"day":"01日14时","wea":"晴","tem":"31℃","win":"北风","win_speed":"<3级"},{"day":"01日20时","wea":"晴","tem":"29℃","win":"北风","win_speed":"<3级"},{"day":"02日02时","wea":"晴","tem":"26℃","win":"东风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"很强","desc":"涂擦SPF20以上，PA++护肤品，避强光。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气有点热，运动多补水。"},{"title":"健臻·血糖指数","level":"易波动","desc":"血糖易波动，注意监测。"},{"title":"穿衣指数","level":"炎热","desc":"建议穿短衫、短裤等清凉夏季服装。"},{"title":"洗车指数","level":"较适宜","desc":"无雨且风力较小，易保持清洁度。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]}]
     */

    private String cityid;
    private String update_time;
    private String city;
    private String cityEn;
    private String country;
    private String countryEn;
    private List<DataBean> data;
    @Data
    public static class DataBean {
        /**
         * day : 26日（今天）
         * date : 2019-07-26
         * week : 星期五
         * wea : 晴
         * wea_img : qing
         * air : 65
         * humidity : 46
         * air_level : 良
         * air_tips : 空气好，可以外出活动，除极少数对污染物特别敏感的人群以外，对公众没有危害！
         * alarm : {"alarm_type":"","alarm_level":"","alarm_content":""}
         * tem1 : 36℃
         * tem2 : 26℃
         * tem : 32℃
         * win : ["西南风","东北风"]
         * win_speed : <3级
         * hours : [{"day":"26日08时","wea":"晴","tem":"28℃","win":"西南风","win_speed":"<3级"},{"day":"26日11时","wea":"晴","tem":"32℃","win":"西南风","win_speed":"<3级"},{"day":"26日14时","wea":"晴","tem":"35℃","win":"西南风","win_speed":"<3级"},{"day":"26日17时","wea":"晴","tem":"35℃","win":"西南风","win_speed":"<3级"},{"day":"26日20时","wea":"晴","tem":"31℃","win":"西南风","win_speed":"<3级"},{"day":"26日23时","wea":"晴","tem":"29℃","win":"东北风","win_speed":"<3级"},{"day":"27日02时","wea":"晴","tem":"27℃","win":"东北风","win_speed":"<3级"},{"day":"27日05时","wea":"晴","tem":"26℃","win":"东北风","win_speed":"<3级"}]
         * index : [{"title":"紫外线指数","level":"很强","desc":"涂擦SPF20以上，PA++护肤品，避强光。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气有点热，运动多补水。"},{"title":"健臻·血糖指数","level":"易波动","desc":"气温高，血糖易波动，注意防暑降温。"},{"title":"穿衣指数","level":"炎热","desc":"建议穿短衫、短裤等清凉夏季服装。"},{"title":"洗车指数","level":"适宜","desc":"天气较好，适合擦洗汽车。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]
         */

        private String day;
        private String date;
        private String week;
        private String wea;
        private String wea_img;
        private int air;
        private int humidity;
        private String air_level;
        private String air_tips;
        private AlarmBean alarm;
        private String tem1;
        private String tem2;
        private String tem;
        private String win_speed;
        private List<String> win;
        private List<HoursBean> hours;
        private List<IndexBean> index;
        @Data
        public static class AlarmBean {
            /**
             * alarm_type :
             * alarm_level :
             * alarm_content :
             */

            private String alarm_type;
            private String alarm_level;
            private String alarm_content;
        }

        @Data
        public static class HoursBean {
            /**
             * day : 26日08时
             * wea : 晴
             * tem : 28℃
             * win : 西南风
             * win_speed : <3级
             */

            private String day;
            private String wea;
            private String tem;
            private String win;
            private String win_speed;

        }

        @Data
        public static class IndexBean {
            /**
             * title : 紫外线指数
             * level : 很强
             * desc : 涂擦SPF20以上，PA++护肤品，避强光。
             */

            private String title;
            private String level;
            private String desc;

        }
    }
}
