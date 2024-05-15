var menuItem = document.querySelectorAll('.item-menu')

function selectLink(){
    menuItem.forEach((item)=>
        item.classList.remove('ativo')
    )
    this.classList.add('ativo')
}

menuItem.forEach((item)=>
    item.addEventListener('click', selectLink)
)

//Expandir o menu lateral

var btnExp = document.querySelector('#btn-exp')
var menuSide = document.querySelector('.menu-lateral')

btnExp.addEventListener('click', function(){
    menuSide.classList.toggle('expandir')
})

//Agentes

// substituir por uma chamada à API
const agentsData = [
    { name: "Jett", imageUrl: "img/jett-valorant.jpg", info: "Descrição do Jett." },
    { name: "Phoenix", imageUrl: "phoenix.jpg", info: "Descrição do Phoenix." },
    { name: "Phoenix", imageUrl: "phoenix.jpg", info: "Descrição do Phoenix." },
    { name: "Phoenix", imageUrl: "phoenix.jpg", info: "Descrição do Phoenix." },
    { name: "Phoenix", imageUrl: "phoenix.jpg", info: "Descrição do Phoenix." },
  ];
  
  // Função para criar os cards dos agentes
  function createAgentCards() {
    const container = document.getElementById("agents-container");
  
    agentsData.forEach(agent => {
      const card = document.createElement("div");
      card.classList.add("card");
      card.innerHTML = `<img src="${agent.imageUrl}" alt="${agent.name}">`;
      card.addEventListener("click", () => displayAgentInfo(agent));
      container.appendChild(card);
    });
  }
  
  // Função para exibir informações do agente ao clicar no card
  function displayAgentInfo(agent) {
    const modal = document.getElementById("agent-info-modal");
    const modalContent = document.getElementById("agent-info");
    const closeModal = document.querySelector(".close");
  
    modalContent.innerHTML = `<h2>${agent.name}</h2><p>${agent.info}</p>`;
    modal.style.display = "block";
  
    closeModal.addEventListener("click", () => {
      modal.style.display = "none";
    });
  
    window.addEventListener("click", (event) => {
      if (event.target == modal) {
        modal.style.display = "none";
      }
    });
  }
  
  // Inicializa a criação dos cards ao carregar a página
  window.onload = createAgentCards;
  