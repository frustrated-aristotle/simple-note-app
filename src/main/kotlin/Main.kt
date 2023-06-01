fun main(args: Array<String>) {
    val notepad = hashMapOf<String, ArrayList<String>>()

    var firstNote = ArrayList<String>()
    firstNote.add("Take A Note")
    notepad.put("NotePad1", firstNote)

    println("Welcome! Your notepads are: " + notepad.keys)

    println("Please write the name of the notepad you want")
    var notepadName = readLine()
    var strNotePadName : String = notepadName.toString()

    println("It is time to write your note!")



    var notes = ArrayList<String>();
    var note = readLine()
    notes.add(note.toString())
    notepad.put(strNotePadName, notes)

    println("There is your note from ${notepadName}")
    println(notepad[notepadName])
}