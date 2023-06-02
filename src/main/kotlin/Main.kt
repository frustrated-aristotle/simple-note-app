//We will use all loops and statements
val notepad = hashMapOf<String, ArrayList<String>>()
var firstNote = ArrayList<String>()

var firstSelection : Int = 0

var hasChoiceMade : Boolean = false

fun main(args: Array<String>) {


    MakeFirstNotePadAndNote()
    StartingScene()
}
fun MakeFirstNotePadAndNote()
{
    firstNote.add("Take A Note")
    notepad.put("NotePad1", firstNote)
    ShowNotepads()
}
fun ShowNotepads() {
    notepad.keys.forEach(){
        println(it)
    }
}
fun StartingScene()
{
    ShowNotepads()
    while (!hasChoiceMade)
    {
        println("Welcome! Your notepads are: " + notepad.keys)
        println("To create a new\n-Notepad: 1\n-Note:2\n-and take a look at your notes : 3")
        TakeInput()
    }
    when(firstSelection)
    {
        1 -> CreateANewNotepad()
        2 -> WriteANote()
        3 -> ShowNotes()
    }

}
fun TakeInput()
{
    val input = readLine()
    val readInput = input?.toIntOrNull()
    if (readInput != null && readInput > 0 && readInput < 4)
    {
        firstSelection = readInput
        println("Choice made: ${firstSelection}")
        hasChoiceMade = true
    }
    else
    {
        println("Please type just 1 or 2")
    }
}

fun CreateANewNotepad()
{
    println("Give your new notepad a name: ")
    var inputName = readLine()
    //We wont let the user to write his first note
    //in creating state
    //Instead we will give it a base note.
    //val notepad = hashMapOf<String, ArrayList<String>>()
    var notes = ArrayList<String>()
    notes.add("Base Note...")
    notepad.put(inputName.toString(), notes)
    hasChoiceMade = false;
    StartingScene()
}
fun WriteANote() {
    println("Please write the name of the notepad you want")
    var notepadName = readLine()

    println("It is time to write your note!")
    var note = readLine()

    notepad[notepadName]?.add(note.toString())

    println("There is your note from ${notepadName}")
    println(notepad[notepadName])
    hasChoiceMade = false
    StartingScene()
}

fun ShowNotes()
{
    //take the name of notepad
    //show all values of the key
    println("Which notepad do you want to see its notes?")
    var input = readLine().toString()

    println("Your notes are: \n" + notepad[input])
}

























