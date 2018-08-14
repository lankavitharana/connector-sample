
public type Client object {
    private ClientEndpointConfiguration clientEndpointConfig;
    private CallerActions callerActions;

    public function init(ClientEndpointConfiguration config) {
        self.callerActions = new CallerActions();
    }

    public function getCallerActions() returns CallerActions {
        return self.callerActions;
    }

    public function stop() {
        //anything needs to happen when endpoint stops
    }
};

public type CallerActions object {

    public extern function printText(string text) returns boolean;
};

public type ClientEndpointConfiguration record {
    string host,
    int port,
};
