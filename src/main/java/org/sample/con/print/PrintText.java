package org.sample.con.print;

import org.ballerinalang.bre.Context;
import org.ballerinalang.connector.api.AbstractNativeAction;
import org.ballerinalang.connector.api.ConnectorFuture;
import org.ballerinalang.model.types.TypeKind;
import org.ballerinalang.model.values.BBoolean;
import org.ballerinalang.nativeimpl.actions.ClientConnectorFuture;
import org.ballerinalang.natives.annotations.Argument;
import org.ballerinalang.natives.annotations.BallerinaAction;
import org.ballerinalang.natives.annotations.ReturnType;

@BallerinaAction(
        packageName = "sample.con.print",
        actionName = "printText",
        connectorName = "PrintConnector",
        args = {
                @Argument(name = "text",
                        type = TypeKind.STRING)
        },
        returnType = {
                @ReturnType(type = TypeKind.BOOLEAN)
        }
)
public class PrintText extends AbstractNativeAction {

    @Override
    public ConnectorFuture execute(Context context) {
        ClientConnectorFuture future = new ClientConnectorFuture();
        //Implement your logic here
        System.out.println("**** Action printText called ****");
        String text = getStringArgument(context, 0);
        System.out.println("**** " + text + " ****");
        BBoolean result = new BBoolean(true);
        future.notifyReply(result);
        return future;
    }
}
