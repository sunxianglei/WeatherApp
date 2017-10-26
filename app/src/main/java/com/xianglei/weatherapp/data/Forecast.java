package com.xianglei.weatherapp.data;

/**
 * Created by sheng on 2017/10/26.
 */

public class Forecast {

    /**
     * result : {"future":{"day_20171101":{"date":"20171101","weather_id":{"fa":"02","fb":"01"},"week":"星期三","temperature":"12℃~21℃","weather":"阴转多云","wind":"北风3-4 级"},"day_20171027":{"date":"20171027","weather_id":{"fa":"01","fb":"01"},"week":"星期五","temperature":"13℃~23℃","weather":"多云","wind":"东风3-4 级"},"day_20171026":{"date":"20171026","weather_id":{"fa":"01","fb":"01"},"week":"星期四","temperature":"13℃~23℃","weather":"多云","wind":"东北风微风"},"day_20171029":{"date":"20171029","weather_id":{"fa":"02","fb":"01"},"week":"星期日","temperature":"12℃~21℃","weather":"阴转多云","wind":"北风3-4 级"},"day_20171028":{"date":"20171028","weather_id":{"fa":"01","fb":"01"},"week":"星期六","temperature":"13℃~22℃","weather":"多云","wind":"东北风3-4 级"},"day_20171030":{"date":"20171030","weather_id":{"fa":"01","fb":"01"},"week":"星期一","temperature":"11℃~18℃","weather":"多云","wind":"北风4-5 级"},"day_20171031":{"date":"20171031","weather_id":{"fa":"01","fb":"01"},"week":"星期二","temperature":"13℃~22℃","weather":"多云","wind":"东北风3-4 级"}},"today":{"weather_id":{"fa":"01","fb":"01"},"week":"星期四","city":"杭州","dressing_index":"舒适","travel_index":"适宜","wash_index":"较不宜","comfort_index":"","exercise_index":"适宜","dressing_advice":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。","uv_index":"弱","drying_index":"","temperature":"13℃~23℃","weather":"多云","date_y":"2017年10月26日","wind":"东北风微风"},"sk":{"temp":"23","humidity":"48%","wind_direction":"东北风","time":"16:34","wind_strength":"2级"}}
     * reason : successed!
     * error_code : 0
     * resultcode : 200
     */
    private ResultEntity result;
    private String reason;
    private int error_code;
    private String resultcode;

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public ResultEntity getResult() {
        return result;
    }

    public String getReason() {
        return reason;
    }

    public int getError_code() {
        return error_code;
    }

    public String getResultcode() {
        return resultcode;
    }

    public class ResultEntity {
        /**
         * future : {"day_20171101":{"date":"20171101","weather_id":{"fa":"02","fb":"01"},"week":"星期三","temperature":"12℃~21℃","weather":"阴转多云","wind":"北风3-4 级"},"day_20171027":{"date":"20171027","weather_id":{"fa":"01","fb":"01"},"week":"星期五","temperature":"13℃~23℃","weather":"多云","wind":"东风3-4 级"},"day_20171026":{"date":"20171026","weather_id":{"fa":"01","fb":"01"},"week":"星期四","temperature":"13℃~23℃","weather":"多云","wind":"东北风微风"},"day_20171029":{"date":"20171029","weather_id":{"fa":"02","fb":"01"},"week":"星期日","temperature":"12℃~21℃","weather":"阴转多云","wind":"北风3-4 级"},"day_20171028":{"date":"20171028","weather_id":{"fa":"01","fb":"01"},"week":"星期六","temperature":"13℃~22℃","weather":"多云","wind":"东北风3-4 级"},"day_20171030":{"date":"20171030","weather_id":{"fa":"01","fb":"01"},"week":"星期一","temperature":"11℃~18℃","weather":"多云","wind":"北风4-5 级"},"day_20171031":{"date":"20171031","weather_id":{"fa":"01","fb":"01"},"week":"星期二","temperature":"13℃~22℃","weather":"多云","wind":"东北风3-4 级"}}
         * today : {"weather_id":{"fa":"01","fb":"01"},"week":"星期四","city":"杭州","dressing_index":"舒适","travel_index":"适宜","wash_index":"较不宜","comfort_index":"","exercise_index":"适宜","dressing_advice":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。","uv_index":"弱","drying_index":"","temperature":"13℃~23℃","weather":"多云","date_y":"2017年10月26日","wind":"东北风微风"}
         * sk : {"temp":"23","humidity":"48%","wind_direction":"东北风","time":"16:34","wind_strength":"2级"}
         */
        private FutureEntity future;
        private TodayEntity today;
        private SkEntity sk;

