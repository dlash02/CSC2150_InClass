public class Command {
    private String cmd;
    private String cmdStr;  // ls -ltr

    public Command(String cmd, String cmdStr) {
        this.cmd = cmd;
        this.cmdStr = cmdStr;
    }
    public String getCmd() {
        return cmd;
    }
    public String getCmdStr() {
        return cmdStr;
    }

    @Override
    public String toString() {
        return "Command{" +
                "cmd='" + cmd + '\'' +
                ", cmdStr='" + cmdStr + '\'' +
                '}';
    }
}
