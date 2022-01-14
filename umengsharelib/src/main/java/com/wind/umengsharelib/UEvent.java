package com.wind.umengsharelib;

import android.content.Context;

import com.umeng.analytics.MobclickAgent;

/**
 * Created By wind
 * on 2019-12-05
 */
public class UEvent {

    //分流页
    public static class Start {

        private static final String PREFIX = "start_";
        public static final String USER__CLICK = PREFIX + "user_click";
        public static final String LOGIN__CLICK = PREFIX + "login_click";
        //闪验其他登录
        public static final String OTHER_LOGIN__CLICK = PREFIX + "other_login_click";
        //闪验登录遇到问题
        public static final String LOGIN_PROBLEM_CLICK = PREFIX + "login_problem_click";
    }

    //活动弹窗
    public static class Huodong {

        private static final String PREFIX = "huodong_";
        //活动弹窗点击量
        public static final String USER_CLICK = PREFIX + "user_click";
        //活动弹窗更多点击了
        public static final String USER_MORE_CLICK = PREFIX + "user_more_click";

        //弹窗活动点击
        public static final String USER_DIALOG_CLICK = PREFIX + "user_dialog_click";
        //列表活动点击
        public static final String USER_LIST_CLICK = PREFIX + "user_list_click";
        //动态banner点击
        public static final String USER_DYNAMIC_CLICK = PREFIX + "user_dynamic_click";
        //直播banner活动
        public static final String USER_LIVE_CLICK = PREFIX + "user_live_click";
    }

    //搜索页面
    public static class Search {

        private static final String PREFIX = "search_";
        //搜索【确定】按钮点击量
        public static final String USER_SURE_CLICK = PREFIX + "user_usre_click";
    }

    //置顶
    public static class Sticky {

        private static final String PREFIX = "sticky_";
        //首页-置顶购买-访问量
        public static final String HOME_GOBUY_CLICK = PREFIX + "home_gobuy_click";
    }


    //小火箭
    public static class Rocket {

        private static final String PREFIX = "rocket_";

        //【火箭图标】点击量   首页图片
        public static final String USER_ICON_CLICK = PREFIX + "user_icon_click";
        //【购买小火箭】按钮点击量  弹窗
        public static final String USER_BUY_CLICK = PREFIX + "user_buy_click";
        //小火箭【置顶推荐】按钮点击量  弹窗
        public static final String USER_STICKY_CLICK = PREFIX + "user_sticky_click";
        //小火箭【去充值】按钮点击量  弹窗
        public static final String USER_RECHARGE_CLICK = PREFIX + "user_recharge_click";
    }

    //首页 专区
    public static class Zone {

        private static final String PREFIX = "zone_";
        //【精选专区】按钮点击量
        public static final String ZONE_FEATURED_SHOW = PREFIX + "zone_featured_show";
        //【优质推荐】钮点击量
        public static final String ZONE_HIGH_QUALITY_SHOW = PREFIX + "zone_high_quality_show";
        //【在线专区】钮点击量
        public static final String ZONE_ONLINE_SHOW = PREFIX + "zone_online_show";
        //【新人专区】钮点击量
        public static final String ZONE_NEW_SHOW = PREFIX + "zone_new_show";
        //【高颜值专区】钮点击量
        public static final String ZONE_HIGH_VALUE_SHOW = PREFIX + "zone_high_value_show";
        //【海归专区】钮点击量
        public static final String ZONE_RETURNEE_SHOW = PREFIX + "zone_returnee_show";
        //【名校专区】钮点击量
        public static final String ZONE_FAMOUS_SCHOOL_SHOW = PREFIX + "zone_famous_school_show";
        //【阿里巴巴专区】钮点击量
        public static final String ZONE_ALIBABA_SHOW = PREFIX + "zone_alibaba_show";
    }

    //动态界面
    public static class Dynamic {

        private static final String PREFIX = "dynamic_";
        //话题按钮点击量
        public static final String USER_TOPIC_CLICK = PREFIX + "user_topic_click";
        //动态【发布】按钮点击量
        public static final String USER_SEND_CLICK = PREFIX + "user_send_click";
        //动态【筛选】按钮点击量
        public static final String USER_SEARCH_CLICK = PREFIX + "user_search_click";
        //动态【点赞】按钮点击量
        public static final String USER_ZAN_CLICK = PREFIX + "user_zan_click";
        //动态【评论】按钮点击量
        public static final String USER_COMMENT_CLICK = PREFIX + "user_comment_click";

        //MarryUClub访问量
        public static final String MARRYUCLUB_CLICK = PREFIX + "marryuclub_click";
        //动态【置顶购买】页面访问量
        public static final String STICKY_GOBUY_CLICK = PREFIX + "sticky_gobuy_click";

        //动态【匿名动态提醒栏】点击量
        public static final String ANONYMOUS_NOTE_CLICK = PREFIX + "anonymous_note_click";
        //动态【评论举报】按钮点击量
        public static final String COMMENT_REPORT_CLICK = PREFIX + "comment_report_click";
        //动态【匿名评论身份】点击量
        public static final String ANONYMOUS_CHANGE_IDENTITY = PREFIX + "anonymous_change_identity";

        //动态【发布身份】按钮点击量
        public static final String ANONYMOUS_IDENTITY_CLICK = PREFIX + "anonymous_identity_click";
        //动态【切换匿名称号】按钮点击量
        public static final String ANONYMOUS_CHANGE_IDENTITY_CLICK = PREFIX + "anonymous_change_identity_click";
        //动态【【加好友】按钮点击量 动态-加好友btn
        public static final String ANONYMOUS_ADD_FRIEND_CLICK = PREFIX + "add_friend_click";
    }

    //Ta人主页
    public static class Ta {

        private static final String PREFIX = "ta_";
        //心动按钮点击量
        public static final String USER_LIKE_CLICK = PREFIX + "user_like_click";
        //TA人主页【动态】点击量
        public static final String USER_DYNAMIC_CLICK = PREFIX + "user_dynamic_click";
        //TA人主页【交换微信】点击量
        public static final String USER_WX_CLICK = PREFIX + "user_wx_click";
        //TA人主页【帮我约TA】点击量
        public static final String USER_APPOINTMENT_CLICK = PREFIX + "user_appointment_click";
        //TA人主页【礼物】点击量
        public static final String USER_GIFT_CLICK = PREFIX + "user_gift_click";
        //TA人主页【聊天】点击量
        public static final String USER_CHAT_CLICK = PREFIX + "user_chat_click";
        //上线提醒点击量
        public static final String USER_ONLINE_NOTIFICATION_CLICK = PREFIX + "user_online_notification_click";

    }

    //实名认证
    public static class Verified {

        private static final String PREFIX = "verified_";
        //【人工审核】按钮点击量
        public static final String USER_MANUAL_REVIEW_CLICK = PREFIX + "user_manual_review_click";
        //【立即认证】按钮点击量
        public static final String USER_NOW_RZ_CLICK = PREFIX + "user_now_rz_click";

    }

//  MobclickAgent.onEvent(getContext(), "dynamic_sticky", UEvent.Dynamic.STICKY_GOBUY_CLICK);
//  MobclickAgent.onEvent(getContext(), "zone", titlesList.get(tab.getPosition()));


    public static class Login {
        private static final String PREFIX = "login_";
        public static final String CODE_LOGIN = PREFIX + "sms_code_login";
        public static final String PWD_LOGIN = PREFIX + "pwd_login";

    }

    public static class Info {
        private static final String PREFIX = "info_";
        public static final String COMMIT_CLICK = PREFIX + "commit_click";
    }


    public static class Msg {
        private static final String PREFIX = "msg_";
        public static final String MSG_SETTINGS_CLICK = PREFIX + "msg_settings_click";
        public static final String YUETA_CLICK = PREFIX + "yueta_click";
        public static final String LOVE_QUESTION_CLICK = PREFIX + "love_question_click";
        public static final String EXCHANGE_WX_CLICK = PREFIX + "exchange_wx_click";

