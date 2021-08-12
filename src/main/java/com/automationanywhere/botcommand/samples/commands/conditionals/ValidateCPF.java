/*
 * Copyright (c) 2020 Automation Anywhere.
 * All rights reserved.
 *
 * This software is the proprietary information of Automation Anywhere.
 * You shall use it only in accordance with the terms of the license agreement
 * you entered into with Automation Anywhere.
 */

/**
 *
 */
package com.automationanywhere.botcommand.samples.commands.conditionals;

import com.automationanywhere.botcommand.exception.BotCommandException;
import com.automationanywhere.botcommand.samples.commands.uteis.ValidaCPF;
import com.automationanywhere.commandsdk.annotations.*;
import com.automationanywhere.commandsdk.annotations.rules.NotEmpty;
import com.automationanywhere.commandsdk.model.AttributeType;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import static com.automationanywhere.commandsdk.annotations.BotCommand.CommandType.Condition;
import static com.automationanywhere.commandsdk.model.AttributeType.*;
import static com.automationanywhere.commandsdk.model.DataType.STRING;

@BotCommand(commandType = Condition)
@CommandPkg(
        label = "ValidateCPF",
        name = "ValidateCPF",
        description = "verifica se é um CPF válido",
        node_label = "{{cpf}} é valido?"
)
public class ValidateCPF {

    @ConditionTest
    public Boolean validate(
            @Idx(index = "1", type = TEXT)
            @Pkg(label = "CPF:",description = "123456789")
            @NotEmpty
                    String cpf
    ) {
        String newCpf="";
        for(char c: cpf.toCharArray()){
            if("0123456789".indexOf(c) != -1){
                newCpf += c;
                //throw new BotCommandException("o caracter '"+c+"' nao é valido");
            }
        }

        return ValidaCPF.isCPF(newCpf);
    }

}