        public void setFuture(FutureEntity future) {
            this.future = future;
        }

        public void setToday(TodayEntity today) {
            this.today = today;
        }

        public void setSk(SkEntity sk) {
            this.sk = sk;
        }

        public FutureEntity getFuture() {
            return future;
        }

        public TodayEntity getToday() {
            return today;
        }

        public SkEntity getSk() {
            return sk;
        }

        public class FutureEntity {
            /**
             * day_20171101 : {"date":"20171101","weather_id":{"fa":"02","fb":"01"},"week":"星期三","temperature":"12℃~21℃","weather":"阴转多云","wind":"北风3-4 级"}
             * day_20171027 : {"date":"20171027","weather_id":{"fa":"01","fb":"01"},"week":"星期五","temperature":"13℃~23℃","weather":"多云","wind":"东风3-4 级"}
             * day_20171026 : {"date":"20171026","weather_id":{"fa":"01","fb":"01"},"week":"星期四","temperature":"13℃~23℃","weather":"多云","wind":"东北风微风"}
             * day_20171029 : {"date":"20171029","weather_id":{"fa":"02","fb":"01"},"week":"星期日","temperature":"12℃~21℃","weather":"阴转多云","wind":"北风3-4 级"}
             * day_20171028 : {"date":"20171028","weather_id":{"fa":"01","fb":"01"},"week":"星期六","temperature":"13℃~22℃","weather":"多云","wind":"东北风3-4 级"}
             * day_20171030 : {"date":"20171030","weather_id":{"fa":"01","fb":"01"},"week":"星期一","temperature":"11℃~18℃","weather":"多云","wind":"北风4-5 级"}
             * day_20171031 : {"date":"20171031","weather_id":{"fa":"01","fb":"01"},"week":"星期二","temperature":"13℃~22℃","weather":"多云","wind":"东北风3-4 级"}
             */
            private Day_20171101Entity day_20171101;
            private Day_20171027Entity day_20171027;
            private Day_20171026Entity day_20171026;
            private Day_20171029Entity day_20171029;
            private Day_20171028Entity day_20171028;
            private Day_20171030Entity day_20171030;
            private Day_20171031Entity day_20171031;

            public void setDay_20171101(Day_20171101Entity day_20171101) {
                this.day_20171101 = day_20171101;
            }

            public void setDay_20171027(Day_20171027Entity day_20171027) {
                this.day_20171027 = day_20171027;
            }

            public void setDay_20171026(Day_20171026Entity day_20171026) {
                this.day_20171026 = day_20171026;
            }

            public void setDay_20171029(Day_20171029Entity day_20171029) {
                this.day_20171029 = day_20171029;
            }

            public void setDay_20171028(Day_20171028Entity day_20171028) {
                this.day_20171028 = day_20171028;
            }

            public void setDay_20171030(Day_20171030Entity day_20171030) {
                this.day_20171030 = day_20171030;
            }

            public void setDay_20171031(Day_20171031Entity day_20171031) {
                this.day_20171031 = day_20171031;
            }

            public Day_20171101Entity getDay_20171101() {
                return day_20171101;
            }

            public Day_20171027Entity getDay_20171027() {
                return day_20171027;
            }

            public Day_20171026Entity getDay_20171026() {
                return day_20171026;
            }

            public Day_20171029Entity getDay_20171029() {
                return day_20171029;
            }

            public Day_20171028Entity getDay_20171028() {
                return day_20171028;
            }

            public Day_20171030Entity getDay_20171030() {
                return day_20171030;
            }

            public Day_20171031Entity getDay_20171031() {
                return day_20171031;
            }