        //点击扫码
        public static final String QRCODE_SCAN_CLICK = PREFIX + "qrcode_scan_click";
        public static final String QRCODE_LOGIN_CLICK = PREFIX + "qrcode_login_click";
        public static final String QRCODE_LOGIN_SUCCESS = PREFIX + "qrcode_login_success";
        //【立即加入】按钮触发点  聊天-立即加入认证触发点
        public static final String NOW_JOIN_CLICK = PREFIX + "now_join_click";

    }

    public static class Match {
        private static final String PREFIX = "match_";
        public static final String PIPEI_PAGE = PREFIX + "pipei_page";
        //匹配
        public static final String PIPEI_CLICK = PREFIX + "pipei_click";
        public static final String TEST_CLICK = PREFIX + "test_click";

        //U币开启
        public static final String U_OPEN_CLICK = PREFIX + "u_open_click";
        public static final String OP_LIKE_CLICK = PREFIX + "op_like_click";
        public static final String OP_CHAT_CLICK = PREFIX + "op_chat_click";


    }

    public static class Top {
        private static final String PREFIX = "top_";
        public static final String TOP_DAY_CLICK = PREFIX + "top_day_click";
    }

    public static class Vip {
        private static final String PREFIX = "vip_";

        public static final String VIP_OPEN = PREFIX + "vip_open";
        //续费
        public static final String VIP_CONTIUE = PREFIX + "vip_continue";


        private static final String PREFIX_FILTER = "vip_filter_";
        //高级筛选-工作生活地-开通VI
        public static final String REASON_VIP_ABODE = PREFIX_FILTER + "abode_vip";
        //高级筛选-户籍（老家）-开通
        public static final String REASON_VIP_NATIVE = PREFIX_FILTER + "native_vip";
        //高级筛选-学历-开通VIP
        public static final String REASON_VIP_DEGREE = PREFIX_FILTER + "degree_vip";
        //高级筛选-房产-开通VIP
        public static final String REASON_VIP_HOUSE = PREFIX_FILTER + "house_vip";
        //高级筛选-车辆-开通VIP
        public static final String REASON_VIP_CAR = PREFIX_FILTER + "car_vip";
        //高级筛选-星座-开通VIP
        public static final String REASON_VIP_CONSTELLATION = PREFIX_FILTER + "constellation_vip";
        //高级筛选-婚史-开通VIP
        public static final String REASON_VIP_MARRY = PREFIX_FILTER + "marry_vip";


        private static final String PREFIX_MSG = "vip_msg_";
        //消息-查看喜欢我-开通VIP
        public static final String REASON_VIP_LIKE = PREFIX_MSG + "like_vip";
        //消息-查看看过我-开通VIP
        public static final String REASON_VIP_VISIT = PREFIX_MSG + "visit_vip";
        //防骚扰设定-年龄-开通VIP
        public static final String REASON_VIP_MSG_SETTING_AGE = PREFIX_MSG + "setting_age_vip";
        //防骚扰设定-工作地-开通VIP
        public static final String REASON_VIP_MSG_SETTING_ABODE = PREFIX_MSG + "setting_abode_vip";
        //消息-接收消息按钮
        public static final String REASON_VIP_MSG_SETTING_RECEIVE = PREFIX_MSG + "setting_receive_vip";
        //聊天列表-开通VIP
        public static final String REASON_VIP_LOOK_MSG = PREFIX_MSG + "look_msg_vip";


        private static final String PREFIX_TA = "vip_ta_";
        //TA人主页-查看ta人在线
        public static final String REASON_VIP_LOOK_ONLINE = PREFIX_TA + "look_online_vip";
        //TA人主页-上线提醒-开通VIP
        public static final String REASON_VIP_ONLINE_NOTIFICATION = PREFIX_TA + "online_notification_vip";
        //TA人主页-形象视频-开通VIP
        public static final String REASON_VIP_VIDEO = PREFIX_TA + "video_vip";
        //TA人主页-交换微信-开通VIP
        public static final String REASON_VIP_WECHAT = PREFIX_TA + "wechat_vip";
        //TA人主页-隐身访问-开通VIP
        public static final String REASON_VIP_TRACELESS = PREFIX_TA + "traceless_vip";
        //TA人主页-聊天-开通VIP
        public static final String REASON_VIP_CHAT = PREFIX_TA + "chat_vip";

        private static final String PREFIX_DYNAMIC = "vip_dynamic_";
        //动态-屏蔽他人-开通VIP
        public static final String REASON_VIP_DYNAMIC_SHIELD = PREFIX_DYNAMIC + "shield_vip";

    }


    public static class OnlineMatch {
        private static final String PREFIX = "onlinematch_";
        //在线匹配入口点击
        public static final String ONLINE_ENTRANCE_CLICK = PREFIX + "online_entrance_click";
        //预约
        public static final String ONLINE_APPOINTTMENT_CLICK = PREFIX + "online_appointment_click";
        //开始匹配
        public static final String ONLINE_START_MATCHING_CLICK = PREFIX + "online_start_matching_click";
        //公开身份
        public static final String ONLINE_OPEN_INFO_CLICK = PREFIX + "online_open_info_click";

        //语音开始匹配
        public static final String VOICE_START_MATCHING_CLICK = PREFIX + "voice_start_matching_click";
        //语音公开身份
        public static final String VOICE_OPEN_INFO_CLICK = PREFIX + "voice_open_info_click";

    }

    public static class Live {
        private static final String PREFIX = "live_";
        //聊天-加好友btn【加好友】按钮点击量
        public static final String LIVE_CHAT_ADD_FRIEND = PREFIX + "chat_add_friend";
        //加好友 直播间-加好友btn（包括资料卡、他人主页、C位）
        public static final String LIVE_ADD_FRIEND = PREFIX + "add_friend";
        //直播btn 【直播】icon按钮点击量
        public static final String LIVE_START = PREFIX + "start";
        //粉丝团btn【粉丝团】按钮点击量
        public static final String LIVE_GROUP_FANS = PREFIX + "group_fans";
        //粉丝福利btn（不需要区分3个福利点击量）【粉丝福利】按钮点击量
        public static final String LIVE_FAN_BENEFITS = PREFIX + "fan_benefits";
        //直播-购物车btn【购物车】按钮点击量
        public static final String LIVE_SHOPPING_CART = PREFIX + "shopping_cart";
        //直播-表白卡btn【表白卡】按钮点击量
        public static final String LIVE_CONFESSION_CARD = PREFIX + "confession_card";

        //直播-分享btn【分享】按钮点击量
        public static final String LIVE_SHARE = PREFIX + "share";
        //心动弹窗-心动btn【心动】按钮点击量
        public static final String LIVE_HEART_CLICK = PREFIX + "heart_click";
        //消息-直播弹窗btn【直播弹窗】按钮点击量
        public static final String LIVE_MESSAGE = PREFIX + "message";
        //首页-置顶直播btn【置顶直播】按钮点击量
        public static final String LIVE_TOP_USER = PREFIX + "top_user";
        //上麦卡-立即购买btn【立即购买】按钮点击量
        public static final String LIVE_BUY_SM_CARD = PREFIX + "buy_sm_card";
        //倒计时弹窗-购买btn【购买】按钮点击量
        public static final String LIVE_BUY_COUNTDOWN = PREFIX + "buy_countdown";
        //签到
        public static final String LIVE_CLOCK_IN = PREFIX + "clock_in";
        //涂鸦
        public static final String LIVE_GRAFFITI_BTN = PREFIX + "graffiti_btn";
        //弹窗进房看看
        public static final String LIVE_RECOMMAND = PREFIX + "recommand";

        /////////////////////////////////////////////////////////////////////


    }

    public static class Authfee {
        private static final String PREFIX = "authfee_";
        //【立即加入】按钮点击量  认证弹窗-立即加入btn
        public static final String AUTHFEE_DIALOG_BTN_JOIN = PREFIX + "dialog_btn_join";

        //首页-筛选触发  认证弹窗-首页筛选触发
        public static final String AUTHFEE_HOME_SPOUSE_CRITERIA = PREFIX + "home_spouse_criteria";
        //首页-查看其它专区  认证弹窗-首页专区触发
        public static final String AUTHFEE_HOME_OTHER_TAB = PREFIX + "home_other_tab";
        //首页-聊天  认证弹窗-首页聊天触发
        public static final String AUTHFEE_HOME_CHAT = PREFIX + "home_chat";
        //首页-心动  认证弹窗-首页心动触发
        public static final String AUTHFEE_HOME_LIKE = PREFIX + "home_like";

