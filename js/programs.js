const container = document.getElementById("programs-container");
container.innerHTML = "Loading...";

fetch("data/programs.json?t=" + Date.now(), { cache: "no-store" })
  .then(res => res.json())
  .then(data => {
    container.innerHTML = ""; // Clear Loading

    data.forEach(program => {
      const div = document.createElement("div");
      div.className = "program-card";
      div.innerHTML = `
        <h3>${program.title}</h3>
        <p><b>Language:</b> ${program.language}</p>
        <p><b>Category:</b> ${program.category}</p>
        <pre><code>${program.file}</code></pre>
      `;
      container.appendChild(div);
    });
  })
  .catch(err => {
    container.innerText = "Error loading programs: " + err.message;
  });
