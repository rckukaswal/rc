const container = document.getElementById("program-list");

fetch("./data/programs.json?t=" + new Date().getTime())
  .then(res => res.json())
  .then(programs => {
    programs.forEach(prog => {
      const card = document.createElement("div");
      card.className = "program-card";

      card.innerHTML = `
        <h3>${prog.title}</h3>
        <p><b>Language:</b> ${prog.language}</p>
        <p><b>Category:</b> ${prog.category}</p>
        <pre id="code-${prog.title.replace(/\s+/g, '')}">Loading...</pre>
      `;

      container.appendChild(card);

      fetch(prog.file + "?t=" + new Date().getTime())
        .then(res => res.text())
        .then(code => {
          document.getElementById(`code-${prog.title.replace(/\s+/g, '')}`).textContent = code;
        });
    });
  });
