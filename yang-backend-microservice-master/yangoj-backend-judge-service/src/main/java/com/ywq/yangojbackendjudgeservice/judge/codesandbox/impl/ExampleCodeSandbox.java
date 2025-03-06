package com.ywq.yangojbackendjudgeservice.judge.codesandbox.impl;

import com.ywq.yangojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.ywq.yangojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.ywq.yangojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import com.ywq.yangojbackendmodel.model.codesandbox.JudgeInfo;
import com.ywq.yangojbackendmodel.model.enums.JudgeInfoMessageEnum;
import com.ywq.yangojbackendmodel.model.enums.QuestionSubmitStatusEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 示例代码沙箱（仅为了跑通业务流程）
 */
@Slf4j
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
