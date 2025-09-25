const notesList = document.getElementById("notes-list");

fetch("./data/notes.json?t=" + new Date().getTime())
  .then(res => res.json())
  .then(notes => {
    notes.forEach(note => {
      const li = document.createElement("li");
      li.textContent = note.text;
      notesList.appendChild(li);
    });
  });
