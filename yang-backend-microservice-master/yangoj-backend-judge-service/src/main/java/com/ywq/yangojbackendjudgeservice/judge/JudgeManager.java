package com.ywq.yangojbackendjudgeservice.judge;

import com.ywq.yangojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.ywq.yangojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.ywq.yangojbackendjudgeservice.judge.strategy.JudgeContext;
import com.ywq.yangojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.ywq.yangojbackendmodel.model.codesandbox.JudgeInfo;
import com.ywq.yangojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