        //动态-发布  认证弹窗-动态发布触发
        public static final String AUTHFEE_TRENDS_RELEASE = PREFIX + "trends_release";
        //动态-评论 认证弹窗-动态评论触发
        public static final String AUTHFEE_TRENDS_COMMENT = PREFIX + "trends_comment";
        //动态-点赞 认证弹窗-动态点赞触发
        public static final String AUTHFEE_TRENDS_ZAN = PREFIX + "trends_zan";
        //动态-不想看TA 认证弹窗-动态不想看TA触发
        public static final String AUTHFEE_TRENDS_NO_SEE_TA = PREFIX + "trends_no_see_ta";

        //直播-聊天 认证弹窗-直播聊天触发
        public static final String AUTHFEE_LIVE_CHAT = PREFIX + "live_chat";
        //直播-申请上麦  认证弹窗-直播申请上麦触发
        public static final String AUTHFEE_LIVE_SM = PREFIX + "live_sm";
        //直播-C位心动  认证弹窗-直播C位心动触发
        public static final String AUTHFEE_LIVE_C_LIKE = PREFIX + "live_c_like";
        //直播-同意上麦 认证弹窗-直播同意上麦触发
        public static final String AUTHFEE_LIVE_AGREE_SM = PREFIX + "live_agree_sm";

        //消息-聊天  认证弹窗-消息聊天触发
        public static final String AUTHFEE_MSG_CHAT = PREFIX + "msg_chat";

        //他人主页-心动  认证弹窗-他人主页心动触发
        public static final String AUTHFEE_USER_DETAIL_LIKE = PREFIX + "user_detail_like";
        //他人主页-聊天 认证弹窗-他人主页聊天触发
        public static final String AUTHFEE_USER_DETAIL_CHAT = PREFIX + "user_detail_chat";

        //匹配-心动  认证弹窗-匹配心动触发
        public static final String AUTHFEE_MATCH_LIKE = PREFIX + "match_like";
        //匹配-打招呼  认证弹窗-匹配打招呼触发
        public static final String AUTHFEE_MATCH_HI = PREFIX + "match_hi";
    }

    public static class SignIn {
        private static final String PREFIX = "signIn_";
        //每日任务-访问他人主页
        public static final String SIGNIN_VISIT_OTHERS_HOMEPAGE = PREFIX + "visit_others_homepage";
        //每日任务-心动他人
        public static final String SIGNIN_HEART_OTHER = PREFIX + "heart_other";
        //每日任务-发起聊天
        public static final String SIGNIN_GO_CHAT = PREFIX + "go_chat";
        //每日任务-发布动态
        public static final String SIGNIN_RELEASE_TRENDS = PREFIX + "release_trends";
        //每日任务-动态评论
        public static final String SIGNIN_COMMENT_TRENDS = PREFIX + "comment_trends";
    }

    public static class V590 {
        private static final String PREFIX = "v590_";
        //认证触发-心动btn
        public static final String LIVE_AUTHFEE_BY_LIKE = PREFIX + "authfee_by_like";
        //认证触发-上麦弹窗-同意btn
        public static final String LIVE_AUTHFEE_BY_UPMIC = PREFIX + "authfee_by_upmic";
        //认证触发-申请上麦btn
        public static final String LIVE_AUTHFEE_BY_APPLY = PREFIX + "authfee_by_apply";

        //认证触发-聊天室聊天btn
        public static final String LIVE_AUTHFEE_BY_LIVE_CHAT = PREFIX + "authfee_by_livechat";

        //【初级福袋】按钮点击量 礼物-初级福袋btn
        public static final String LIVE_LUCKY_BAG_1_CLICK = PREFIX + "lucky_bag_1_click";
        //礼物-中级福袋btn
        public static final String LIVE_LUCKY_BAG_2_CLICK = PREFIX + "lucky_bag_2_click";
        // 礼物-高级福袋btn
        public static final String LIVE_LUCKY_BAG_3_CLICK = PREFIX + "lucky_bag_3_click";

        //直播-每日任务btn
        public static final String LIVE_DAILY_TASK_CLICK = PREFIX + "daily_task_click";


        //首页-立即加入认证btn
        public static final String MAIN_AUTHFEE_CLICK = PREFIX + "main_authfee_click";
        //相册-解锁查看认证btn
        public static final String TA_ALBUM_AUTHFEE_CLICK = PREFIX + "ta_album_authfee_click";

        //个人中心-认证权益btn
        public static final String MINE_AUTHFEE_CLICK = PREFIX + "mine_authfee_click";

        //个人中心-免费使用btn
        public static final String MINE_FREE_CLICK = PREFIX + "mine_free_click";

        //个人中心-续费btn
        public static final String MINE_RENEW_CLICK = PREFIX + "mine_renew_click";


        //系统通知-实名认证
        public static final String P2P_NOTIFICATION_REAL_CERT_CLICK = PREFIX + "p2p_notification_real_cert_click";
        //系统通知-直播推送
        public static final String P2P_NOTIFICATION_LIVE_CLICK = PREFIX + "p2p_notification_live_click";


        //个人中心-热门炸弹btn
        public static final String MINE_HOT_BOMB_CLICK = PREFIX + "mine_hot_bomb_click";
        //个人中心-同城置顶btn
        public static final String MINE_CITY_TOP_CLICK = PREFIX + "mine_city_top_click";
        //个人中心-私人婚恋btn
        public static final String MINE_PRIVACY_SERVICE_CLICK = PREFIX + "mine_privacy_service_click";

        //个人中心-婚恋管家btn
        public static final String MINE_MARRIAGE_BUTLER_CLICK = PREFIX + "mine_marriage_butler_click";
        //脱单道具-头像装饰btn
        public static final String MINE_AVATAR_DECORATION_CLICK = PREFIX + "mine_avatar_decoration_click";
        //个人中心-动态置顶btn
        public static final String MINE_TREND_TOP_CLICK = PREFIX + "mine_trend_top_click";

        //道具商城-热门炸弹btn
        public static final String DAOJU_HOT_BOMB_CLICK = PREFIX + "daoju_hot_bomb_click";
        //道具商城-同城置顶btn
        public static final String DAOJU_CITY_TOP_CLICK = PREFIX + "daoju_city_top_click";
        //道具商城-私人婚恋btn
        public static final String DAOJU_PRIVACY_SERVICE_CLICK = PREFIX + "daoju_privacy_service_click";

        //道具商城-婚恋管家btn
        public static final String DAOJU_MARRIAGE_BUTLER_CLICK = PREFIX + "daoju_marriage_butler_click";
        //道具商城-头像装饰btn
        public static final String DAOJU_AVATAR_DECORATION_CLICK = PREFIX + "daoju_avatar_decoration_click";
        //道具商城-动态置顶btn
        public static final String DAOJU_TREND_TOP_CLICK = PREFIX + "daoju_trend_top_click";

        //婚恋管家-立享服务btn
        public static final String NOW_GO_BUY_SERVICE_CLICK = PREFIX + "now_go_buy_service_click";
    }

    public static class V5110 {
        private static final String PREFIX = "v5110_";

        //消息-超级推荐btn
        public static final String MSG_SUPER_RECOMMEND_CLICK = PREFIX + "msg_super_recommend_click";

        //聊天-超级提醒悬浮btn
        public static final String CHAT_SUPER_REMIND_SUSPENSION_CLICK = PREFIX + "chat_super_remind_suspension_click";
        //聊天-超级提醒btn
        public static final String CHAT_SUPER_REMIND_CLICK = PREFIX + "chat_super_remind_click";
        //超级提醒弹窗【去使用】按钮btn
        public static final String POP_SUPER_REMIND_DO_USE_CLICK = PREFIX + "pop_super_remind_do_use_click";
        //超级提醒弹窗【去充值】按钮btn
        public static final String POP_CHAT_SUPER_DO_RECHARGE_CLICK = PREFIX + "pop_chat_super_do_recharge_click";
        //超级提醒H5-【充值】按钮btn
        public static final String H5_SUPER_REMIND_DO_RECHARGE_CLICK = PREFIX + "h5_super_remind_do_recharge_click";
        //超级提醒-【我也要设置】按钮btn
        public static final String CHAT_SUPER_DO_SET_CLICK = PREFIX + "chat_super_remind_do_set_click";
        //聊天-【置顶】按钮btn
        public static final String CHAT_DO_TOP_CLICK = PREFIX + "chat_do_top_click";

