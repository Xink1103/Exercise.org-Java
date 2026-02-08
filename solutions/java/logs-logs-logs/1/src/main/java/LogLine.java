public class LogLine {

    private String logLine;
    
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String logLevel = "";
        int index1 = logLine.indexOf("[");
        int index2 = logLine.indexOf("]");
        logLevel = logLine.substring(index1 + 1 , index2);
        
        switch (logLevel){
            case "TRC" :
                return LogLevel.TRACE;
            case "DBG" :
                return LogLevel.DEBUG;
            case "INF" :
                return LogLevel.INFO;
            case "WRN" :
                return LogLevel.WARNING;
            case "ERR" :
                return LogLevel.ERROR;
            case "FTL" :
                return LogLevel.FATAL;
            default :
               return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        String shortLog = "";
        int index = logLine.indexOf(":");
        
        shortLog = ":" + logLine.substring(index+1).trim();
        
        switch(getLogLevel()){
            case TRACE :
                return "1"+shortLog;
            case DEBUG :
                return "2"+shortLog;
            case INFO :
                return "4"+shortLog;
            case WARNING :
                return "5"+shortLog;
            case ERROR :
                return "6"+shortLog;
            case FATAL :
                return "42"+shortLog;
            default :
                return "0"+shortLog;
        }
    }
}
