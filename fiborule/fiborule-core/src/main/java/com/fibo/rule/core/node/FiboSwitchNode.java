package com.fibo.rule.core.node;

import java.util.Map;

/**
 * <p>IF节点抽象类</p>
 *
 * @author JPX
 * @since 2022-11-18 10:42
 */
public abstract class FiboSwitchNode extends FiboNode {

    @Override
    public void runnerStep(String nodeCode) {
        String result = this.runnerStepSwitch();
        //将结果放到参数池中
        this.getContext().setSwitchResult(nodeCode, result);
    }

    public abstract String runnerStepSwitch();

    public abstract Map<String, String> switchBranchs();

}