        //匹配-【脱单道具】按钮btn
        public static final String MATCH_TUODAN_PROPS_CLICK = PREFIX + "match_tuodan_props_click";
        //匹配-【每日匹配】按钮btn
        public static final String MATCH_EVERY_DAY_CLICK = PREFIX + "match_every_day_click";

        //匹配-【灵魂测试】按钮btn
        public static final String MATCH_SOUL_TEST_CLICK = PREFIX + "match_soul_test_click";
        //匹配-【在线匹配】按钮btn
        public static final String MATCH_BY_ONLINE_CLICK = PREFIX + "match_by_online_click";
        //匹配-【语音匹配】按钮btn
        public static final String MATCH_BY_VOICE_CLICK = PREFIX + "match_by_voice_click";

        //首页-【banner】按钮btn
        public static final String HOME_BANNER_CLICK = PREFIX + "home_banner_click";
        //道具商城-【超级提醒】按钮btn
        public static final String DAOJU_SUPER_REMIND_CLICK = PREFIX + "daoju_super_remind_click";
        //脱单道具-【超级提醒】按钮btn
        public static final String USER_SUPER_REMIND_CLICK = PREFIX + "home_super_remind_click";

        //直播-【打招呼】认证触发
        public static final String LIVE_GREET_CLICK = PREFIX + "live_greet_click";
        //首页-【小火箭】认证触发
        public static final String HOME_LITTLE_ROCKET_CLICK = PREFIX + "home_little_rocket_click";
        //动态-【参与话题】认证触发
        public static final String TREND_PARTICIPATE_IN_TOPICS = PREFIX + "trend_participate_in_topics";
    }


    public static class V5120 {
        private static final String PREFIX = "v5120_";

        //最新动态-同城筛选btn
        public static final String CITY_FILTER = PREFIX + "city_filter";
        //最新动态-异性筛选btn
        public static final String GENDER_FILTER = PREFIX + "gender_filter";

        //动态-视频-页面访问量
        public static final String VIDEO_PAGE_VISIT_COUNT = PREFIX + "video_page_visit_count";

        //动态-发布视频btn
        public static final String PUBLISH_VIDEO_BTN = PREFIX + "publish_video_btn";
        //认证费-发布视频-触发
        public static final String AUTH_FEE_BY_PUBLISH_VIDEO = PREFIX + "auth_fee_by_publish_video";

        //每日任务-发布视频动态btn
        public static final String DAILY_TASK_PUBLISH_VIDEO = PREFIX + "daily_task_publish_video";

        //直播-心愿单btn
        public static final String LIVE_WISH_CLICK = PREFIX + "live_wish_click";

        //C位心愿-悬浮窗btn
        public static final String LIVE_WISH_IN_C_CLICK = PREFIX + "live_wish_in_c_click";

        //礼物弹窗-心愿单btn
        public static final String LIVE_WISH_IN_GIFT_CLICK = PREFIX + "live_wish_in_gift_click";

        //心愿单-助力btn
        public static final String LIVE_WISH_HELP_CLICK = PREFIX + "live_wish_help_click";

        //直播任务-创建心愿btn
        public static final String LIVE_TASK_CREATE_WISH = PREFIX + "live_task_create_wish";

        //直播任务-助力心愿btn
        public static final String LIVE_TASK_HELP_WISH = PREFIX + "live_task_help_wish";

        //会员中心-开通黄金会员btn
        public static final String VIP_CENTER_OPEN_GOLD = PREFIX + "vip_center_open_gold";

        //会员中心-升级黄金会员btn
        public static final String VIP_CENTER_UPGRADE_GOLD = PREFIX + "vip_center_upgrade_gold";

        //会员中心-黄金会员-续费btn
        public static final String VIP_CENTER_REPAY_GOLD = PREFIX + "vip_center_repay_gold";

        //会员弹窗-开通黄金会员btn
        public static final String VIP_DIALOG_OPEN_GOLD = PREFIX + "vip_dialog_open_gold";

        //会员弹窗-升级黄金会员btn
        public static final String VIP_DIALOG_UPGRADE_GOLD = PREFIX + "vip_dialog_upgrade_gold";


    }

    public static class V600 {
        private static final String PREFIX = "v600_";

        //实名认证弹窗-立即认证btn
        public static final String VERIFIED_GO_NOW_BTN = PREFIX + "verified_go_no_btn";

        //个人中心访问量
        public static final String USER_CENTER = PREFIX + "user_center";
        //个人中心-每日签到btn
        public static final String EVERY_DAY_DIGIN = PREFIX + "every_day_sigin";
        //个人中心-会员中心btn
        public static final String VIP_CENTER = PREFIX + "vip_center";
        //个人中心-U币中心btn
        public static final String U_CENTER = PREFIX + "u_center";
        //个人中心-实名认证btn
        public static final String REALY_NAME_RZ = PREFIX + "real_name_rz";
        //个人中心-我的认证btn
        public static final String MY_RZ_ALL = PREFIX + "my_rz_all";
        //个人中心-邀请单身好友btn
        public static final String INVITE_FIRENDS = PREFIX + "invite_friends";

        //首页-匹配btn
        public static final String HOME_MATCH_BTN = PREFIX + "home_match_btn";

        //首页-新手必看btn
        public static final String MUST_SEE_FOR_NOVICES = PREFIX + "must_see_for_novices";
        //他人主页-星座速配btn
        public static final String TA_CENTER_MATCH_BTN = PREFIX + "ta_center_match_btn";

    }

    public static class V610 {
        private static final String PREFIX = "v610_";
        //线下活动列表-访问量
        public static final String OFFLINE_LIST = PREFIX + "offline_list";
        //线下活动列表-我要带玩btn
        public static final String OFFLINE_DAIWAN_CLICK = PREFIX + "offline_daiwan_click";


        //动态-璀璨会员btn
        public static final String DYNAMIC_CUI_CAN_BTN = PREFIX + "dynamic_cui_can_btn";
        //动态-线下活动-查看全部btn
        public static final String DYNAMIC_OFFLINE_LOOKALL_BTN = PREFIX + "dynamic_offline_lookall_btn";

        //璀璨用户列表-访问量
        public static final String CUI_CAN_LIST = PREFIX + "cui_can_list";

        //璀璨用户列表-加入btn
        public static final String CUI_CAN_JOIN_BTN = PREFIX + "cui_can_join_btn";

        //璀璨会员弹窗-加入btn
        public static final String CUI_CAN_VIP_BTN = PREFIX + "cui_can_vip_btn";

        //璀璨会员介绍-访问量
        public static final String CUI_CAN_USER_DETAIL = PREFIX + "cui_can_user_detail";

        //璀璨会员介绍-申请btn
        public static final String CUI_CAN_USER_APPLY_BTN = PREFIX + "cui_can_user_apply_btn";
    }

