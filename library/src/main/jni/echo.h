//
// Created by plucky on 2018/7/29.
//
#include "jni_util.h"

#ifndef JNIAPP_ECHO_H
#define JNIAPP_ECHO_H
#endif //JNIAPP_ECHO_H

#define VERCODE 100
#define VERNAME "1.0.0"

/*
 * Class:     engineer_echo_jnilib
 * Method:    vercode
 * Signature: int;
 */
extern "C" JNIEXPORT jint JNICALL Java_engineer_echo_jnilib_Echo_vercode
        (JNIEnv *, jclass);
