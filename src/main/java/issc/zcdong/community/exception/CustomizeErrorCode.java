package issc.zcdong.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode{

    QUESTION_NOT_FOUND("你找的问题不在了，要不换一个试试？", 2001),
    TARGET_PARAM_NOT_FOUND("未选中任何问题或评论进行回复", 2002),
    NOT_LOGIN("当前操作需要登录，请登录后重试！", 2003),
    SYS_ERROR("服务冒烟了，稍后再试试", 2004),
    TYPE_PARAM_WRONG("评论类型错误或不存在",2005),
    COMMENT_NOT_FOUND("回复的评论不存在，要不换一个试试？",2006),
    CONTENT_IS_EMPTY("回复的内容不能为空",2007),
    READ_NOTIFICATION_FAIL("这不是你的信息",2008),
    NOTIFICATION_NOT_FOUND("信息不见了",2009),
    FILE_UPLOAD_FAIL("图片上传失败",2010)
    ;

    @Override
    public String getMessage() {

        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;


    CustomizeErrorCode(String message, Integer code) {
        this.message = message;
        this.code = code;
    }
}