    public static class V620 {
        private static final String PREFIX = "v620_";
        //黄金会员-我要开播btn
        public static final String GOLD_VIP_OPEN_LIVE_BTN = PREFIX + "gold_vip_open_live_btn";
        //        //直播-开播btn
//        public static final String OPEN_LIVE_BTN = PREFIX + "open_live_btn";
        //直播-发起PKbtn
        public static final String SEND_PK_INVITE_BTN = PREFIX + "send_pk_invite_btn";
        //直播空缺位-申请PKbtn
        public static final String LIVE_EMPTY_SEAT_APPLY_PK_BTN = PREFIX + "live_empty_seat_apply_pk_btn";
        //直播-底部操作栏PKbtn
        public static final String BUTTOM_PK_BTN = PREFIX + "buttom_pk_btn";
        //直播-切换话题btn
        public static final String CHENGE_PK_THEME_BTN = PREFIX + "change_pk_theme_btn";
        //切换话题弹窗-确定btn
        public static final String CHENGE_PK_THEME_SURE_BTN = PREFIX + "buttom_pk_sure_btn";
        //直播-关闭摄像头btn
        public static final String LIVE_CLOSE_CAMERA_BTN = PREFIX + "live_close_camera_btn";
        //PK弹窗-PK记录btn
        public static final String PK_RECORD_BTN = PREFIX + "pk_record_btn";
        //PK弹窗-一键邀请btn
        public static final String PK_FRIENDS_INVITE_ALL_BTN = PREFIX + "pk_frends_invite_all_btn";
        //PK弹窗-连线btn
        public static final String PK_FRIENDS_INVITE_BTN = PREFIX + "pk_friends_invite_btn";
        //直播聊天室-申请PKbtn
        public static final String LIVE_CHAT_APPLY_PK_BTN = PREFIX + "live_chat_apply_pk_btn";
        //直播-我要PKbtn
        public static final String LIVE_APPLY_PK_BTN = PREFIX + "live_apply_pk_btn";

        //PK-支持btn
        public static final String PK_STAND_BY_BTN = PREFIX + "pk_stand_by_btn";
        //PK-爆btn
        public static final String PK_BLEAT_BTN = PREFIX + "pk_bleat_btn";
        //PK继续弹窗-继续btn
        public static final String PK_CARRY_ON_BTN = PREFIX + "pk_carry_on_btn";
        //PK继续弹窗-不继续btn
        public static final String PK_NO_CARRY_ON_BTN = PREFIX + "pk_no_carry_on_btn";

        //首页-访问量
        public static final String ACCESS_HOME_NUM = PREFIX + "access_home_num";
        //动态-访问量
        public static final String ACCESS_TREND_NUM = PREFIX + "access_trend_num";
        //直播-访问量
        public static final String ACCESS_LIVE_NUM = PREFIX + "access_live_num";
        //消息-访问量
        public static final String ACCESS_MSG_NUM = PREFIX + "access_msg_num";
        //我的-访问量
        public static final String ACCESS_ME_NUM = PREFIX + "access_me_num";
    }

    public static class V630 {
        private static final String PREFIX = "v630_";

        //首页-签到btn
        public static final String HOME_SIGN_BTN = PREFIX + "home_sign_btn";
        //签到弹窗btn
        public static final String POP_SIGN_BTN = PREFIX + "pop_sign_btn";

        //新手任务-完善资料btn
        public static final String NOVICE_TASK_OVER_INFO_BTN = PREFIX + "novice_task_over_info_btn";
        //新手任务-真人认证btn
        public static final String NOVICE_TASK_REAL_PERSON_RZ_BTN = PREFIX + "novice_task_real_person_rz_btn";
        //新手任务-实名认证btn
        public static final String NOVICE_TASK_REAL_NAME_RZ_BTN = PREFIX + "novice_task_real_name_rz_btn";
        //新手任务-上传头像btn
        public static final String NOVICE_TASK_UPLOAD_HEADER_BTN = PREFIX + "novice_task_upload_header_btn";
        //新手任务-看直播btn
        public static final String NOVICE_TASK_SEE_LIVE_BTN = PREFIX + "novice_task_see_live_btn";

        //直播-开播btn
        public static final String START_LIVE_BTN = PREFIX + "start_live_btn";

        //直播动态-看直播btn
        public static final String TREND_SEE_LIVE_BTN = PREFIX + "trend_see_live_btn";
        //直播动态-直播图片btn
        public static final String TREND_LIVE_IMG_BTN = PREFIX + "trend_live_img_btn";
        //用户主页-置顶btn
        public static final String USER_DETAIL_TOP_BTN = PREFIX + "user_detail_top_btn";

        //恋爱铃-聊天btn
        public static final String LOVE_BELL_BTN = PREFIX + "love_bell_btn";
        //聊天-交友小贴士btn
        public static final String CHAT_ADD_FRIENDS_TIPS_BTN = PREFIX + "chat_add_friends_tips_btn";
        //通知提醒设置-开启btn
        public static final String NOTICE_REMINDER_OPEN_BTN = PREFIX + "notice_reminder_open_btn";
        //通知弹窗-开启btn
        public static final String POP_NOTICE_REMINDER_OPEN_BTN = PREFIX + "pop_notice_reminder_open_btn";

        //我的-banner按钮点击量
        public static final String ME_BANNER_BTN = PREFIX + "me_banner_btn";
        //他人主页-banner按钮点击量
        public static final String USER_DETAIL_BANNER_BTN = PREFIX + "user_detail_banner_btn";

    }

    public static class V640 {
        private static final String PREFIX = "v640_";

        //我的-优惠券btn
        public static final String ME_COUPON_BTN = PREFIX + "me_coupon_btn";
        //弹窗-领取优惠券btn
        public static final String DIALOG_RECEIVE_COUPON_BTN = PREFIX + "dialog_receive_coupon_btn";
        //会员购买弹窗-优惠券btn
        public static final String DIALOG_VIP_COUPON_BTN = PREFIX + "dialog_vip_coupon_btn";
        //会员购买弹窗-U币支付btn
        public static final String DIALOG_VIP_U_PAY_BTN = PREFIX + "dialog_vip_u_pay_btn";
        //会员中心-普通会员-U币支付btn
        public static final String CENTER_VIP_U_PAY_BTN = PREFIX + "center_vip_u_pay_btn";
        //会员中心-黄金会员-U币支付btn
        public static final String CENTER_GOLD_VIP_U_PAY_BTN = PREFIX + "center_gold_vip_u_pay_btn";
        //我的优惠券-使用btn
        public static final String MY_COUPON_USE_BTN = PREFIX + "my_coupon_use_btn";
        //首页-超级曝光标识btn
        public static final String HOME_SUPER_EXPOSURE_BTN = PREFIX + "home_super_exposure_btn";

        //同城置顶-U币支付btn
        public static final String SAME_CITY_USER_TOP_U_PAY_BTN = PREFIX + "same_city_user_top_u_pay_btn";
        //U币中心-脱单服务更多btn
        public static final String U_CENTER_MORE_SERVICE_BTN = PREFIX + "u_center_more_service_btn";
        //热门炸弹-页面访问量
        public static final String HOT_BOMB_VIEW = PREFIX + "hot_bomb_view";
        //        //聊天-帮我约ta（安卓）（已经添加过）
        public static final String CHAT_GO_ABOUT_HIM_BTN = PREFIX + "chat_go_about_him_btn";

        //消息-超级曝光领取btn
        public static final String MSG_SUPER_EXPOSURE_RECEIVE_BTN = PREFIX + "msg_super_exposure_receive_btn";
        //超级曝光-编辑资料页面访问量
        public static final String SUPER_EXPOSURE_EDITE_ACCESS = PREFIX + "super_exposure_edite_access";
        //超级曝光-购买页面访问量
        public static final String SUPER_EXPOSURE_BUY_VIEW = PREFIX + "super_exposure_buy_view";
        //超级曝光购买页面-立即购买btn
        public static final String SUPER_EXPOSURE_BUY_BTN = PREFIX + "super_exposure_buy_btn";
        //超级曝光购买页面-黄金会员btn
        public static final String SUPER_EXPOSURE_BUY_GOLD_BTN = PREFIX + "super_exposure_buy_gold_btn";
        //超级曝光赠送弹窗-领取btn
        public static final String DIALOG_SEND_SUPER_EXPOSURE_RECEIVE_BTN = PREFIX + "dialog_send_super_exposure_receive_btn";
        //消息-新朋友btn
        public static final String MSG_NEW_FRIENDS_BTN = PREFIX + "msg_new_friends_btn";
        //新朋友-全部已读btn
        public static final String MSG_NEW_FRIENDS_SET_ALL_READ_BTN = PREFIX + "msg_new_friends_set_all_read_btn";

    }

    public static class V641 {
        private static final String PREFIX = "v641_";

