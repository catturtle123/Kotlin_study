package com.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    // throws 가 없어짐
    // kotlin은 모두 UnCheckedException으로 됨.
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    // try with resources 대신 use라는 inline 함수를 사용함.
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use {
            reader -> println(reader.readLine())
        }
    }
}