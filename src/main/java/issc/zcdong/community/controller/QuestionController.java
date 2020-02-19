package issc.zcdong.community.controller;

import issc.zcdong.community.dto.CommentDTO;
import issc.zcdong.community.dto.QuestionDTO;
import issc.zcdong.community.enums.CommentTypeEnum;
import issc.zcdong.community.service.CommentService;
import issc.zcdong.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private CommentService commentService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Long id, Model model) {
        QuestionDTO questionDTO = questionService.getById(id);
        List<QuestionDTO> relatedQuestions = questionService.selectRelated(questionDTO);
        List<CommentDTO> comments = commentService.listByTargetId(id, CommentTypeEnum.QUESTION);

        //累加阅读数
        questionService.incView(id);
        model.addAttribute("question", questionDTO);

        //评论传回前端
        model.addAttribute("comments", comments);

        model.addAttribute("relatedQuestions", relatedQuestions);
        return "question";
    }
}
