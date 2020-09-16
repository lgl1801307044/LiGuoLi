package com.example.liguoli44;

import java.util.List;

/**
 * Create by ankele
 * <p>
 * 2020/9/15 - 10:21
 */
public class MovieBean {

    /**
     * result : 0
     * list : [{"title":"多哥","filePath":"https://movie.douban.com/subject/30271841","thumbPath":"https://img9.doubanio.com/view/photo/s_ratio_poster/public/p2575882765.webp","id":"2","profile":"聚焦1925年雪橇手和雪橇犬齐心协力为拯救阿拉斯加州诺姆市孩子的性命而奔波于血清接力路上的事件"},{"title":"来自深渊：流浪的黄昏","filePath":"https://movie.douban.com/subject/30175633","thumbPath":"https://img9.doubanio.com/view/photo/s_ratio_poster/public/p2545641131.webp","id":"2","profile":"人气动漫《来自深渊》确认将推出两部剧场版动画\u2014\u2014《来自深渊：出发的黎明》《来自深渊：流浪的黄昏》"},{"title":"真心半解 ","filePath":"https://movie.douban.com/subject/33420285/","thumbPath":"https://img9.doubanio.com/view/photo/s_ratio_poster/public/p2594916975.webp","id":"2","profile":"个性体贴的运动健将保罗爱上了学校校花，但他实在不善言辞，于是决定僱用内向的高材生艾莉帮他展开追求，毫不相干的两人也因此成为朋友"},{"title":"给我翅膀 ","filePath":"https://movie.douban.com/subject/30410114","thumbPath":"https://img9.doubanio.com/view/photo/s_ratio_poster/public/p2561160802.webp","id":"2","profile":"科斯迪安（让-保罗\u2022卢弗Jean-Paul Rouve 饰）是一名鸟类研究学者，对于鸟类学的热爱让他将毕生的精力都投入到了这个领域之中"},{"title":"你会在20岁时死去 ","filePath":"https://movie.douban.com/subject/34678128","thumbPath":"https://img9.doubanio.com/view/photo/s_ratio_poster/public/p2567988684.webp","id":"2","profile":"As soon as Muzamil is born in a village in Sudan, a saint in the village predicts, \u201cThis child will die of twenty.\u201d"}]
     */

    private String result;
    private List<ListBean> list;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * title : 多哥
         * filePath : https://movie.douban.com/subject/30271841
         * thumbPath : https://img9.doubanio.com/view/photo/s_ratio_poster/public/p2575882765.webp
         * id : 2
         * profile : 聚焦1925年雪橇手和雪橇犬齐心协力为拯救阿拉斯加州诺姆市孩子的性命而奔波于血清接力路上的事件
         */

        private String title;
        private String filePath;
        private String thumbPath;
        private String id;
        private String profile;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public String getThumbPath() {
            return thumbPath;
        }

        public void setThumbPath(String thumbPath) {
            this.thumbPath = thumbPath;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getProfile() {
            return profile;
        }

        public void setProfile(String profile) {
            this.profile = profile;
        }
    }
}
