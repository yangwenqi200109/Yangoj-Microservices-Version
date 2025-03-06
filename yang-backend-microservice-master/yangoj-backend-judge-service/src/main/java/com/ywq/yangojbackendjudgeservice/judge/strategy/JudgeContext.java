package com.ywq.yangojbackendjudgeservice.judge.strategy;

import com.ywq.yangojbackendmodel.model.codesandbox.JudgeInfo;
import com.ywq.yangojbackendmodel.model.dto.question.JudgeCase;
import com.ywq.yangojbackendmodel.model.entity.Question;
import com.ywq.yangojbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
