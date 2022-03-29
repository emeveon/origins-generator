package data

import java.util.ArrayDeque
import java.io.FileOutputStream
import java.io.File
import java.io.FileInputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

class Origin(
    val name: String
) {
    companion object {
        fun downloadDatapack() {
            val str = "example.txt"
            val fos = FileOutputStream("datapack.zip")
            val zipOut = ZipOutputStream(fos)
            val fileToZip = File(str)
            val fileInputStream = FileInputStream(fileToZip)
            val zipEntry = ZipEntry(fileToZip.name)
            zipOut.putNextEntry(zipEntry)

            val bytes : ByteArray = ByteArray(1024)
            var length = fileInputStream.read()
            while (length >= 0) {
                zipOut.write(bytes, 0, length)
                length = fileInputStream.read()
            }

            zipOut.close()
            fileInputStream.close()
            fos.close()
        }
    }
    val datapack = File("test.text")
}