            public class Day_20171101Entity {
                /**
                 * date : 20171101
                 * weather_id : {"fa":"02","fb":"01"}
                 * week : 星期三
                 * temperature : 12℃~21℃
                 * weather : 阴转多云
                 * wind : 北风3-4 级
                 */
                private String date;
                private Weather_idEntity weather_id;
                private String week;
                private String temperature;
                private String weather;
                private String wind;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setWeather_id(Weather_idEntity weather_id) {
                    this.weather_id = weather_id;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getDate() {
                    return date;
                }

                public Weather_idEntity getWeather_id() {
                    return weather_id;
                }

                public String getWeek() {
                    return week;
                }

                public String getTemperature() {
                    return temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public String getWind() {
                    return wind;
                }

                public class Weather_idEntity {
                    /**
                     * fa : 02
                     * fb : 01
                     */
                    private String fa;
                    private String fb;

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }

                    public String getFa() {
                        return fa;
                    }

                    public String getFb() {
                        return fb;
                    }
                }
            }

            public class Day_20171027Entity {
                /**
                 * date : 20171027
                 * weather_id : {"fa":"01","fb":"01"}
                 * week : 星期五
                 * temperature : 13℃~23℃
                 * weather : 多云
                 * wind : 东风3-4 级
                 */
                private String date;
                private Weather_idEntity weather_id;
                private String week;
                private String temperature;
                private String weather;
                private String wind;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setWeather_id(Weather_idEntity weather_id) {
                    this.weather_id = weather_id;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getDate() {
                    return date;
                }

                public Weather_idEntity getWeather_id() {
                    return weather_id;
                }

                public String getWeek() {
                    return week;
                }

                public String getTemperature() {
                    return temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public String getWind() {
                    return wind;
                }

                public class Weather_idEntity {
                    /**
                     * fa : 01
                     * fb : 01
                     */
                    private String fa;
                    private String fb;

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }

                    public String getFa() {
                        return fa;
                    }

                    public String getFb() {
                        return fb;
                    }
                }
            }

            public class Day_20171026Entity {
                /**
                 * date : 20171026
                 * weather_id : {"fa":"01","fb":"01"}
                 * week : 星期四
                 * temperature : 13℃~23℃
                 * weather : 多云
                 * wind : 东北风微风
                 */
                private String date;
                private Weather_idEntity weather_id;
                private String week;
                private String temperature;
                private String weather;
                private String wind;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setWeather_id(Weather_idEntity weather_id) {
                    this.weather_id = weather_id;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getDate() {
                    return date;
                }

                public Weather_idEntity getWeather_id() {
                    return weather_id;
                }

                public String getWeek() {
                    return week;
                }

                public String getTemperature() {
                    return temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public String getWind() {
                    return wind;
                }

                public class Weather_idEntity {
                    /**
                     * fa : 01
                     * fb : 01
                     */
                    private String fa;
                    private String fb;

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }

                    public String getFa() {
                        return fa;
                    }

                    public String getFb() {
                        return fb;
                    }
                }
            }

            public class Day_20171029Entity {
                /**
                 * date : 20171029
                 * weather_id : {"fa":"02","fb":"01"}
                 * week : 星期日
                 * temperature : 12℃~21℃
                 * weather : 阴转多云
                 * wind : 北风3-4 级
                 */
                private String date;
                private Weather_idEntity weather_id;
                private String week;
                private String temperature;
                private String weather;
                private String wind;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setWeather_id(Weather_idEntity weather_id) {
                    this.weather_id = weather_id;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getDate() {
                    return date;
                }

                public Weather_idEntity getWeather_id() {
                    return weather_id;
                }

                public String getWeek() {
                    return week;
                }

                public String getTemperature() {
                    return temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public String getWind() {
                    return wind;
                }

                public class Weather_idEntity {
                    /**
                     * fa : 02
                     * fb : 01
                     */
                    private String fa;
                    private String fb;

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }

                    public String getFa() {
                        return fa;
                    }

                    public String getFb() {
                        return fb;
                    }
                }
            }

            public class Day_20171028Entity {
                /**
                 * date : 20171028
                 * weather_id : {"fa":"01","fb":"01"}
                 * week : 星期六
                 * temperature : 13℃~22℃
                 * weather : 多云
                 * wind : 东北风3-4 级
                 */
                private String date;
                private Weather_idEntity weather_id;
                private String week;
                private String temperature;
                private String weather;
                private String wind;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setWeather_id(Weather_idEntity weather_id) {
                    this.weather_id = weather_id;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getDate() {
                    return date;
                }

                public Weather_idEntity getWeather_id() {
                    return weather_id;
                }

                public String getWeek() {
                    return week;
                }

                public String getTemperature() {
                    return temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public String getWind() {
                    return wind;
                }

                public class Weather_idEntity {
                    /**
                     * fa : 01
                     * fb : 01
                     */
                    private String fa;
                    private String fb;

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }

                    public String getFa() {
                        return fa;
                    }

                    public String getFb() {
                        return fb;
                    }
                }
            }

