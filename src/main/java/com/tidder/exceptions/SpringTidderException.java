package com.tidder.exceptions;

public class SpringTidderException extends RuntimeException {

    public SpringTidderException(String exceptionMessage, Exception exception) {

        super(exceptionMessage, exception);

    }

    public SpringTidderException(String exceptionMessage) {

        super(exceptionMessage);

    }

}
