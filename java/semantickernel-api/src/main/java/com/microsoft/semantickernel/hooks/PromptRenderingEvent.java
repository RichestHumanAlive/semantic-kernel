package com.microsoft.semantickernel.hooks;

import com.microsoft.semantickernel.orchestration.KernelFunction;
import com.microsoft.semantickernel.orchestration.contextvariables.KernelArguments;

public class PromptRenderingEvent implements KernelHookEvent {

    private final KernelFunction function;
    private final KernelArguments arguments;

    public PromptRenderingEvent(KernelFunction function, KernelArguments arguments) {
        this.function = function;
        this.arguments = arguments;
    }

    public KernelFunction getFunction() {
        return function;
    }

    public KernelArguments getArguments() {
        return arguments;
    }
}