        //超级曝光-曝光续时按钮点击量
        public static final String CLICK_SUPER_EXPOSURE = PREFIX + "click_super_exposure";
        //超级曝光购买弹窗-兑换并使用按钮点击量
        public static final String CLICK_BUY_SUPER_EXPOSURE = PREFIX + "click_buy_super_exposure";


    }

    public static class V650 {
        private static final String PREFIX = "v650_";


        //首页-我要置顶btn
        public static final String HOME_ME_TOP_UP_BTN = PREFIX + "home_me_top_up_btn";
        //首页-换一批btn
        public static final String HOME_NEXT_CHANGE_BTN = PREFIX + "home_next_change_btn";
        //首页-撤回btn
        public static final String HOME_WITHDRAW_BTN = PREFIX + "home_withdraw_btn";
        //首页-一键打招呼btn
        public static final String HOME_ONE_CLICK_SAY_HI_BTN = PREFIX + "home_one_click_say_hi_btn";
        //首页-用户列表btn
        public static final String HOME_USER_LIST_BTN = PREFIX + "home_uer_list_btn";


        //倒计时弹窗-升级会员btn
        public static final String POP_NEXT_LAST_TIME_UP_VIP_BTN = PREFIX + "pop_next_last_time_up_vip_btn";
        //非会员撤回弹窗-升级会员btn
        public static final String POPO_NO_VIP_WITHDRAW_UP_VIP_BTN = PREFIX + "pop_no_vip_withdraw_up_vip_btn";
        //非会员撤回弹窗-U币支付btn
        public static final String POPO_NO_VIP_WITHDRAW_PAY_U_BTN = PREFIX + "pop_no_vip_withdraw_pay_u_btn";

        //会员撤回弹窗-U币支付btn
        public static final String POPO_VIP_WITHDRAW_PAY_U_BTN = PREFIX + "pop_vip_withdraw_pay_u_btn";
        //会员撤回弹窗-立即使用btn
        public static final String POPO_VIP_WITHDRAW_USE_BTN = PREFIX + "pop_vip_withdraw_USE_btn";

        //筛选-专区btn
        public static final String SEARCH_TAB_BTN = PREFIX + "search_tab_btn";

        //Ta人主页-超级喜欢btn
        public static final String USE_DETAIL_SUPER_LIKE_BTN = PREFIX + "use_detail_super_like_btn";

        //非会员超级喜欢-升级会员btn
        public static final String POP_NO_VIP_SUPER_LIKE_UP_VIP_BTN = PREFIX + "pop_no_vip_super_like_up_vip_btn";
        //非会员超级喜欢-U币支付btn
        public static final String POP_NO_VIP_SUPER_LIKE_PAY_U_BTN = PREFIX + "pop_no_vip_super_like_pay_u_btn";

        //会员超级喜欢-U币支付btn
        public static final String POP_VIP_SUPER_LIKE_PAY_U_BTN = PREFIX + "pop_vip_super_like_pay_u_btn";
        //会员超级喜欢-立即使用btn
        public static final String POP_VIP_SUPER_LIKE_USE_BTN = PREFIX + "pop_vip_super_like_use_btn";

        //单次聊天弹窗-升级会员btn
        public static final String POP_ONE_CHAT_UP_VIP_BTN = PREFIX + "pop_one_chat_up_vip_btn";
        //单次聊天弹窗-U币支付btn
        public static final String POP_ONE_CHAT_PAY_U_BTN = PREFIX + "pop_one_chat_pay_u_btn";

        //复制微信号码-会员触发量
        public static final String COPY_WEIXIN_BTN = PREFIX + "copy_weixin_btn";


    }

    public static class V652 {
        private static final String PREFIX = "v652_";


        //优惠券领取弹窗-【开启】btn
        public static final String COUPON_OPEN = PREFIX + "coupon_open";

        //非会员-单次解锁聊天弹窗访问量
        public static final String CHAT_LIMIT_DIALOG = PREFIX + "chat_limit_dialog";

        //会员-超级喜欢弹窗访问量
        public static final String VIP_SUPRELIKE_DIALOG = PREFIX + "vip_superlike_dialog";
        //非会员-超级喜欢弹窗访问量
        public static final String SUPRELIKE_DIALOG = PREFIX + "superlike_dialog";

        //会员购买弹窗-人民币支付btn
        public static final String VIP_PAY_WITH_RMB = PREFIX + "vip_pay_with_rmb";
    }

    public static class V660 {
        private static final String PREFIX = "v660_";

        //单次聊天弹窗-升级黄金btn
        public static final String VIP_CLICK_GOLD_VIP_BTN = PREFIX + "vip_click_gold_vip_btn";
        //普通会员-单次解锁btn
        public static final String VIP_CLICK_U_UNLOCK = PREFIX + "vip_click_u_unlock";
        //普通会员-单次聊天解锁访问量
        public static final String VIP_VIEW_UNLOCK_PAGE = PREFIX + "vip_view_unlock_page";
        //非会员-超级喜欢弹窗访问量
        public static final String VIEW_SUPERLIKE_DIALOG = PREFIX + "view_superlike_dialog";
        //会员-超级喜欢弹窗访问量
        public static final String VIP_VIEW_SUPERLIKE_DIALOG = PREFIX + "vip_view_superlike_dialog";

        //非会员-单次解锁聊天弹窗访问量
        public static final String VIEW_UNLOCK_PAGE = PREFIX + "view_unlock_page";


    }

    public static class V670 {
        private static final String PREFIX = "v670_";

        //聊天-礼物btn
        public static final String CHAT_GIFT_BTN = PREFIX + "chat_gift_btn";
        //聊天-实名认证提醒按钮btn
        public static final String CHAT_REAL_RZ_TOAST_BTN = PREFIX + "chat_real_rz_toast_btn";


    }

    public static class V700 {
        private static final String PREFIX = "v700_";

        //首页-附近页面访问量
        public static final String HOME_NEAR_TRENDS = PREFIX + "home_nears_trends";
        //首页-匹配页面访问量
        public static final String HOME_MATCH_ACCESS = PREFIX + "home_match_access";
        //首页-倒计时弹窗访问量
        public static final String HOME_COUNTDOWN_ACCESS = PREFIX + "home_countdown_access";
        //首页-倒计时弹窗-U币解锁按钮点击量
        public static final String HOME_COUNTDOWN_U_UNLOCK = PREFIX + "home_countdown_u_unlock";
        //匹配页面-面相匹配按钮点击量
        public static final String HOME_MATCH_FACE = PREFIX + "home_match_face";
        //匹配页面-每日匹配按钮点击量
        public static final String HOME_MATCH_DAY = PREFIX + "home_match_day";
        //匹配页面-情感课堂按钮点击量
        public static final String HOME_MATCH_EMOTION_CLASS = PREFIX + "home_match_emotion_class";
        //匹配页面-灵魂测试按钮点击量
        public static final String HOME_MATCH_SOUL_TEST = PREFIX + "home_match_soul_test";

        //附近动态-定位弹窗访问量
        public static final String HOME_NEAR_TRENDS_GPS_POP = PREFIX + "home_near_trends_gps_pop";
        //附近动态-定位弹窗-开启按钮点击量
        public static final String HOME_NEAR_TRENDS_GPS_SET_POP_DO = PREFIX + "home_near_trends_gps_set_pop_do";
        //附近动态-发布按钮点击量
        public static final String HOME_NEAR_TRENDS_RELEASE = PREFIX + "home_near_trends_release";
        //附近动态-查看动态按钮点击量
        public static final String HOME_NEAR_TRENDS_BTN = PREFIX + "home_near_trends_btn";
        //附近动态-私信按钮点击量
        public static final String HOME_NEAR_TRENDS_GO_CHAT_BTN = PREFIX + "home_near_trends_go_chat_btn";
        //话题详情-置顶按钮点击量
        public static final String TOPIC_DETAIL_SET_TOP_BTN = PREFIX + "topic_detail_set_top_btn";
        //话题详情-私信按钮点击量
        public static final String TOPIC_DETAIL_GO_CHAT_BTN = PREFIX + "topic_detail_go_chat_btn";
        //话题详情-参与话题按钮点击量
        public static final String TOPIC_DETAIL_JOIN_BTN = PREFIX + "topic_detail_join_btn";
        //视频详情-私信按钮点击量
        public static final String VIDEO_DETAIL_GO_CHAT_BTN = PREFIX + "video_detail_go_chat_btn";
        //动态详情-私信按钮点击量
        public static final String TREND_DETAIL_GO_CHAT_BTN = PREFIX + "trend_detail_go_chat_btn";
        //TA人主页-动态页面访问量 使用原来-Ta的动态
        //TA人主页-面相匹配点击量
        public static final String TA_DETAIL_MATCH_FACE_BTN = PREFIX + "ta_detail_match_face_btn";
        //TA人主页-私信点击量
        public static final String TA_DETAIL_GO_CHAT_BTN = PREFIX + "ta_detail_go_chat_btn";
        //TA人主页-信息页面访问量 使用原来- TA人主页
        //Ta人主页 Ta人主页-Hi按钮点击量
        public static final String TA_DETAIL_HI_BTN = PREFIX + "ta_detail_hi_btn";

