cmake_minimum_required(VERSION 3.4.1)

include_directories(src/main/jni)
# 查找所有源码 并拼接到路径列表
aux_source_directory(src/main/jni SRC_LIST)

set(SRC_DIR src/main/jni)
# 设置jni编译文件so输出目录
set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${PROJECT_SOURCE_DIR}/build/jniLibs/${ANDROID_ABI})

add_library(
        # Sets the name of the library.
        MagicJni

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).

        src/main/jni/bitmap/Conversion.cpp
        src/main/jni/bitmap/BitmapOperation.cpp
        src/main/jni/beautify/MagicBeautify.cpp
        src/main/jni/MagicJni.cpp )

find_library(
        # Sets the name of the path variable.
        log-lib

        # Specifies the name of the NDK library that
        # you want CMake to locate.
        log)


target_link_libraries(
        # Specifies the target library.
        MagicJni

        # Links the target library to the log library
        # included in the NDK.
        ${log-lib}
        jnigraphics)