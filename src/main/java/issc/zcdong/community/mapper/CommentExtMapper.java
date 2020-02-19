package issc.zcdong.community.mapper;

import issc.zcdong.community.model.Comment;
import issc.zcdong.community.model.CommentExample;
import issc.zcdong.community.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}