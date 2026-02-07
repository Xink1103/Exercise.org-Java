public class LogLevels {
    
    public static String message(String logLine) {
        int index = logLine.indexOf(":");
        return logLine.substring(index + 1).trim();
    }

    public static String logLevel(String logLine) {
        int index = logLine.indexOf(":");
        return logLine.substring(1,index-1).toLowerCase();
    }

    public static String reformat(String logLine) {
        String answer = "";
        answer = answer.concat( message(logLine) ).concat(" (").concat( logLevel(logLine) ).concat(") ").trim();
        return answer;  
    }
}
