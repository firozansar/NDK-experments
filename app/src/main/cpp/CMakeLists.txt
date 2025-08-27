cmake_minimum_required(VERSION 3.22.1)

project("NDK-experments")

add_library(native-lib SHARED
            native-lib.cpp)

target_link_libraries(native-lib
                      android
                      log)