        //面相匹配(H5) 面相匹配-面相匹配访问            facematch_count
        public static final String FACE_MATCH_COUNT = PREFIX + "face_match_count";
        //面相匹配(H5) 面相匹配-解锁弹窗访问量     facematch_unlock
        public static final String FACE_MATCH_UNLOCK = PREFIX + "face_match_unlock";
        //面相匹配(H5) 面相匹配-分享按钮点击量       facematch_share
        public static final String FACE_MATCH_SHARE = PREFIX + "face_match_share";
        //面相匹配(H5) 面相匹配-U币解锁按钮点击量        facematch_uunlock
        public static final String FACE_MATCH_U_UNLOCK = PREFIX + "face_match_u_unlock";
        //面相匹配(H5) 面相匹配-私信按钮点击量  facematch_message
        public static final String FACE_MATCH_MESSAGE = PREFIX + "face_match_message";
        //面相匹配(H5) 面相匹配访问量（站外）
        public static final String H5_FACE_MATCH_ACCESS = PREFIX + "h5_face_match_access";
        //面相匹配(H5) 面相匹配-注册弹窗访问量
        public static final String H5_FACE_MATCH_REGISTER = PREFIX + "h5_face_match_register";
        //面相匹配(H5) 面相匹配-性别弹窗访问量
        public static final String H5_FACE_MATCH_SEX_POP_ACCESS = PREFIX + "h5_face_match_sex_pop_access";
        //面相匹配(H5) 面相匹配-一键招呼按钮点击量
        public static final String H5_FACE_MATCH_ONE_CLICK_HI_BTN = PREFIX + "h5_face_match_one_click_hi_btn";
        //面相匹配(H5) 面相匹配-聊天按钮点击量
        public static final String H5_FACE_MATCH_CHAT = PREFIX + "h5_face_match_chat";
        //面相匹配(H5) 面相匹配-头像点击量
        public static final String H5_FACE_MATCH_HEADER_BTN = PREFIX + "h5_face_match_header_btn";

        //聊天界面-面相匹配按钮点击量
        public static final String CHAT_MATCH_FACE = PREFIX + "chat_match_face";
        //聊天界面-解锁Ta人礼物弹窗访问量
        public static final String CHAT_UNLOCK_TA_GIFT_POP = PREFIX + "chat_unlock_ta_gift_pop";
        //聊天界面-赠送礼物提醒按钮点击量
        public static final String CHAT_SEND_GIFT_TOAST_BTN = PREFIX + "chat_send_gift_toast_btn";
        //聊天界面-消息-领取免费试用按钮点击量
        public static final String CHAT_MSG_RECEIVE_FREE_TRIAL = PREFIX + "chat_msg_receive_free_trial";
        //聊天界面-解锁Ta人礼物弹窗-赠送礼物按钮点击量
        public static final String CHAT_UNLOCK_TA_GIFT_SEND_BTN = PREFIX + "chat_unlock_ta_gift_send_btn";
        //关闭资料-注销按钮点击量
        public static final String CLOSE_PROFILE_LOGOUT_BTN = PREFIX + "close_profile_logout_btn";
        //撤回注销弹窗访问量
        public static final String BACK_LOGOUT_POP_ACCESS = PREFIX + "back_logout_pop_access";
        //撤回注销弹窗-撤回按钮点击量
        public static final String BACK_LOGOUT_POP_ACCESS_BTN = PREFIX + "back_logout_pop_access_btn";

        //注销（H5）注销-选择原因页面访问量
        public static final String CLOSE_PROFILE_SELECT_REASON = PREFIX + "close_profile_select_reason";
        //注销（H5）注销-注意事项弹窗访问量
        public static final String CLOSE_PROFILE_MSG_POP = PREFIX + "close_profile_msg_pop";
        //注销（H5）注销-具体原因页面访问量
        public static final String CLOSE_PROFILE_MAST_REASON = PREFIX + "close_profile_mast_reason";
        //注销（H5）注销-回顾数据页面访问量
        public static final String CLOSE_PROFILE_REVIEW_ACCESS = PREFIX + "close_profile_review_access";
        //注销（H5）回顾数据-残忍离开按钮点击量
        public static final String CLOSE_PROFILE_JUST_GO_BTN = PREFIX + "close_profile_just_go_btn";
        //注销（H5）回顾数据-留下来按钮点击量
        public static final String CLOSE_PROFILE_STAY_BTN = PREFIX + "close_profile_stay_btn";
        //注销（H5）申请注销弹窗访问量
        public static final String CLOSE_PROFILE_APPLY_LOGOUT_POP = PREFIX + "close_profile_apply_logout_pop";

        //自动续费弹窗 自动续费弹窗访问量
        public static final String AUTO_RENEWAL_POP_ACCESS = PREFIX + "auto_renewal_pop_access";
        //自动续费弹窗 自动续费-立即点击量
        public static final String AUTO_RENEWAL_POP_DO_BTN = PREFIX + "auto_renewal_pop_do_btn";
        //更多（安卓）更多-关闭自动续费按钮点击量
        public static final String MORE_CLOSE_AUTO_RENEWAL_DO_BTN = PREFIX + "more_close_auto_renewal_do_btn";
        //更多（安卓）更多-开启自动续费按钮点击量
        public static final String MORE_OPEN_AUTO_RENEWAL_DO_BTN = PREFIX + "more_open_auto_renewal_do_btn";
        //我的 我的-领取免费试用按钮点击量
        public static final String ME_RECEIVE_FREE_TRIAL_BTN = PREFIX + "me_receive_free_trial_btn";
        //消息 消息-领取免费试用按钮点击量
        public static final String MSG_RECEIVE_FREE_TRIAL_BTN = PREFIX + "msg_receive_free_trial_btn";
        //系统通知-心动btn
        public static final String SYSTEM_TOAST_LIKE = PREFIX + "system_toast_like";
        //系统通知-访问点击量
        public static final String SYSTEM_TOAST_ACCESS = PREFIX + "system_toast_access";

    }

    public static class V710 {
        private static final String PREFIX = "v710_";

        //Ta人主页-帮我约Ta提醒窗点击量
        public static final String TA_PAGE_YUE_CLICK = PREFIX + "ta_page_yue_click";

        //聊天界面-帮我约Ta提醒窗点击量
        public static final String CHAT_PAGE_YUE_CLICK = PREFIX + "chat_page_yue_click";

        //社区-线下资源位点击量
        public static final String DYNAMIC_BG_VIEW_CLICK = PREFIX + "dynamic_bg_view_click";
    }

    public static class V720 {
        private static final String PREFIX = "v720_";

        //同城置顶-购买成功弹窗访问量
        public static final String TOP_UP_BUY_SUCCESS = PREFIX + "top_up_buy_success";

        //置顶购买成功弹窗-立即置顶btn
        public static final String TOP_UP_BUY_DO_SET = PREFIX + "top_up_buy_do_set";

        //加企微引导-弹窗访问
        public static final String WX_DRAINAGE_POP = PREFIX + "wx_drainage_pop";

        //加企微-选择联系方式-弹窗访问量
        public static final String WX_DRAINAGE_POP_CHOOSE_TYPE = PREFIX + "wx_drainage_pop_choose_type";

