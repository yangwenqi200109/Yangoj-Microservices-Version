package com.ywq.yangojbackendjudgeservice.judge.codesandbox;

import com.ywq.yangojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.ywq.yangojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
