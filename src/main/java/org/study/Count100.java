package org.study;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // 실행시 감지할 수 있는 어노테이션
public @interface Count100 {
}