            public class Day_20171030Entity {
                /**
                 * date : 20171030
                 * weather_id : {"fa":"01","fb":"01"}
                 * week : 星期一
                 * temperature : 11℃~18℃
                 * weather : 多云
                 * wind : 北风4-5 级
                 */
                private String date;
                private Weather_idEntity weather_id;
                private String week;
                private String temperature;
                private String weather;
                private String wind;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setWeather_id(Weather_idEntity weather_id) {
                    this.weather_id = weather_id;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getDate() {
                    return date;
                }

                public Weather_idEntity getWeather_id() {
                    return weather_id;
                }

                public String getWeek() {
                    return week;
                }

                public String getTemperature() {
                    return temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public String getWind() {
                    return wind;
                }

                public class Weather_idEntity {
                    /**
                     * fa : 01
                     * fb : 01
                     */
                    private String fa;
                    private String fb;

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }

                    public String getFa() {
                        return fa;
                    }

                    public String getFb() {
                        return fb;
                    }
                }
            }

            public class Day_20171031Entity {
                /**
                 * date : 20171031
                 * weather_id : {"fa":"01","fb":"01"}
                 * week : 星期二
                 * temperature : 13℃~22℃
                 * weather : 多云
                 * wind : 东北风3-4 级
                 */
                private String date;
                private Weather_idEntity weather_id;
                private String week;
                private String temperature;
                private String weather;
                private String wind;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setWeather_id(Weather_idEntity weather_id) {
                    this.weather_id = weather_id;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getDate() {
                    return date;
                }

                public Weather_idEntity getWeather_id() {
                    return weather_id;
                }

                public String getWeek() {
                    return week;
                }

                public String getTemperature() {
                    return temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public String getWind() {
                    return wind;
                }

                public class Weather_idEntity {
                    /**
                     * fa : 01
                     * fb : 01
                     */
                    private String fa;
                    private String fb;

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }

                    public String getFa() {
                        return fa;
                    }

                    public String getFb() {
                        return fb;
                    }
                }
            }
        }

        public class TodayEntity {
            /**
             * weather_id : {"fa":"01","fb":"01"}
             * week : 星期四
             * city : 杭州
             * dressing_index : 舒适
             * travel_index : 适宜
             * wash_index : 较不宜
             * comfort_index :
             * exercise_index : 适宜
             * dressing_advice : 建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。
             * uv_index : 弱
             * drying_index :
             * temperature : 13℃~23℃
             * weather : 多云
             * date_y : 2017年10月26日
             * wind : 东北风微风
             */
            private Weather_idEntity weather_id;
            private String week;
            private String city;
            private String dressing_index;
            private String travel_index;
            private String wash_index;
            private String comfort_index;
            private String exercise_index;
            private String dressing_advice;
            private String uv_index;
            private String drying_index;
            private String temperature;
            private String weather;
            private String date_y;
            private String wind;

            public void setWeather_id(Weather_idEntity weather_id) {
                this.weather_id = weather_id;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public Weather_idEntity getWeather_id() {
                return weather_id;
            }

            public String getWeek() {
                return week;
            }

            public String getCity() {
                return city;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public String getUv_index() {
                return uv_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public String getTemperature() {
                return temperature;
            }

            public String getWeather() {
                return weather;
            }

            public String getDate_y() {
                return date_y;
            }

            public String getWind() {
                return wind;
            }

            public class Weather_idEntity {
                /**
                 * fa : 01
                 * fb : 01
                 */
                private String fa;
                private String fb;

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }

                public String getFa() {
                    return fa;
                }

                public String getFb() {
                    return fb;
                }
            }
        }

        public class SkEntity {
            /**
             * temp : 23
             * humidity : 48%
             * wind_direction : 东北风
             * time : 16:34
             * wind_strength : 2级
             */
            private String temp;
            private String humidity;
            private String wind_direction;
            private String time;
            private String wind_strength;

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public String getTemp() {
                return temp;
            }

            public String getHumidity() {
                return humidity;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public String getTime() {
                return time;
            }

            public String getWind_strength() {
                return wind_strength;
            }
        }
    }
}
