package cn.tycoding.exception;

/**
 * 秒杀关闭异常
 * @auther shihaoluoling
 * @date 2019/10/8
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
