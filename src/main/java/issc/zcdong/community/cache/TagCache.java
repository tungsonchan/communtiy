package issc.zcdong.community.cache;

import issc.zcdong.community.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TagCache {
    public static List<TagDTO> get() {
        List<TagDTO> tagDTOs = new ArrayList<>();

        TagDTO front = new TagDTO();
        front.setCategoryName("前端");
        front.setTags(Arrays.asList("javascript","vue.js","css","html","html5","node.js","react.js","jquery","css3","es6","typescript","chrome","npm","bootstrap","sass","less","chrome-devtools","firefox","angular","coffeescript","safari","postcss","postman","fiddler","webkit","yarn","firebug","edge"));
        tagDTOs.add(front);

        TagDTO rear = new TagDTO();
        rear.setCategoryName("后端");
        rear.setTags(Arrays.asList("php","java","node.js","python","c++","c","golang","spring","django","springboot","flask","c#","swoole","ruby","asp.net","ruby-on-rails","scala","rust","lavarel","爬虫"));
        tagDTOs.add(rear);

        TagDTO db = new TagDTO();
        db.setCategoryName("数据库");
        db.setTags(Arrays.asList("mysql","redis","mongodb","sql","数据库","json","elasticsearch","nosql","memcached","postgresql","sqlite","mariadb"));
        tagDTOs.add(db);

        TagDTO ai = new TagDTO();
        ai.setCategoryName("人工智能");
        ai.setTags(Arrays.asList("算法","机器学习","人工智能","深度学习","数据挖掘","tensorflow","神经网络","图像识别","人脸识别","自然语言处理","机器人","pytorch","自动驾驶"));
        tagDTOs.add(ai);
        return tagDTOs;
    }

    public static String filterInvalid(String tags) {
        String[] split = StringUtils.split(tags, ",");
        List<TagDTO> tagDTOS = get();
        List<String> tagList = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> !tagList.contains(t)).collect(Collectors.joining(","));
        return invalid;
    }
}
