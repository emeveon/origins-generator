import JSZip from 'jszip'
import { saveAs } from 'file-saver'

const makeDatapack = (origin) => {
    var zip = new JSZip()
    
    zip.file("hello.txt", "Hello world\n")

    zip.file("test.json", `{"contents": "test contents"}`)

    zip.generateAsync({type:"blob"}).then(function(content) {
        saveAs(content, "test.zip")
    })
}

export {makeDatapack}