        //选择联系方式-电话
        public static final String WX_DRAINAGE_POP_PHONE = PREFIX + "wx_drainage_pop_phone";

        //选择联系方式-微信
        public static final String WX_DRAINAGE_POP_CHAT = PREFIX + "wx_drainage_pop_chat";

    }

    public static class V730 {
        private static final String PREFIX = "v730_";

        //匹配弹窗-语音匹配btn
        public static final String HOME_POP_VOICE_MATCH_BTN = PREFIX + "home_pop_voice_match_btn";
        //消息-语音匹配页面访问量
        public static final String MSG_ACCESS_MATCH_NUMBER = PREFIX + "msg_access_match_number";
        //聊天-语音按钮btn
        public static final String CHAT_VOICE_BTN = PREFIX + "chat_voice_btn";
        //语音弹窗显示次数
        public static final String POP_INVITE_VOICE_MATCH_NUMBER = PREFIX + "pop_invite_voice_match_number";
        //语音弹窗-同意btn
        public static final String POP_INVITE_VOICE_MATCH_AGREE = PREFIX + "pop_invite_voice_match_agree";
        //语音弹窗-拒绝btn
        public static final String POP_INVITE_VOICE_MATCH_REFUSE = PREFIX + "pop_invite_voice_match_refuse";
        //语音中-公开身份btn
        public static final String VOICE_MATCHING_OPEN_IDE_BTN = PREFIX + "voice_matching_open_ide_btn";
        //语音中-续时btn
        public static final String VOICE_MATCHING_BUY_TIME_BTN = PREFIX + "voice_matching_buy_time_btn";
        //语音结束-解锁btn
        public static final String VOICE_MATCH_END_UNLOCK_BTN = PREFIX + "voice_match_end_unlock_btn";
        //语音结束-继续匹配btn
        public static final String VOICE_MATCH_END_GO_MATCH_BTN = PREFIX + "voice_match_end_go_match_btn";
        //消息-语音匹配解锁btn
        public static final String MSG_VOICE_MATCH_UNLOCK_BTN = PREFIX + "msg_voice_match_unlock_btn";
        //加速卡-立即使用btn
        public static final String USE_ACCELERATOR_CARD_BTN = PREFIX + "use_accelerator_card_btn";
        //同城卡-立即使用btn
        public static final String USE_SAME_CITY_CARD_BTN = PREFIX + "use_same_city_card_btn";

    }


    public static class V740 {
        private static final String PREFIX = "v740_";

        //直播-热门列表访问量
        public static final String ACCESS_LIVE_HOT_NUM = PREFIX + "access_live_hot_num";
        //热门云相亲点击量
        public static final String CLICK_HOT_CLOUD_NUM = PREFIX + "click_hot_cloud_num";
        //热门1对1语音
        public static final String CLICK_HOT_ONE_TO_ONE_BTN = PREFIX + "click_hot_one_to_one_btn";
        //消息超级曝光点击
        public static final String MSG_SUPER_EXPOSURE_RECEIVE_BTN = PREFIX + "msg_super_exposure_receive_btn";
        //直播间宝箱Btn
        public static final String LIVE_BOX_BTN = PREFIX + "live_box_btn";
    }

    public static class V745 {
        private static final String PREFIX = "v745_";

        //聊天-资料卡btn
        public static final String MSG_CHAT_DATA_CARD_BTN = PREFIX + "msg_chat_data_card_btn";
        //聊天-开启系统通知弹窗访问量
        public static final String MSG_CHAT_OPEN_SYSTEM_NOTIFY_POP_ACCESS_NUM = PREFIX + "msg_chat_open_system_notify_pop_access_num";
        //开启通知弹窗-开启按钮btn
        public static final String MSG_CHAT_OPEN_SYSTEM_NOTIFY_POP_BTN = PREFIX + "msg_chat_open_system_notify_pop_btn";

        //注销-赠送会员弹窗访问量
        public static final String DESTORY_SEND_VIP_POP_ACCESS_NUM = PREFIX + "destory_send_vip_pop_access_num";
        //注销-加入白名单弹窗访问量
        public static final String DESTORY_ADD_WHITELIST_POP_ACCESS_NUM = PREFIX + "destory_add_whitelist_pop_access_num";

        //注销-赠送会员弹窗-领取按钮btn
        public static final String DESTORY_SEND_VIP_POP_RECEIVE_BTN = PREFIX + "destory_send_vip_pop_receive_btn";
        //注销-赠送会员弹窗-不了按钮btn
        public static final String DESTORY_SEND_VIP_POP_NO_RECEIVE_BTN = PREFIX + "destory_send_vip_pop_no_receive_btn";

        //注销-加入白名单弹窗-加入按钮btn
        public static final String DESTORY_ADD_WHITELIST_POP_ADD_BTN = PREFIX + "destory_add_whitelist_pop_add_btn";
        //注销-加入白名单弹窗-不了按钮btn
        public static final String DESTORY_ADD_WHITELIST_POP_NO_ADD_BTN = PREFIX + "destory_add_whitelist_pop_no_add_btn";

        //关闭资料-赠送会员弹窗访问量
        public static final String CLOSE_DATA_CARD_SEND_VIP_POP_ACCESS_NUM = PREFIX + "close_data_card_send_vip_pop_access_num";
        //关闭资料-加入白名单弹窗访问量
        public static final String CLOSE_DATA_CARD_ADD_WHITELIST_POP_ACCESS_NUM = PREFIX + "close_data_card_add_whitelist_pop_access_num";

        //关闭资料-赠送会员弹窗-领取按钮btn
        public static final String CLOSE_SEND_VIP_POP_RECEIVE_BTN = PREFIX + "close_send_vip_pop_receive_btn";
        //关闭资料-赠送会员弹窗-不了按钮btn
        public static final String CLOSE_SEND_VIP_POP_NO_RECEIVE_BTN = PREFIX + "close_send_vip_pop_no_receive_btn";

        //关闭资料-加入白名单弹窗-加入按钮btn
        public static final String CLOSE_ADD_WHITELIST_POP_ADD_BTN = PREFIX + "close_add_whitelist_pop_add_btn";
        //关闭资料-加入白名单弹窗-不了按钮btn
        public static final String CLOSE_ADD_WHITELIST_POP_NO_ADD_BTN = PREFIX + "close_add_whitelist_pop_no_add_btn";

    }


    public static class V755 {
        private static final String PREFIX = "v755_";

        //消息-完善资料按钮点击量
        public static final String MSG_COMPLETE_DATA_CLICK = PREFIX + "msg_complete_data_click";

        //赠送会员弹窗访问量
        public static final String GIVE_VIP_DIALOG = PREFIX + "give_vip_dialog";

        //完善资料弹窗-上传头像按钮点击量
        public static final String COMPLETE_DATA_UPLOAD_HEAD = PREFIX + "complete_data_upload_head";

        //完善资料弹窗-添加相册按钮点击量
        public static final String COMPLETE_DATA_ADD_PIC = PREFIX + "complete_data_add_pic";

        //完善资料弹窗-完善资料按钮点击量
        public static final String COMPLETE_DATA_BASIC_DATA = PREFIX + "complete_data_basic_data";

        //完善资料弹窗-制定恋爱标准按钮点击量
        public static final String COMPLETE_DATA_LOVE_CONDITION = PREFIX + "complete_data_love_condition";

        //任务弹窗访问量
        public static final String TASK_COMPLETED_DIALOG_SHOW_COUNT=PREFIX+"task_completed_dialog_show_count";
        //任务弹窗-直接领取按钮点击量
        public static final String TASK_COMPLETED_DIALOG_GETBTN_CLICK_COUNT=PREFIX+"task_completed_dialog_getbtn_click_count";
        //任务弹窗-领取更多按钮点击量
        public static final String TASK_COMPLETED_DIALOG_GETMOREBTN_CLICK_COUNT=PREFIX+"task_completed_dialog_getmorebtn_click_count";
    }

    public static class MU {
        private static final String PREFIX = "mu_";

        public static final String TEST = PREFIX + "test";
    }

    public static void onEvent(Context context, String eventName) {
        MobclickAgent.onEvent(context, eventName);
    }
}