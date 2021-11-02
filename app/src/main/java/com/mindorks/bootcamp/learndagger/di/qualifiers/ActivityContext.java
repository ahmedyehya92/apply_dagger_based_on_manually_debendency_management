package com.mindorks.bootcamp.learndagger.di.qualifiers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/2/21
 *****/
@Qualifier
@Retention(RetentionPolicy.SOURCE)
public @interface ActivityContext {
}
