//
// Created by plucky on 2018/7/29.
//

#include "echo.h"

extern "C" JNIEXPORT jint JNICALL Java_engineer_echo_jnilib_Echo_vercode
        (JNIEnv *, jclass) {
    return VERCODE;
}