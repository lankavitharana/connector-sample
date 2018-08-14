/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.sample.con.print;

import org.ballerinalang.bre.Context;
import org.ballerinalang.bre.bvm.BlockingNativeCallableUnit;
import org.ballerinalang.model.types.TypeKind;
import org.ballerinalang.model.values.BBoolean;
import org.ballerinalang.natives.annotations.Argument;
import org.ballerinalang.natives.annotations.BallerinaFunction;
import org.ballerinalang.natives.annotations.Receiver;
import org.ballerinalang.natives.annotations.ReturnType;

/**
 * {@code BatchInsert} action to insert multiple documents into a collection.
 *
 * @since 0.5.4
 */
@BallerinaFunction(
            orgName = "wso2",
            packageName = "samplecon:0.0.0",
            functionName = "printText",
            receiver = @Receiver(type = TypeKind.OBJECT, structType = "CallerActions"),
            args = {@Argument(name = "text", type = TypeKind.STRING)},
            returnType = { @ReturnType(type = TypeKind.BOOLEAN) }
        )
public class PrintText extends BlockingNativeCallableUnit {

    @Override
    public void execute(Context context) {
        System.out.println("**** Action printText called ****");
        String text = context.getStringArgument(0);
        System.out.println("**** " + text + " ****");
        BBoolean result = new BBoolean(true);

        context.setReturnValues(result);

    }
}
