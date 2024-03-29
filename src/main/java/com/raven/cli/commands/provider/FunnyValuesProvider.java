package com.raven.cli.commands.provider;

import org.springframework.core.MethodParameter;
import org.springframework.shell.CompletionContext;
import org.springframework.shell.CompletionProposal;
import org.springframework.shell.standard.ValueProviderSupport;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: bbpatience
 * @date: 2019/11/22
 * @description: FunnyValuesProvider
 **/
@Component
public class FunnyValuesProvider extends ValueProviderSupport {

    private final static String[] VALUES = new String[] {
        "hello world",
        "I'm quoting \"The Daily Mail\"",
        "10 \\ 3 = 3"
    };

    @Override
    public List<CompletionProposal> complete(MethodParameter parameter, CompletionContext completionContext, String[] hints) {
        return Arrays.stream(VALUES).map(CompletionProposal::new).collect(Collectors.toList());
    }
}
