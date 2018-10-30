/**
 *
 * @author zacconding
 * @Date 2018-10-30
 * @GitHub : https://github.com/zacscoding
 */
class FileIO {
    static void main(String[] args) {
        // readFile()
        // readFile2()
        // writeFile()
        // displaySize()
        // checkDirectory()
        // deleteFile()
        // copyFile()
        displayDirectoryContents()
    }

    static void readFile() {
        new File("F:\\test.txt").eachLine {
            line -> println "line : $line"
        }
//        result
//        line : test line 1
//        line : test line 2
//        line : test line 3
    }

    static void readFile2() {
        File file = new File("F:\\test.txt")
        println file.text
    }

    static void writeFile() {
        new File("F:\\test2.txt").withWriter('utf-8') {
            writer -> writer.writeLine "Hello world"
        }
    }

    static void displaySize() {
        File file = new File("F:\\test.txt")
        println "The file ${file.absolutePath} has ${file.length()} bytes"
        // result
        // The file F:\test.txt has 37 bytes
    }

    static void checkDirectory() {
        def file = new File("F:/")
        println "is file ? ${file.isFile()}"
        println "is directory ? ${file.isDirectory()}"
//        result
//        is file ? false
//        is directory ? true
    }

    static void deleteFile() {
        def file = new File("F:\\test2.txt")
        file.delete()
    }

    static void copyFile() {
        def src = new File("F:\\test.txt")
        def dest = new File("F:\\test2.txt")

        dest << src.text
    }

    static void displayDirectoryContents() {
        def rootFiles = new File("F:\\temp").listRoots()
        rootFiles.each {
            file -> println file.absolutePath
        }

    }
}