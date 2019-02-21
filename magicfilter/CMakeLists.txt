cmake_minimum_required(VERSION 3.4.1)
set(SRC_DIR src/main/jni)
include_directories(src/main/jni)
# 查找所有源码 并拼接到路径列表
aux_source_directory(src/main/jni SRC_LIST)
# 设置jni编译文件so输出目录
set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${PROJECT_SOURCE_DIR}/build/jniLibs/${ANDROID_ABI})
# 编译MagicJni.cpp并生成MagicJni.so
add_library(MagicJni SHARED src/main/jni/MagicJni.cpp ${SRC_LIST})
# 找到预编译库 log_lib
find_library(log-lib log)
# link到我们的动态库 native-lib中
target_link_libraries(MagicJni ${log-lib})