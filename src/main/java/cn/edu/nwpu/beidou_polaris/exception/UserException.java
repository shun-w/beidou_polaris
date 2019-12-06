package cn.edu.nwpu.beidou_polaris.exception;

public class UserException extends Exception{
    private String message;

    public UserException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
