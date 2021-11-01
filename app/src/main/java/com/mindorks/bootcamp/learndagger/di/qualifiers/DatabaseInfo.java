package com.mindorks.bootcamp.learndagger.di.qualifiers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
import javax.inject.Scope;

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/1/21
 *****/
@Qualifier
@Retention(RetentionPolicy.SOURCE)
public @interface DatabaseInfo {
}
